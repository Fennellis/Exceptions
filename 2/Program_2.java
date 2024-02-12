/*
    Напишите программу, которая вычисляет значение выражения intArray[8] / d,
    гдеintArray- массив целых чисел, а d - делитель.
    Программа проверяет, имеется ли в массиве intArray элемент с индексом 8,
    и если нет, выводит сообщение о невозможности выполнения операции.
    Также программа проверяет, равен ли делитель d нулю,
    и если да, выводит соответствующее сообщение.
*/

public class Program_2 {
    public static void main(String[] args) {
        int[] intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int d = 0;
        System.out.println(Expr.expr(intArray, d));

        intArray = new int[]{0, 1, 2};
        d = 3;
        System.out.println(Expr.expr(intArray, d));

        intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        d = 3;
        System.out.println(Expr.expr(intArray, d));
    }
}

class Expr {

    public static double expr(int[] intArray, int d) {
        double out = Double.NaN;
        try {
            out = intArray[8] / d;
            System.out.println(String.format("intArray[8] / d = %d / %d = %.1f", intArray[8], d, out));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
        } catch (ArithmeticException e) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
        }

        return out;
    }
}
