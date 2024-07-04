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