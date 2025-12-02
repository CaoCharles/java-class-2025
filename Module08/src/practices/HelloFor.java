package practices;

public class HelloFor {
    public static void main(String[] args) {
        int total = 0;

        // 使用for迴圈執行1+2+3...+9+10
        for (int i = 0; i < 10; i++) {
            total += i+1;
        }

        System.out.println(total);
    }
}
