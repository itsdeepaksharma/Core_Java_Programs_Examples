import java.util.Scanner;

public class SecondLargestArray {
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

        int max = Integer.MIN_VALUE;
        int maxi = -1;

        int sm = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {

            if(arr[i]>max)
            {
                max = arr[i];
                maxi = i;
            }
        }

        for(int i=0; i<n; i++)
        {
            if(arr[i] == max)
            {
                continue;
            }
            if(arr[i]>sm)
            {
                sm = arr[i];
            }
        }

        System.out.println(sm);
    }
}
