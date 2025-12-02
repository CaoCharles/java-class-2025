package practices;

public class HelloWhile {
    public static void main(String[] args) {
        int i = 1;
        int total = 0;

        // 使用while迴圈執行1+2+3...+9+10
        while (i < 11) {
            total += i;
            i++;
        }

        System.out.println(total);
    }
}
