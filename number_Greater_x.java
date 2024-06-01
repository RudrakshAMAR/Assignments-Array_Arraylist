package ASSIGNMENTS.ARRAY_AND_ARRAYLIST;

import java.util.ArrayList;

public class number_Greater_x {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        int x=5;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(x<arr[i]){
                ans.add(arr[i]);
            }
        }
        for(int ele: ans){
            System.out.print(ele+" ");
        }
    }
}
