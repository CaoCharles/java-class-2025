package practices;
// SavingAccount 繼承了 Account父類別
public class SavingAccount extends Account {
    // SavingAccount 新增了自己的欄位：
    // Level 是一個 enum（普通、VIP 等級）
    // 新增屬性：帳戶等級（例如 NORMAL / VIP）
    private Level level;

    // 建構子 1：建立儲蓄帳戶（沒有初始餘額）
    public SavingAccount(int id, String name, Level level) {
        super(id, name);
        this.level = level;
    }

    // 建構子 2：建立儲蓄帳戶（有初始餘額）
    public SavingAccount(int id, String name, double balance, Level level) {
        super(id, name, balance);
        this.level = level;
    }

    // Getter：取得帳戶等級
    public Level getLevel() {
        return level;
    }

    // Setter：設定帳戶等級
    public void setLevel(Level level) {
        this.level = level;
    }

    // 覆寫 Account 的 getInfo() 方法
    // 目的：在父類別原本的帳戶資訊後面，再加上等級資訊
    @Override
    public String getInfo() {
        return super.getInfo() + "\n" +
                "Level: " + level;
    }

    // 覆寫 Account 的 toString()
    // 讓 SavingAccount 印出時包含 level 資訊
    @Override
    public String toString() {
        return super.toString() +
                ", Level: " + level;
    }
}
