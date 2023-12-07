import java.util.*;
import java.util.Arrays;

class sortArray {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the element size: ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements in the list: ");
        for(int i=0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The sorted array is: ");
        for(int i=0; i < n ;i++){
            System.out.println(arr[i]);
        }
        scan.close();
    }
}
