import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int [] arr, int target) {
        int n = arr.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == target)  {
                   return new int[] {i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int [] arr  = {2,5,7,9,23,56};
        int target = 30;
        int [] result  = twoSum(arr,target);
        System.out.println(Arrays.toString(result));
    }
}
