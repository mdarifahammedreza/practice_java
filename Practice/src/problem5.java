import java.util.Scanner;

//https://www.w3resource.com/java-exercises/basic/index.php
//problem 5
public class problem5 {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        System.out.print("Input first Numbner:");
        int num1=Input.nextInt();
        System.out.print("Input 2nd Number:");
        int num2=Input.nextInt();
        int sum=num1*num2;
        System.out.printf("%d x %d=%d",num1,num2,sum);


    }
}
