package practices;

public class HelloArray02 {
    public static void main(String[] args) {
        String[][] calendar = new String[12][];

        for (int i = 0; i < 12; i++) {
            int days = getDays(i + 1, false);
            calendar[i] = new String[days];
        }
//        System.out.println('calender: ' + calendar);
        // 設定生日
        int birthmonth = 6;
        int birthday = 23;

        // 使用迴圈顯示生日月份的行事曆
        System.out.println("=== " + birthmonth + " 月 calendar ===");
        for (int i = 0; i < calendar[birthmonth - 1].length; i++) {
            int day = i + 1;
            if (i == (birthday - 1)) {
                System.out.println(birthmonth + "月" + day + "日 <- 生日");
            }
            else {
                System.out.println(birthmonth + "月" + day + "日" );
            }
        }
    }

    public static int getDays(int month, boolean isLeapYear) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> isLeapYear ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 0;
        };
    }
}
