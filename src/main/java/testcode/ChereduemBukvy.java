/*Задача: Дано четное число N>0 и символы с1 и с2.
Написать метод, который вернет строку длины N, которая состоит из чередующихся символов С1 и С2 начиная с С1.
 Для четных добавляем с1, для нечетных добавляем с2

 */
package main.java.testcode;

public class ChereduemBukvy {
    public static void main(String[] args) {
        int N = 8;
        char c1 = 'A';
        char c2 = 'B';

        StringBuilder sb = new StringBuilder(N);
        for(int i=0; i<N; i++){
            if(i%2==0){// %2 - это остаток от деления на 2 (не равен 0)
                sb.append(c1);
            }else{
                sb.append(c2);
            }
            System.out.println(i);
            System.out.println(sb);
        }
        String result=sb.toString();
        System.out.println(result);
    }
}
