/*
    Напишите программу для выполнения арифметической операции деления двух целых чисел a и b.
    При этом программа должна проверить, что делитель b не равен нулю, и выполнить деление только в этом случае.
    Если b равен нулю, программа должна вывести сообщение о невозможности выполнения операции и вернуть результат равный нулю.
    После выполнения операции деления, программа также должна вывести сумму чисел a и b с помощью метода printSum.
    Если аргументы не переданы через командную строку, используйте значения по умолчанию.
*/

public class Program_3 {
    public static void main(String[] args) {
        int a = 90;
        int b = 30;
        Expr.printSum(a, b);
        double result = Expr.expr(a, b);
        System.out.println(result);
    }
}

class Expr {

    public static double expr(int a, int b) {
        if (b != 0)
            return (double)a / (double)b;
        return 0; 
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }
}