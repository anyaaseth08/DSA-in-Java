
// //Brute Force Approach
// //Time Complexity:O(2n)
// //Space Complexity :O(n)
// import java.util.*;
// public class MoveZeroes {
//     public static int[] moveZeroes(int[] arr, int n) {
//         ArrayList<Integer> temp = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             if (arr[i] != 0) {
//                 temp.add(arr[i]);
//             }
//         }

//         int nz = temp.size();

//         for (int i = 0; i < nz; i++) {
//             arr[i] = temp.get(i);
//         }

//         for (int i = nz; i < n; i++) {
//             arr[i] = 0;
//         }

//         return arr;

//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the Array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter the elements of the array : ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         ;
//         moveZeroes(arr, n);
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


// //Optimal Solution
// //Time Complexity:O(n)
// //Space Complexity :O(1)
// import java.util.*;
// public class MoveZeroes {
//     public static void moveZeroes(int[] arr, int n) {
//         int j = -1;
//         for ( int i = 0 ; i < n ; i++){
//             if(arr[i]==0){
//                 j = i;
//                 break;
//             }
//         }
//         for(int i = j + 1 ; i < n ; i++){
//             if(arr[i] != 0){
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j]=temp;
//                 j++;
//             }
//         }

//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the Array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter the elements of the array : ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         ;
//         moveZeroes(arr, n);
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }