import java.util.Scanner;

public class CountElementsInArray {
    public static void main(String[] args) {


        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for(int i = 0; i<n; i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]+ " is an even Array Element");
            }
            else {
                System.out.println(arr[i]+ " is an odd Array Element");
            }
        }
    }
}
