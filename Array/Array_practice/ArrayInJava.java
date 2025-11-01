public class ArrayInJava{
    public static void main(String[] age){
        // declare array
        int[] arr = {3, 4, 5, 6, 7};
        // System.out.println(arr[2]);

        arr[2] = 8;
        // print element
        for (int i = 0; i < arr.length; i++){
            // System.out.println(arr[i]);
        }


        // insert 25 in array
        int[] newArr = new int[arr.length + 1];
        
        for (int i = 0; i < 2; i++) {
            newArr[i] = arr[i];
            System.out.println(newArr[i]);
        }
        System.out.println("--------------------------");
        System.out.println("--------------------------");
        System.out.println();

        newArr[2] = 25;

        for (int i = 0; i < arr.length; i++){
            newArr[i + 1] = arr[i];
            System.out.println(newArr[i]);
        }
        

    }
}