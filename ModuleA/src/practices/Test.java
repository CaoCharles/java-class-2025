package practices;

/*
1. isDataSerializable(emp) → 看到 Employee 有 @DataSerializable → 回傳 true
2. initDataObject(emp) → 找到 @DataInit 的 dataInit() → 呼叫它，把 name 變成 "Simon"
3. objectToData(emp) → 只讀有 @DataElement 的欄位：id, name, salary

Employee ID=101,Employee Name=Simon,salary=12500.0
 */
public class Test {

    public static void main(String[] args) {
        Employee emp = new Employee("101", "simon", 12500, "simon", "123");
        
        try {
            if (DataUtil.isDataSerializable(emp)) {
                DataUtil.initDataObject(emp);
                System.out.println(DataUtil.objectToData(emp));
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
