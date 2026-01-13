public class Swap2variablesWithoutTemp {
    public static void main(String[] args) {

        int a = 45;
        int b = 55;

         a = a+b;
         b = a-b;
         a = a-b;

        System.out.println(a + " " + b);
    }
}
