//Time Complexity:O(n)
//Space Complexity:O(1)
import java.util.*;
public class LinearSearch {
    public static int search(int[] arr,int target){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        };
        System.out.println("Enter the element to be found : ");
        int target = sc.nextInt();
        System.out.println(search(arr, target));
    }                    
}
