public class palindrome {
    public static void main(String[] args) {
        int a=121;
        System.out.println(isPalindrome(a));
    }
    static boolean isPalindrome(int a){
        int t=a;
        int rev=0;
        while(a>0){
            int x=a%10;
            rev=rev*10+a;
            a=a/10;
        }
        return rev==t;
    }
}
