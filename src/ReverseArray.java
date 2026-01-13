import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int brr[] = new int[n];
        int j = 0;

        for(int i = arr.length-1; i>=0; i--){

            brr[j] = arr[i];
            j++;
        }

        for(int i = 0; i<n; i++)
        {
            arr[i] = brr[i];
            System.out.println(arr[i]);
        }
    }
}
