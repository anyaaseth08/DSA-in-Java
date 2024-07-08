//Time Complexity:O(n^3)
//Space Complexity:O(1)
//Brute Force Solution
public class LongestSubarray {
    public static int subArray(int[] arr, long k) {
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                long sum = 0;
                for (int K = i; K <= j; K++) {
                    sum = sum + arr[K];
                }
                if (sum == k) {
                    length = Math.max(length, j - i + 1);
                }
            }
        }
        return length;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 1, 9 };
        long k = 10;
        int length = subArray(arr, k);
        System.out.println("The length of the longest subarray is: " + length);
    }
}

// Time Complexity:O(nlogn)
// Space Complexity:O(n)
import java.util.*;
public class LongestSubarray {
    public static int subArray(int[] arr, long k) {
        Map<Long,Integer> preSumMap = new HashMap<>();
        int length = 0;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
                if (sum == k) {
                    length = Math.max(length, i + 1);
                }
                long rem = sum - k;
                if (preSumMap.containsKey(rem)) {
                    int len = i - preSumMap.get(rem);
                    length = Math.max(length, len);
                }
                if (!preSumMap.containsKey(sum)) {
                    preSumMap.put(sum, i);
                }
            }
        return length;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 1, 9 };
        long k = 10;
        int length = subArray(arr, k);
        System.out.println("The length of the longest subarray is: " + length);
    }
}

//Time Complexity:O(nlogn)
//Space Complexity:O(n),n=size of map
import java.util.*;
public class LongestSubarray {
    public static int subArray(int[] arr, long k) {
        Map<Long,Integer> preSumMap = new HashMap<>();
        int length = 0;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
                if (sum == k) {
                    length = Math.max(length, i + 1);
                }
                long rem = sum - k;
                if (preSumMap.containsKey(rem)) {
                    int len = i - preSumMap.get(rem);
                    length = Math.max(length, len);
                }
                if (!preSumMap.containsKey(sum)) {
                    preSumMap.put(sum, i);
                }
            }
        return length;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 1, 9 };
        long k = 10;
        int length = subArray(arr, k);
        System.out.println("The length of the longest subarray is: " + length);
    }
}

//Optimal Solution
//Time Complexity:O(2n)
//Space Complexity:O(1),
import java.util.*;
public class LongestSubarray {
    public static int subArray(int[] arr, long k) {
        int left = 0, right = 0; 
        long sum = arr[0];
        int length = 0;
        while (right < arr.length) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                length = Math.max(length, right - left + 1);
            }
            right++;
            if (right < arr.length) sum += arr[right];
        }
        return length;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 1, 9 };
        long k = 10;
        int length = subArray(arr, k);
        System.out.println("The length of the longest subarray is: " + length);
    }
}