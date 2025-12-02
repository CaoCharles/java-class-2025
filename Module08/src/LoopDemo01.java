public class LoopDemo01 {
    public static void main(String[] args) {
        loopWithWhile();
        loopWithFor();
        loopWithDoWhile();
    }
    // while 迴圈
    public static void loopWithWhile(){
        int i = 0;
        while (i < 10){
            System.out.println("loop with while: " + i);
            i++;
        }
    }
    // For 迴圈
    public static void loopWithFor(){
        for (int i = 0; i < 10; i++){
            System.out.println("loop with for: " + i);
        }
    }
    // Do While 迴圈
    public static void loopWithDoWhile(){
        int i = 0;
        do {
            System.out.println("loop with do while: " + i);
            i++;
        } while (i < 10);
    }

}