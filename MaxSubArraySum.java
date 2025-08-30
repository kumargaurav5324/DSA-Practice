package SlidingWindows;

public class MaxSubArraySum {

    public static int maxSum(int[] arr, int k){
        int  i =0;
        int j = 0;
        int sum  = 0;
        int maxSum = 0;

        while(j < arr.length){
            sum  = sum  +arr[j];

            if(j-i + 1 < k ){
                j++;
            }
            else if (j - i +1 == k){
                maxSum = Math.max(sum , maxSum);
                sum  = sum - arr[i];
                i++;
                j++;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int [] arr = {2,3,-4,1,-7,4,5,-9,5,-67};
        int k = 4;
        System.out.println(maxSum(arr,k));
    }
}
