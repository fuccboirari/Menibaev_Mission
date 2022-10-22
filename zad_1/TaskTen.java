package zad_1;

import java.util.Arrays;
import java.util.Comparator;

public class TaskTen {
    public static void main(String[] args) {
        System.out.println("Задание 10:");
        int [] in = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        int temp;
        for (int i = 0; i < in.length; i++)
        {
            if (in[i] == 0)
            {
                for (int j = i + 1; j < in.length; j++)
                {
                    if (in[j] != 0)
                    {
                        temp = in[j];
                        in[j] = in[i];
                        in[i] = temp;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(in));
    }
}
