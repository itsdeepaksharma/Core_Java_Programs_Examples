import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum =0;

        while(number>0){
            int d = number%10;
            sum+=d;
            number=number/10;
        }
        System.out.println(sum);
    }
}
