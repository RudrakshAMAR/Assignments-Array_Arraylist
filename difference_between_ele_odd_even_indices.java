package ASSIGNMENTS.ARRAY_AND_ARRAYLIST;

public class difference_between_ele_odd_even_indices {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        int sumeven=0;
        int sumodd=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                sumeven+=arr[i];
            }
            else sumodd+=arr[i];
        }
        System.out.println(sumeven-sumodd);
    }
}
