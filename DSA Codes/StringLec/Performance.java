package StringLec;

public class Performance {
    public static void main(String[] args) {
        String s = " ";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i );
            System.out.print(ch + " ");
            s = s + ch;
        }
        System.out.println(s);
    }
}
