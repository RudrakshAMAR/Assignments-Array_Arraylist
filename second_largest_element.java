package ASSIGNMENTS.ARRAY_AND_ARRAYLIST;
public class second_largest_element {
    public static void secondLargest(int[] arr, int arr_size)
    {
        int i, first, second;
        if (arr_size < 2) {
            System.out.print(" Invalid Input ");
            return;
        }
        first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second && arr[i] != first)
                second = arr[i];
        }
        if (second == Integer.MIN_VALUE)
            System.out.print("There is no second largest" + " element\n");
        else
            System.out.print("The second largest element" + " is " + second);
    }
    public static void main(String[] args)
    {
        int[] arr = { 1,4,2,3,5,8,6,7,0,9};
        int n = arr.length;
        secondLargest(arr, n);

    }
}
