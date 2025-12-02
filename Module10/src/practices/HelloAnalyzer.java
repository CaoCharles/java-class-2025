package practices;

public class HelloAnalyzer {

    // 建立一個 searchArr 的方法，要把 analyzer功能寫出來
    public static void searchArr(String[] strList, String searchStr, 
            StringAnalyzer analyzer) {
        for (String currentStr : strList) {
            if (analyzer.analyze(currentStr, searchStr)) {
                System.out.println(currentStr);
            }
        }

        System.out.println("-----------------------------------");
    }

    // main method
    public static void main(String[] args) {
        String[] strList =
                {"tomorrow", "toto", "to", "timbukto", "the", "hello", "heat"};
        String searchStr = "to";
        
        System.out.println("===字串中包含searchStr===");
        // 將下面匿名類別的實作改為Lambda expression
//        HelloAnalyzer.searchArr(strList, searchStr,
//            new StringAnalyzer() {
//                @Override
//                public boolean analyze(String t, String s) {
//                    return t.contains(s);
//                }
//            }
//        );

        HelloAnalyzer.searchArr(strList, searchStr,
                (t, s) -> t.contains(s)
        );

        // Lambda：開頭 searchStr
        System.out.println("===字串開頭為searchStr===");
        // 將下面匿名類別的實作改為Lambda expression
//        StringAnalyzer sa = new StringAnalyzer() {
//                @Override
//                public boolean analyze(String t, String s) {
//                    return t.startsWith(s);
//                }
//            };
        StringAnalyzer sa = (t, s) -> t.startsWith(s);

        System.out.println("===字串開頭為th===");
        // 使用sa變數執行字串判斷, 字串開頭改為"th"
        HelloAnalyzer.searchArr(strList, "th", sa);
    }
}
