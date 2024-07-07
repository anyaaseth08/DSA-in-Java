//Brute Force Solution
//Time Complexity:O(n)
public class SingleNumber {
    public static int num(int[] arr){
        for(int i =0 ;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                 if(arr[i]==arr[j]){
                    count++;
                 }
            }
             if(count==1){
                return arr[i];
             }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};
        int ans = num(arr);
        System.out.println(ans);
    }
}

//Time Complexity:O(3n)
//Space Complexity:O(N),N=size of hash array
//Will not work for negative numbers
public class SingleNumber {
    public static int num(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        int[] hash = new int[max + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1)
                return arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4 };
        int ans = num(arr);
        System.out.println(ans);
    }
}

//Will work for negative numbers
//Time Complexity:O(N*logM) O(M),M = size of the map i.e. M = (N/2)+1. N = size of the array.
//Space Complexity:O(M),M = size of the map i.e. M = (N/2)+1.
import java.util.HashMap;
import java.util.Map;
public class SingleNumber {
    public static int num(int[] arr) {
       int n = arr.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4 };
        int ans = num(arr);
        System.out.println(ans);
    }
}

// Optimal Solution
// Time Complexity:O(N)
// Space Complexity:O(1)
public class SingleNumber {
    public static int num(int[] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4 };
        int ans = num(arr);
        System.out.println(ans);
    }
}