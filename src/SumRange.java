import java.util.Scanner;
public class SumRange {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the start of the number:");
        int start = input.nextInt();
        System.out.print("Enter the end of the number:");
        int end = input.nextInt();
        int sum = 0;
        for (int i = start; i <= end; i++){
            sum = sum +i;
        }
        System.out.println("The sum from " + start + " to " + end + " is:" + sum);
    }
}
