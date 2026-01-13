import java.util.Scanner;

public class PrimeNumbersUptoN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int j = 2; j<=number; j++){

            boolean isPrime = true;

        for(int i = 2; i<Math.sqrt(j); i++)
        {
            if ( j % i == 0) {
                isPrime = false;
                  break;
            }
        }
         if(isPrime){
             System.out.println(j);
         }
        }
    }
}
