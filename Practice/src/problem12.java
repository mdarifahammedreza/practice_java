import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {

        Scanner Input= new Scanner(System.in);
        int x=0;
        while(x!=1) {
            System.out.print("Input three number:");
            x = Input.nextInt();
            double y = Input.nextInt();
            int z = Input.nextInt();
            double A = (x + y + z) / 3.0;
            System.out.printf("Average is : %.2f\n", A);
        }
    }
}
