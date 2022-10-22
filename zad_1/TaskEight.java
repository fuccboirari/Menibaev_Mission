package zad_1;

public class TaskEight {
    public static void main(String[] args) {
        System.out.println("Задание 8:");
        long [] n = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        long max = (long) -1e9;
        int sump = 0;
        int sumn = 0;
        int colp = 0;
        int coln = 0;
        int sumnf = 0;
        for (long a: n)
        {
            if (max < a) max = a;
            if (a >= 0) {
                sump += a;
                colp++;
            }
            if (a < 0) {
                if (a % 2 == 0) sumn += a;
                coln++;
                sumnf += a;
            }
        }
        System.out.println("Максимальное значение:");
        System.out.println(max);
        System.out.println("Сумма положительных элементов");
        System.out.println(sump);
        System.out.println("Сумма четных отрицательных элементов");
        System.out.println(sumn);
        System.out.println("количество положительных элементов");
        System.out.println(colp);
        System.out.println("количество отрицательных элементов");
        System.out.println(coln);
        System.out.println("среднее арифметическое отрицательных элементов");
        System.out.println(sumnf / coln);
    }
}
