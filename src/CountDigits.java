import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int ct=0;

        while(number>0){
            int d = number%10;
            ct++;
            number=number/10;
        }
        System.out.println(ct);
    }
}
