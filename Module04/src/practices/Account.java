package practices;

public class Account {
    // 宣告帳號變數
    private String accountNo;
    // 宣告戶名變數
    private String accountName;
    // 宣告餘額變數
    private int balance;
    // 宣告存款方法, 接收存款金額參數
    public void deposit(int amount){
        balance += amount;
    }
    // 宣告提款方法, 接收提款金額參數, 回傳提款是否成功(true/false)
    public boolean withdraw (int amount){
        if (amount > balance){
            return false
        }
        balance -= amount;
        return true;
    }
    // 傳回帳戶資訊字串
    public String getInfo(){
        return "Account No:" + accountNo +
               ", Name:" + accountName +
               ", Balance:" + balance
    }
    // 宣告傳回帳號方法
    public String getAccountNo(){
        return accountNo;
    }
    // 宣告設定帳號方法, 接收帳號參數
    public void setAccountNo(String accountNo){
        this.accountNo = accountNo;
    }
    // 宣告傳回戶名方法
    public String getAccountName(){
        return accountName;
    }
    // 宣告設定戶名方法, 接收戶名參數
    public void setAccountName(String accountName){
        this.accountName = accountName;
    }
    // 宣告傳回餘額方法
    public int getBalance(){
        return balance;
    }
    // 宣告設定餘額方法, 接收餘額參數
    public void setBalance(int balance){
        this.balance = balance;
    }
}
