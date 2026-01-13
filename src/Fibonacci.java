import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;

        for(int i = 0 ; i <=number; i++){

         System.out.println(a);

         c = a+b;

         a = b;

         b = c;
        }
    }
}
