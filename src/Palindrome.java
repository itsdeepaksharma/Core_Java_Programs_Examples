import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int rev = 0;
        int temp = number;

        while(temp>0){
            int d = temp%10;
            rev = rev*10+d;
            temp = temp/10;
        }
        if(number == rev){
            System.out.println(number + " Its a Palindrome Number");
        }
        else System.out.println( number + " Not a Palindrome Number");
    }
}
