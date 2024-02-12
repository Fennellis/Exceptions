/**
    Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива

    Метод divisionByZero - Деление на 0

    Метод numberFormatException - Ошибка преобразования строки в число
 */
public class Program_1 {

    public static void main(String[] args) {
        // arrayOutOfBoundsException();
        // divisionByZero();
        numberFormatException();
    }
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] array = new int[10];
        array[100] = 5;
    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int a = 10 / 0;
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        Integer.parseInt("Hello");
    }
}