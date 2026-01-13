import java.util.Scanner;

public class Positive_Negative_orZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N>0){
            System.out.println(N + "is a Positive Number");
        } else if (N<0) {
            System.out.println(N + "is a Negative Number");
        }else {
            System.out.println(N + "is a zero Number");
        }
    }
}
