package ASSIGNMENTS.ARRAY_AND_ARRAYLIST;
import java.util.ArrayList;
public class duplicate_Element {
    static void findDuplicates(int arr[], int len) {
        boolean ifPresent = false;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    if (al.contains(arr[i])) {
                        break;
                    } else {
                        al.add(arr[i]);
                        ifPresent = true;
                    }
                }
            }
        }
        if (ifPresent == true) {
            System.out.print(al + " ");
        } else {
            System.out.print("No duplicates present in arrays");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,1,2,3,4,5,6,7,8 };
        int n = arr.length;
        findDuplicates(arr, n);
    }
}