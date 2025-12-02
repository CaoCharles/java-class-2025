import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;

public class ParallelDemo01 {
    public static void main(String[] args) {

        // ThreadName -> List of integers
        Map<String, List<Integer>> map = new ConcurrentHashMap<>();

        IntStream.rangeClosed(1, 96)
                .parallel()
                .forEach(n -> {
                    String thread = Thread.currentThread().getName();

                    map.computeIfAbsent(thread, k -> Collections.synchronizedList(new ArrayList<>()))
                            .add(n);
                });

        // 印出矩陣（每個 thread 處理哪些數字）
        map.forEach((thread, nums) -> {
            Collections.sort(nums); // 排序一下比較好讀
            System.out.println(thread + " → " + nums);
        });
    }
}
