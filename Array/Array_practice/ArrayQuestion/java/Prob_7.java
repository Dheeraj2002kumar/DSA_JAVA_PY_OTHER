package ArrayQuestion.java;
// 2. Insert an element at the beginning

public class Prob_7 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 8, 4};
        
        int[] newArray = new int[arr.length + 1];

        newArray[0] = 55;
        for (int i = 0; i < arr.length; i++){
            newArray[i + 1] = arr[i];
        }

        for (int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i]);
        }
    }
}
