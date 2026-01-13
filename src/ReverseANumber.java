import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int rev = 0;
        int temp = number;

        if(temp > 0){
            while( temp % 10 == 0 );
            {
                System.out.println("0");
                temp = temp / 10;
            }
        }

        while(temp>0){
            int d = temp%10;
            rev= rev*10+d;
            temp = temp/10;
        }

        System.out.println(rev);
    }
}
