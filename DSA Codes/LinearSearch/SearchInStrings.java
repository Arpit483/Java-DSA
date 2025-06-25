package LinearSearch;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String a = "Hello";
        char tar = 'i';
        System.out.println(search(a , tar));
        System.out.println(Arrays.toString(a.toCharArray()));
    }
    static boolean search(String str , char ch){
        if (str.isEmpty()) {
            return false;
        }
        for (char temp : str.toCharArray() ) {
            if (temp == ch ) {
             return true;   
            }
        }
        return false;
    }
}
