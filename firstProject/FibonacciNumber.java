//оголошення пакету
package firstProject;
//імпорт  математичної бібліотеки
import java.lang.Math;

/**
 * class for operate with Fibonacci numbers
 */
public class FibonacciNumber {
    //початкові значення послідовності чисел Фібоначчі
    private int f0 = 0;
    private int f1 = 1;

    /**
     * It is a constructor
     */
    //конструктор
    public FibonacciNumber(){
    }

    /**
     *
     * @param n  - Fibonacci sequence number
     * @return the value of the number of the Fibonacci sequence
     */
    //метод повертає значення n-того числа послідовності Фібоначчі
    public int getFibonacciNumber(int n){
        if (n<0) return 0;
        //друге число послідовності Фібоначчі
        int fcurrent = f1+f0;
        //перше число послідовності Фібоначі
        int fprev1=f1;
        //нульове число послідовності Фібоначчі
        int fprev2=f0;
        for(int i = 0; i<n;i++){
            fprev2=fprev1;
            fprev1=fcurrent;
            fcurrent=fprev1 + fprev2;
        }
        //повернення n-того числа послідовності Фібоначчі;
        return fprev2;
    }
    //перевірка, чи відповідає число,яке є параметром, формулі;
    private boolean Check(int n){
        double number = Math.pow(n,1./3);
        int rnumber=(int)Math.round(number);
        if (n==rnumber*rnumber*rnumber + 1) return true;
        else return false;
    }
    //запис перевірених чисел у масив

    /**
     *
     * @param n the number of numbers in the Fibonacci sequence
     * @return an array of numbers corresponding to the formula
     */
    public int[]  FibonacciNumbersAfterCheck(int n){
        int tempArr[] = new int[n+1];
        int countcubes = 0;
        for (int i = 0; i<=n; i++){
            int fibonacciNum = getFibonacciNumber(i);
            if(Check(fibonacciNum)){
                tempArr[countcubes] = fibonacciNum;
                countcubes++;
            }
        }
        int Arr[] = new int[countcubes] ;
        for(int i=0;i< countcubes;i++){
            Arr[i] = tempArr[i];
        }
        return Arr;
    }
}