import java.util.Scanner;
public class practical2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the start of the number:");
        int start = input.nextInt();
        System.out.print("Enter the end of the number:");
        int end = input.nextInt();
        int sum = 0;
        if (start <= end){
            for (int i = start; i <= end; i++)
            {
                sum += i;
            }System.out.println("The sum from " + start + " to " + end + " is:" + sum);
        }
        else
        {
                System.out.println("Error: start must be less than or equal to end.");
        }

    }
}
