//Time Complexity:O(n)
public class MaxConsecutive1s {
    public static int max(int[] arr){
        int max = 0;
        int count = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                if(count>max){
                    max=count;
                }
            }
            else{
                count = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1,1,1,10,1,0,1,1};
        int ans = max(arr);
        System.out.println(ans);
    }
}
