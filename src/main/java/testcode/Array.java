//Задача: Дан массив двоичных чисел, выяснить макимальное количество подряд идущих 1
package main.java.testcode;

public class Array {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 1, 1, 1};//Дали массив значений
        int result = maxRang(array);//написали метод для вычисления максимального повторения единичек
        System.out.println("Максимальное значение последовательности в массиве: " + result);//вывели на печать результат
    }

    public static int maxRang(int[] nums) {
        int maxcount = 0;
        int currentcount = 0;
        for (int num : nums) {//для каждого num в массиве nums выполняем следующее условие:
            if (num == 1) {
//                System.out.println("currentcount: " + currentcount );
                currentcount++;// увеличиваем счетчик на один
//                System.out.println("currentcount: " + currentcount );
//                System.out.println("maxcount: " + maxcount );
                if (currentcount > maxcount) {
                    maxcount = currentcount;// записываем максимальное числн в переменную
                }
            } else currentcount = 0;

            }
        return maxcount;

    }
}



