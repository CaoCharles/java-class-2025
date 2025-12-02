package practices;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloAccount {
    private static Logger logger =
            Logger.getLogger(HelloAccount.class.getName());

    public static void main(String[] args) {
        Account a = new Account(101, "Simon", 100);
        System.out.println(a.getInfo());
        // 呼叫Account.withdraw方法提款500並執行必要的例外控制
        try {
            a.deposite(1000);     // 這裡也可能丟 IllegalArgumentException
            System.out.println(a.getInfo());
            a.withdraw(500);     // 這裡可能丟 IllegalArgumentException 或 OverdraftException
            System.out.println("提款500成功，帳戶資訊更新如下");
            System.out.println(a.getInfo());
        } catch (IllegalArgumentException e) {
            // 金額不合法（<= 0），屬於「使用者輸入錯誤」
            logger.log(Level.SEVERE, "金額不合法: " + e.getMessage(), e);
        } catch (OverdraftException e) {
            // 餘額不足
            logger.log(Level.WARNING, "透支錯誤: " + e.getMessage(), e);
        }

    }
}
