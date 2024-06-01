package ASSIGNMENTS.ARRAY_AND_ARRAYLIST;

public class product_Elements {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int prod=1;
        for(int i=0;i<arr.length;i++){
            prod*=arr[i];
        }
        System.out.println(prod);
    }
}
