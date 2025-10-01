import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Объявляем объект класса Scanner для ввода данных
        Scanner scanner = new Scanner(System.in);
        // Считывание данных из консоли
        double X = scanner.nextDouble(); // Количество килограмм бананов
        double A = scanner.nextDouble(); // Покупатель 1
        double B = scanner.nextDouble(); // Покупатель 2
        double C = scanner.nextDouble(); // Покупатель 3
        double D = scanner.nextDouble(); // Покупатель 4

        int count = 0; // Счетчик покупателей, которые смогли купить бананы

        if (X>=A){    // Смотрим, хватает ли бананов первому покупателю
            count++;
            X -= A;
            if (X>=B){ // Смотрим, хватает ли бананов второму покупателю
                count++;
                X -= B;
                if (X>=C){ // Смотрим, хватает ли бананов третьему покупателю
                    count++;
                    X -= C;
                    if (X>=1){ // Смотрим, хватает ли бананов четвертому покупателю
                        count++;
                    }
                } else { // Если не хватает первому
                    count++;
                }
            } else { // Если не хватает второму
                count++;
            }
        } else { // Если не хватает третьему
            count++;
        }

        // Вывод результата
        System.out.println(count);
    }
}
