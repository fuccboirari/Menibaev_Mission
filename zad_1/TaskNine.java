package zad_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TaskNine {
    public static void main(String[] args) {
        System.out.println("Задание 9:");
        int [] in = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        int i = in.length;
        int [] out = new int[i];
        i = 0;
        for (int j = in.length - 1; j >= 0; j--)
        {
            out[i] = in[j];
            i++;
        }
        System.out.println(Arrays.toString(out));
    }
}
