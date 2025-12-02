package practices;

public class HelloArray {
    public static void main(String[] args) {
        String[] names = {"Simon", "Mary", "John"};
        int total = 0;

        // 使用迴圈計算所有元素的字元個數合計
        // 字串變數呼叫length()方法可以傳回字元個數
        for (int i = 0; i < names.length; i++) {
            String tmp = names[i];
            System.out.println(tmp + ", length: " + tmp.length());
            total += tmp.length();
        }

        System.out.println(total);
    }
}
