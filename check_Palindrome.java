package ASSIGNMENTS.ARRAY_AND_ARRAYLIST;

public class check_Palindrome {
    public static void main(String[] args) {
        String str = "farigiraf";
        int i = 0, j = str.length() - 1;
        boolean flag = false;
        while (i < j) {
            flag = false;
            if (str.charAt(i) == str.charAt(j)) {
                flag = true;
            }
            i++;
            j--;
        }
        if (flag == false) {
            System.out.println("Not Palindrome");
        } else {
            System.out.println("Palindrome");
        }

    }
}
