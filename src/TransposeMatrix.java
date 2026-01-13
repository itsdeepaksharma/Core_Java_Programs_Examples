public class TransposeMatrix {
    public static void main(String[] args) {

        int[][] arr;
        arr = new int[][] {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        int[][] brr;
        brr = new int[][] {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        int [][]crr = new int[3][3];

        for(int i =0; i<arr.length; i++){
            for(int  j = 0; j<arr[0].length; j++){
                crr[i][j] = arr[i][j]+brr[i][j];
            }
        }

        for(int i =0; i<arr.length; i++){
            for(int  j = 0; j<arr[0].length; j++){
                System.out.print(crr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
