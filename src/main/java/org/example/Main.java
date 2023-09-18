package org.example;


public class Main {
    public static void main(String[] args) {

        int num1 = 10 ;
        int num2 = 5 ;
        int temp = 0;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("변수를 스왑합니다.");
         temp = num1 ; // temp에 num1(10) 대입
         num1 = num2 ; // num1에 5 대입
         num2 = temp ;

        System.out.println(num1);
        System.out.println((num2));

    }

}
