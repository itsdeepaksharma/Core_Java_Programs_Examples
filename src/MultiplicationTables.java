import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int multiply = 1;

        for(int i =1; i<=10; i++){
            multiply = number*i;
            System.out.println( number + " X " + i + " = " + multiply);
            multiply= 1;
        }
    }
}
