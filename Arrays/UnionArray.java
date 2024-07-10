// //Time Complexity:O(m+m)log(m+n)
// //Space Complexity:O(m+n)
// import java.util.*;
// public class UnionArray {
//         public static ArrayList<Integer> union(int[] arr,int[] arr1,int n,int m){
//             HashSet<Integer> s = new HashSet<>();
//             ArrayList<Integer> Union = new ArrayList<>();
//             for(int i=0;i<n;i++){
//                 s.add(arr[i]);
//             }
//             for(int i=0;i<m;i++){
//                 s.add(arr1[i]);
//             }
//             for(int it: s){
//                 Union.add(it);
//             }
//             return Union;
//         }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of first Array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter the elements of the array : ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         };
//         System.out.println("Enter the size of second Array : ");
//         int m = sc.nextInt();
//         int[] arr1 = new int[n];
//         System.out.println("Enter the elements of the array : ");
//         for (int i = 0; i < n; i++) {
//             arr1[i] = sc.nextInt();
//         };
//         ArrayList<Integer> Union = union(arr, arr1, n, m);
//         System.out.println("Union of array 1 and array 2 is : ");
//         for(int val: Union){
//             System.out.print(val+" ");
//         }
//     }
// }

// // Time Complexity: O(m+n)
// // Space Complexity: O(m+n)
// // Assuming arrays are already sorted
// import java.util.*;
// public class UnionArray {
//     public static ArrayList<Integer> union(int[] arr1, int[] arr2, int n, int m) {
//         int i = 0, j = 0; 
//         ArrayList<Integer> Union = new ArrayList<>(); 
//         while (i < n && j < m) {
//             if (arr1[i] <= arr2[j]) 
//             {
//                 if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
//                     Union.add(arr1[i]);
//                 i++;
//             } else 
//             {
//                 if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j])
//                     Union.add(arr2[j]);
//                 j++;
//             }
//         }
//         while (i < n) 
//         {
//             if (Union.get(Union.size() - 1) != arr1[i])
//                 Union.add(arr1[i]);
//             i++;
//         }
//         while (j < m) 
//         {
//             if (Union.get(Union.size() - 1) != arr2[j])
//                 Union.add(arr2[j]);
//             j++;
//         }
//         return Union;
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
//         ArrayList<Integer> Union = union(arr1, arr2, n, m);
//         System.out.println("Union of array 1 and array 2 is : ");
//         for (int val : Union) {
//             System.out.print(val + " ");
//         }
//     }
// }