package ASSIGNMENTS.ARRAY_AND_ARRAYLIST;
public class three_Largest_Elements {
    static void print3largest(int arr[], int arr_size) {
        int i, first, second, third;
        if (arr_size < 3) {
            System.out.print(" Invalid Input ");
            return;
        }
        third = first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }
            else if (arr[i] > third)
                third = arr[i];
        }
        System.out.println(first + " " + second + " " + third);
    }
    public static void main(String[] args)
    {
        int arr[] = { 1,2,3,4,5,6,7,8,9 };
        int n = arr.length;
        print3largest(arr, n);
    }
 }

