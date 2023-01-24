import java.util.Scanner;

//https://www.w3resource.com/java-exercises/basic/index.php
//problem 6
public class problem6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input 1st number:");
        int num1=input.nextInt();
        System.out.print("Input 2nd number:");
        int num2=input.nextInt();
        System.out.printf("%d+%d = ",num1,num2);
        System.out.println(num1+num2);
        System.out.printf("%d-%d = ",num1,num2);
        System.out.println(num1-num2);
        System.out.printf("%dx%d = ",num1,num2);
        System.out.println(num1*num2);
        System.out.printf("%d/%d = ",num1,num2);
        System.out.println(num1/num2);
        System.out.printf("%d%%d = ",num1,num2);
        System.out.println(num1%num2);
    }
}
