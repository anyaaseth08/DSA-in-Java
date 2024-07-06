//Brute Force Solution
//Time Complexity: O(n^2)
//Space Complexity: O(1)
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

//Better Solution(using Hashing)
//Time Complexity: O(2n)
//Space Complexity: O(n)
import java.util.*;
public class MissingNumber {
    public static int missing(int[] arr, int N) {
        int hash[] = new int[N + 1]; // hash array
        for (int i = 0; i < N - 1; i++) {
            hash[arr[i]]++;
        }

        // check freq from 1 to N
        for (int i = 1; i <= N; i++) {
            if (hash[i] == 0) {
                return i;
            }
            ;
        }
        return -1;
    }
    public static void main(String[] args) {
        int N = 5;
        int arr[] = { 1, 2, 4, 5 };
        int ans = missing(arr, N);
        System.out.println("The missing number is: " + ans);
    }
}

//Optimal Solution1
//Time Complexity: O(N),n=size of array+1
//Space Complexity: O(1)
import java.util.*;
public class MissingNumber {
    public static int missing(int[] arr, int N) {
        int sum = N*(N+1)/2;
        int sum_Arr = 0;
        for(int i = 0; i < N-1 ; i++){
            sum_Arr = sum_Arr + arr[i];
        }
        int missing = sum - sum_Arr;
        return missing;
    }
    public static void main(String[] args) {
        int N = 5;
        int arr[] = { 1, 2, 4, 5 };
        int ans = missing(arr, N);
        System.out.println("The missing number is: " + ans);
    }
}

// Optimal Solution2
// Time Complexity: O(N),n=size of array+1
// Space Complexity: O(1)
import java.util.*;
public class MissingNumber {
        public static int missingNumber(int[] arr, int N) {

            int xor1 = 0, xor2 = 0;
    
            for (int i = 0; i < N - 1; i++) {
                xor2 = xor2 ^ arr[i]; // XOR of array elements
                xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
            }
            xor1 = xor1 ^ N; //XOR up to [1...N]
    
            return (xor1 ^ xor2); // the missing number
        }
    
        public static void main(String args[]) {
            int N = 5;
            int arr[] = {1, 2, 4, 5};
    
            int ans = missingNumber(arr, N);
            System.out.println("The missing number is: " + ans);
        }
}
