import java.util.Scanner;

public class LargestAmongAll {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a + "is greater number among all three");
        } else if (b>a && b>c){
            System.out.println(b + "is greater number among all three");
        }else {
            System.out.println(c +" " + "is greater number among all three");
        }

        // Alternative approach
       int larg = Math.max(a,Math.max(b,c));
        System.out.println(larg);
    }
}
