package practices;

import java.util.ArrayList;
import java.util.List;

public class HelloList {
    public static void main(String[] args) {
        List<Account> data = getAccounts();

        for (Account a : data) {
            // 判斷是否為 SavingAccount
            if (a instanceof SavingAccount) {

                // 計算利息：餘額 * 利率
                double interest = a.getBalance() * ((SavingAccount) a).getRate();

                // 將利息加入餘額
                a.setBalance(a.getBalance() + interest);
            }
        }

        // 顯示所有帳戶資訊
        for (Account a : data) {
            System.out.println(a);
        }
    }

    public static List<Account> getAccounts() {
        SavingAccount sa =
                new SavingAccount(101, "Simon", 100.0, Level.VIP);
        SavingAccount sa02 =
                new SavingAccount(102, "Sam", 120.0, Level.NORMAL);
        SavingAccount sa03 =
                new SavingAccount(103, "John", 520.0, Level.NORMAL);
        CreditAccount ca =
                new CreditAccount(201, "Mary", 150.0, 200);
        CreditAccount ca02 =
                new CreditAccount(202, "Nicolas", 500.0, 100);
        CreditAccount ca03 =
                new CreditAccount(203, "Rose", 300.0, 200);

        ArrayList<Account> data = new ArrayList<>();
        data.add(sa);
        data.add(sa02);
        data.add(sa03);
        data.add(ca);
        data.add(ca02);
        data.add(ca03);
        return data;
    }
}
