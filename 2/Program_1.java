/*
    Напишите программу, которая проверяет, является ли введенная текстовая строка числом с плавающей точкой (float).
    Программа пытается преобразовать введенную строку в число float, и если это успешно, она выводит полученное число.
    Если преобразование не удалось, программа выдаёт сообщение об ошибке
    "Your input is not a float number. Please, try again."
    и возвращает специальное значение Float.NaN, чтобы обозначить ошибку.
*/
public class Program_1 {

    public static void main(String[] args) {
        System.out.println(IsFloat.isFloat("3.14fgd"));

    }


}

class IsFloat {
    public static float isFloat(String input) {
        try {
            return Float.parseFloat(input);
        } catch (NumberFormatException e) {
            System.out.println("Your input is not a float number. Please, try again.");
            return Float.NaN;
        }
    }
}