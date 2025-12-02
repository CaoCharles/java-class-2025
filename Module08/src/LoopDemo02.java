import java.util.Arrays;

public class LoopDemo02 {
    public static void main(String[] args){
        loopforarray();
        loopforarray2();
    }
    public static void loopforarray(){
        int[] values = {1, 2, 3};
        StringBuilder txt = new StringBuilder();
        for (int i = 0; i < values.length; i++){
            int value = values[i];
            txt.append(value);
            System.out.println("loop: " + i +
                    ", value: " + txt);
        }
    }
    public static void loopforarray2(){
        int[] values = {1, 2, 3, 4, 5};
        int[] tmp = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            tmp[i] = values[i];
            System.out.println("loop: " + i + ", " +
                    Arrays.toString(Arrays.copyOfRange(values, 0, i+1)));
        }

    }
}
