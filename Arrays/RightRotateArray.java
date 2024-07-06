// //Rotate by 1 place
// //Time Complexity:O(n)
// import java.util.*;
// public class RightRotateArray {
//     public static void rotateArray(int[] arr){
//         int temp = arr[arr.length-1];
//         for (int i = arr.length-1 ; i>0 ;i--){
//             arr[i] = arr[i-1];
//         }
//         arr[0] = temp;
//     }
//     public static void main(String args[]) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter the size of the Array : ");
//                 int n = sc.nextInt();
//                 int[] arr = new int[n];
//                 System.out.println("Enter the elements of the array : ");
//                 for (int i = 0; i < n; i++) {
//                     arr[i] = sc.nextInt();
//                 };
//                  rotateArray(arr);
//                 for (int i = 0; i < n; i++) {
//                     System.out.print(arr[i] + " ");
//                 }
//             }
// }


// //Rotate array by d places
// //Brute Force Approach
// //Time Complexity:O(n+d)
// //Space Complexity:O(d)
// import java.util.*;
// public class RightRotateArray {
//     public static void rotateArray(int[] arr,int n , int d){
//         d = d % n;
//         int[] temp = new int[d];
//         for ( int i = n-d ; i < n ; i++){
//             temp[i - (n-d)] = arr[i];
//         }
//         for (int i = n-d-1 ; i>=0;i--){
//             arr[i+d] = arr[i];
//         }
//         for (int i = 0; i < d; i++) {
//             arr[i] = temp[i];
//         }
//     }
//     public static void main(String args[]) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter the size of the Array : ");
//                 int n = sc.nextInt();
//                 int[] arr = new int[n];
//                 System.out.println("Enter the elements of the array : ");
//                 for (int i = 0; i < n; i++) {
//                     arr[i] = sc.nextInt();
//                 };
//                 System.out.println("Enter the number of times you want to rotate array : ");
//                  int d = sc.nextInt();
//                  rotateArray(arr,n,d);
//                 for (int i = 0; i < n; i++) {
//                     System.out.print(arr[i] + " ");
//                 }
//             }
// }

// Rotate array by d places
// Optimal Approach
// Time Complexity:O(2n)
// Space Complexity:O(1)
// import java.util.*;
// public class RightRotateArray {
//     public static void reverse(int[] arr,int start , int end){
//         while(start<=end){
//         int temp = arr[start];
//         arr[start] = arr[end];
//         arr[end]=temp;
//         start++;
//         end--;
//     }
// }
//     public static void rotateArray(int[] arr,int n , int d){
//         d = d % n;
//         if(n==0){
//         return;
//         }
//         else{
//             reverse(arr,0,n-d-1);
//             reverse(arr,n-d, n-1);
//             reverse(arr, 0, n-1);
//         }
//     }
//     public static void main(String args[]) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter the size of the Array : ");
//                 int n = sc.nextInt();
//                 int[] arr = new int[n];
//                 System.out.println("Enter the elements of the array : ");
//                 for (int i = 0; i < n; i++) {
//                     arr[i] = sc.nextInt();
//                 };
//                 System.out.println("Enter the number of times you want to rotate array : ");
//                  int d = sc.nextInt();
//                  rotateArray(arr,n,d);
//                 for (int i = 0; i < n; i++) {
//                     System.out.print(arr[i] + " ");
//                 }
//             }
// }
