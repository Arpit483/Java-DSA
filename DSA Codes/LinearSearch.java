public class LinearSearch{
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int[] arr = {1, 2, 3, 4, 5};
        int x = 1; // Element to search for
        int result = LinearSearchEnhanced(arr, x);
        switch (result) {
            case-1:
                System.out.println("Element not found in the array.");
                break;
            default:
                System.out.println("Element is: " + result);
                break;
        }

    }

    static int LinearSearch(int[] arr, int x ){
        if (arr.length == 0 ){
            return -1; // Array is empty
        }
        for (int i =0 ; i <arr.length; i++) {
            if (arr[i] == x) {
                return i; // Element found
            }

        }        
        return -1; // Element not found
    }

     static int LinearSearchEnhanced(int[] arr, int x ){
        if (arr.length == 0 ){
            return -1; // Array is empty
        }
        for (int Element:arr) {
            if (Element == x) {
                return Element; // Element found
            }

        }        
        return -1; // Element not found
    }
}

