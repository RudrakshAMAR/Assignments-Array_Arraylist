package ASSIGNMENTS.ARRAY_AND_ARRAYLIST;

public class merge_Two_Sorted_Array {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.println(ele+" ");
        }
        System.out.println();
    }
    public static void merge(int[] a, int[] b, int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
            }
            else{
                c[k]=b[j];
                j++;
            }
            k++;
        }
        if(i==a.length){
            while(j<b.length){
                c[k]=b[j];
                j++;k++;
            }
        }
        if(j==b.length){
            while(i<a.length){
                c[k]=a[i];
                i++;k++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 30, 50, 70,90};
        int[] brr = {20, 40, 60, 80};
        int[] ans = new int[arr.length + brr.length];
        merge(arr,brr,ans);
        print(ans);
    }
}
