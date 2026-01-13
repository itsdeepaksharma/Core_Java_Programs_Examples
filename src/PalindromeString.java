
public class PalindromeString {
    public static void main(String[] args){

        String s = "Deepeed";

        int st = 0;
        int en = s.length()-1;
        boolean isPalindrome = true;

       while(st<=en)
        {
           if(s.charAt(st)!=s.charAt(en))
           {
               isPalindrome = false;
               break;
           }
           st++;
           en--;
        }
        if(isPalindrome = true)
        {
            System.out.println(s + " is a palindrome string");
        }
    }
}
