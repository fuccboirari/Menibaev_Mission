package mission_1;

public class Main {
    /*       Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
    Класс Student содержит переменные: String firstName, lastName, group. А также double averageMark, содержащую среднюю оценку.
    Создать переменную типа Student, которая ссылается на объект типа Aspirant.
    Создать метод getScholarship() для класса Student, который возвращает сумму стипендии. Если средняя оценка студента равна 5, то сумма 100, иначе 80.
Переопределить этот метод в классе Aspirant. Если средняя оценка аспиранта равна 5, то сумма 200, иначе 180.
    Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getScholarship() для каждого элемента массива.
*/

    public static void main(String[] args) {
        Student student = new Aspirant("Maxim", "Menibaev", "152101" , 3.3);
        Student student2 = new Aspirant("Carol", "Poell", "152101" , 5.0);

        Student[] students = new Student[]{
          new Student("Andrey", "Ivanovv", "157701" , 5.0),
          student, student2
        };

        for (Student student1 : students) {
            System.out.println(student1.getScholarship());
        }
    }
}