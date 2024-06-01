package ASSIGNMENTS.ARRAY_AND_ARRAYLIST;

public class min_Element_Of_Array {
    public static void main(String[] args){
        int[] initializedArray = new int[] { 25, 110, 74, 75, 5 };
        int minValue = initializedArray[0];
        for (int i = 0; i < initializedArray.length; i++) {
            if (initializedArray[i] < minValue)
                minValue = initializedArray[i];
        }
        System.out.println("Smallest element present in given array: " + minValue);
    }
}
