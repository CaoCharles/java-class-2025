import java.util.HashMap;

public class HashMapD01 {
    public static void main(String[] args){
        HashMap<Integer, String> data = new HashMap<>();

        data.put(5, "hello");

        String s = data.get(6);
        if (s != null) {
            System.out.println("data: " + s);
        }
        else {
            System.out.println("no data");
        }

    }
}
