package lesson2_2;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
        System.out.println("please enter number: ");
        int n = scanner.nextInt();
        System.out.println(reverse(n));
    }
    public static int reverse(int number){
        int result=0;
        while(number>0){
            result=result*10+number%10;
            number/=10;

        }
        return result;
    }


}
