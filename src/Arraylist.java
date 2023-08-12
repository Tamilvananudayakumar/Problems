import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,3};
        int arr[]=new int[nums.length];
        //ArrayList<Integer> al=new ArrayList();
        int i=0;

        while(i<nums.length){
            int j=i+1;
            while (i !=j) {
                if (j<nums.length&&nums[i] <nums[j]) {
                    arr[i]=nums[j];
                    break;
                }
             j++;
                if (j >= nums.length ) {
                    j = 0;
                }
            }
            if(i==j){
             arr[i]=-1;
            }
           i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
