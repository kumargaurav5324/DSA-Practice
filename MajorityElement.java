public class MajorityElement {
    public static int majority(int [] arr){
        int freq = 0;
        int ans  = 0;

        for(int i=0; i<arr.length; i++){
            if(freq  == 0){
                ans = arr[i];
            }
            if(ans  == arr[i]){
                freq++;
            }
            else  {
                freq--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {2,4,5,1,2,3,4,52,2,3,2,3,2,4,2,4,5,2,2,2,2,8,2,0,2,4,2};
        System.out.println(majority(arr));

    }

}
