public class NumberCounts {
    public static void main(String[] args) {
        int a=67876478;
        int count=0;
        while(count<a){
            int res =a%10;
            if(res==8){
                count++;
            }
            a/=10;
        }
        System.out.println(count);
    }
}
