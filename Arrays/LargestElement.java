/*
//Time complexity: O(N)
import java.util.*;
public class LargestElement{
    public static void largestElement(int[] arr){
        int largest = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the Array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        largestElement(arr);
    
    }
}

import java.util.*;
public class LargestElement{
    public static void largestElement(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                  if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                  }
            }
        } 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the Array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        largestElement(arr);
        System.out.println("Largest element in the Array is : " + arr[n-1]);
    }
}
*/

// Time complexity: O(N)
// import java.util.*;
// public class LargestElement{
//     public static void largestElement(int[] arr){
//         Arrays.sort(arr);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter the size of Array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter the elements of the Array : ");
//         for(int i = 0 ; i < n ; i++){
//             arr[i] = sc.nextInt();
//         }
//         largestElement(arr);
//         System.out.println("Largest element in the Array is : " + arr[n-1]);
//     }
// }
