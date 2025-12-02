package practices;

public class CreditAccount extends Account {
    // 額度（可以超額使用的信用金額）
    private double limit;

    public CreditAccount(int id, String name, double limit) {
        // 修改下面的敘述, 使用super呼叫父類別constructor, 傳送參數id, name
        super(id, name);
        // 設定額度
        this.limit = limit;
    }

    public CreditAccount(int id, String name, double balance, double limit) {
        // 修改下面的敘述, 使用super呼叫父類別constructor, 傳送參數id, name, balance
        super(id, name, balance);
        // 設定limit
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    // 覆寫父類別的withdraw方法, 提款的金額是餘額(balance)+額度(limit)
    @Override
    public boolean withdraw(double amount) {
        // 可用金額 = 餘額 + 額度
        double available = getBalance() + limit;
        // 若可提領，提領金額 < 可用金額時
        if (amount > 0 && amount <= available) {
            // 若餘額足夠 → 用餘額扣
            if (amount <= getBalance()) {
                setBalance(getBalance() - amount);
            }
            // 若餘額不夠 → 餘額先扣到 0，再用額度扣剩下的
            else {
                double useLimit = amount - getBalance();
                setBalance(0);           // 餘額歸 0
                limit -= useLimit;       // 額度減少被使用的部分
            }
            return true;
        }
        else {
            return false;
        }
    }

    // 覆寫父類別的getInfo方法
    @Override
    public String getInfo() {
        return super.getInfo() + "\n" +
                "limit: " + limit;
    }

    // 覆寫父類別的toString方法
    @Override
    public String toString() {
        return super.toString() +
                ", limit: " + limit;
    }
}
