package zad_1;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        System.out.println("Задание 2:");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        String s = in.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum  += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        System.out.println("Результат суммирования цифр в числе:");
        System.out.println(sum);
    }
}
