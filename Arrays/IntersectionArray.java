// //For sorted array only

// //Time Complexity: O(n*m)
// //Space Compleity: O(m)
// import java.util.*;
// public class IntersectionArray {
//     public static ArrayList<Integer> intersection(int[] arr1, int[] arr2, int n, int m) {
//         ArrayList<Integer> instersection = new ArrayList<>();
//         int[] visited = new int[m];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (arr1[i] == arr2[j] && visited[j] == 0) {
//                     instersection.add(arr1[i]);
//                     break;
//                 }
//                 if (arr1[i] < arr2[j]) {
//                     break;
//                 }
//             }
//         }
//         return instersection;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of first Array : ");
//         int n = sc.nextInt();
//         int[] arr1 = new int[n];
//         System.out.println("Enter the elements of the array : ");
//         for (int i = 0; i < n; i++) {
//             arr1[i] = sc.nextInt();
//         }
//         ;
//         System.out.println("Enter the size of second Array : ");
//         int m = sc.nextInt();
//         int[] arr2 = new int[n];
//         System.out.println("Enter the elements of the array : ");
//         for (int i = 0; i < n; i++) {
//             arr2[i] = sc.nextInt();
//         }
//         ;
//         ArrayList<Integer> intersection = intersection(arr1, arr2, n, m);
//         System.out.println("Union of array 1 and array 2 is : ");
//         for (int val : intersection) {
//             System.out.print(val + " ");
//         }
//     }
// }


// //Optimal Solution
// //Time Complexity: O(n1+n2)~O(n)
// //Space Compleity: O(1)
// import java.util.*;
// public class IntersectionArray {
//     public static ArrayList<Integer> intersection(int[] arr1, int[] arr2, int n, int m) {
//         ArrayList<Integer> instersection = new ArrayList<>();
//         int i = 0, j = 0;
//         while(i < n && j < m){
//         if(arr1[i]<arr2[j]){
//             i++;
//         }
//         else if(arr1[i]>arr2[j]){
//             j++;
//         }
//         else{
//             instersection.add(arr1[i]);
//             i++;
//             j++;
//         }
//     }
//         return instersection;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of first Array : ");
//         int n = sc.nextInt();
//         int[] arr1 = new int[n];
//         System.out.println("Enter the elements of the array : ");
//         for (int i = 0; i < n; i++) {
//             arr1[i] = sc.nextInt();
//         }
//         ;
//         System.out.println("Enter the size of second Array : ");
//         int m = sc.nextInt();
//         int[] arr2 = new int[n];
//         System.out.println("Enter the elements of the array : ");
//         for (int i = 0; i < n; i++) {
//             arr2[i] = sc.nextInt();
//         }
//         ;
//         ArrayList<Integer> intersection = intersection(arr1, arr2, n, m);
//         System.out.println("Union of array 1 and array 2 is : ");
//         for (int val : intersection) {
//             System.out.print(val + " ");
//         }
//     }
// }
