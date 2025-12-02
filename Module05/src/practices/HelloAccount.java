package practices;

import java.math.BigDecimal;

public class HelloAccount {
    public static void main(String[] args) {
        // 宣告並建立帳戶物件, 傳送帳號, 戶名兩個參數
        // 這裡使用我在Account.java建立的方法，呼叫我的建構子
        Account a = new Account(101, "Charles");
        // 呼叫帳戶的setBalance方法, 傳送的參數為BigDecimal物件
        a.setBalance(new BigDecimal("5000"));
        System.out.println(a.getInfo());

        double rate = 0.0;
        // 為變數rate設定VIP的利率值
        rate = Level.VIP.getRate();

        double interest = 0.0;
        // 為變數interest設定使用利率rate計算的利息
        interest = a.getBalance() * rate;  // ✔ 餘額 * 利率
        System.out.println("Interest: " + interest);
    }
}
