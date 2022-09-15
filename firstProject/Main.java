//оголошення пакету
package firstProject;
//імпорт об'єкта Scanner для зчитування тексту з консолі
import java.util.Scanner;

/**
 * main class
 */
public class Main {
    /**
     * @param args array of string parameters
     */
    public static void main(String[] args) {
        //створення екземпляру класу FibonacciNumber
        int a = Integer.MAX_VALUE;
        System.out.println(a);
        Scanner sc = new Scanner(System.in);
        FibonacciNumber FibonNumb = new FibonacciNumber();
        System.out.println("1.Перевірка на знаходження n-того числа послідовності Фібоначчі" );
        System.out.print("Вкажіть номер числа послідовності Фібоначчі:");
        //зчитування числа num з консолі
        int num = sc.nextInt();
        System.out.print(num +" число послідовності Фібоначчі:");
        //визначаня числа num у послідовності Фібоначчі і виведення його у консоль
        System.out.println(FibonNumb.getFibonacciNumber(num));
        System.out.println("1.Знаходження чисел послідовності Фібоначчі, які відповідають формулі" );
        System.out.print("Вкажіть кількість чисел послідовності Фібоначчі:");
        num = sc.nextInt();
        System.out.print("Числа послідовності Фібоначчі,які відповідають формулі:");
        // у масив numbers[] записуємо масив чисел Фібоначчі, які відповідають формулі
        int numbers[] = FibonNumb.FibonacciNumbersAfterCheck(num);
        for (int i = 0; i<numbers.length; i++){
            System.out.print(" ");
            System.out.println(numbers[i]);
        }
    }
}
