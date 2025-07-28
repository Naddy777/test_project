package main.java.testcode;
/*
Даны строки. Сравнить их с помощью == и метода equals() класса Object
 */
public class Sravnenie {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3=s1;
        String s4="h"+"e"+"l"+"l"+"o";// конкотенация
        String s5= new String("hello");
        String s6= new String(new char[]{'h','e','l','l','o'});
        compare("s1", s1,"s2", s2);
        compare("s1", s1,"s3", s3);
        compare("s1", s1,"s4", s4);
        compare("s1", s1,"s5", s5);// новый объект, они не равны по ссылке (==), но равны по содержанию (equals)
        compare("s1", s1,"s6", s6);// новый объект, они не равны по ссылке (==), но равны по содержанию (equals)
        compare("s5", s5,"s6", s6);
    }
    private static void compare(String nameA, String a, String nameB, String b){
        System.out.printf("%s == %s: %b%n", nameA,nameB, a==b);
        System.out.printf("%s.equals(%s): %b%n%n", nameA, nameB, a.equals(b));

    }
}

