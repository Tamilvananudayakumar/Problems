import java.util.Arrays;

public class Zeroarray {
    public static void main(String[] args) {
        int [] arr={0,1,0,12,3};
        int[]num=new int[arr.length];
        int n=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                num[n]=arr[i];
                n++;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}