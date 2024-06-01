package ASSIGNMENTS.ARRAY_AND_ARRAYLIST;

public class triplet_Sum_Equals_X {
    public static void main(String[] args) {
        int[] arr = {10, 30, 50,70,40,40,100,30,20};
        int n=arr.length;
        int x=150;
        for(int i=1;i<n-1;i++){
            if(arr[i-1]+arr[i]+arr[i+1]==x){
                System.out.println(arr[i-1]+","+arr[i]+","+arr[i+1]);
            }

        }
    }
}
