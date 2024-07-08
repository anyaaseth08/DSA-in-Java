// Brute Force Solution
// Time Complexity:O(n^2)
// Space Complexity:O(1)
public class TwoSum {
    public static boolean indx(int[] arr, int target){
        for(int i = 0; i < arr.length ; i++){
            for (int j = i+1; j < arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {2, 8, 6, 4, 5};
        int target = 12;
        boolean ans = indx(arr,target);
        System.out.println(ans);
    }
}


// Time Complexity:O(n^2)
// Space Complexity:O(1)
public class TwoSum {
    public static void indx(int[] arr, int target){
        int[] b = new int[2];
        for(int i = 0; i < arr.length ; i++){
            for (int j = 1; j < arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    b[0] = j;
                    b[1] = i;
                }
            }
        }
        for(int i = 0; i < b.length ;i++){
            System.out.print(b[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {2, 8, 6, 4, 5};
        int target = 12;
        indx(arr,target);
    }
}


// Time Complexity:O(n)
// Space Complexity:O(n)
import java.util.*;
public class TwoSum {
    public static boolean indx(int[] arr, int target){
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            int needed = target - num;
            if(mpp.containsKey(needed)){
                return true;
            }
            mpp.put(arr[i],i);
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {2, 8, 6, 4, 5};
        int target = 12;
        boolean ans = indx(arr,target);
        System.out.println(ans);
    }
}


// Time Complexity:O(nlogn)
// Space Complexity:O(n)
import java.util.*;
public class TwoSum {
    public static boolean indx(int[] arr, int target){
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            int needed = target - num;
            if(mpp.containsKey(needed)){
                return true;
            }
            mpp.put(arr[i],i);
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {2, 8, 6, 4, 5};
        int target = 12;
        boolean ans = indx(arr,target);
        System.out.println(ans);
    }
}

//Optimal Approach
//Time Complexity:O(nlogn)+O(n)
//Space Complexity:O(1)
import java.util.*;
public class TwoSum {
    public static boolean indx(int[] arr, int target){
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return true;
            } 
            else if(sum < target) {
                left++;
            }
            else right--;
        }
        return false;
}
    public static void main(String[] args){
        int[] arr = {2, 8, 6, 4, 5};
        int target = 12;
        boolean ans = indx(arr,target);
        System.out.println(ans);
    }
}


