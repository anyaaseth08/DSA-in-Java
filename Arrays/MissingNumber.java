//Brute Force Solution
//Time Complexity: O(n^2)
//Space Complexity: O()
public class MissingNumber {
    public static int missing(int[] arr,int N){
      for (int i = 1; i <= N; i++) {
            int flag = 0;
            for (int j = 0; j < N - 1; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                return i;
            } 
        }
        return -1;
    }
    public static void main(String[] args) {
        int N = 5;
        int arr[] = {1, 2, 4, 5};

        int ans = missing(arr,N);
        System.out.println("The missing number is: " + ans);
}
}
