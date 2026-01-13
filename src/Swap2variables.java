public class Swap2variables {
    public static void main(String[] args) {

        int a = 59;
        int b = 69;

        int temp = 0;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}
