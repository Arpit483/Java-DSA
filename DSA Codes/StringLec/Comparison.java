package StringLec;

public class Comparison {
    public static void main(String[] args) {
//        String  a = "Hello";
//        String b = "Hello";
//        System.out.println(a == b);
//        String c = new String("Hello");
//        String d = new String("Hello");
//        System.out.println(c == d );
//
        String op = "1.1.1.1";
        System.out.println(op.charAt(3));
        System.out.println(op.replace("." , "[.]"));

        String a = op.replace("." , "[.]");
        System.out.println(a);
    }


}
