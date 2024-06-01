package ASSIGNMENTS.ARRAY_AND_ARRAYLIST;

public class check_Sorted {
    public static void main(String[] args) {
        //int[] arr={1,3,4,5,6,2,8,7};
        int[] arr={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        boolean flag=true;
        for(int i=1;i<n-1;i++){
            if(arr[i-1]<=arr[i] && arr[i+1]>arr[i]){
                continue;
            }
            else{
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("sorted");
        }
        else{
            System.out.println("Unsorted");
        }
    }
}
