package StringLec;

public class Operator {
    public static void main(String[] args) {

        System.out.println('a' + 'b');
        System.out.println("a" + "b");  // only operator that is overloaded in java to support string concatenation
        System.out.println((char) ('a' - 3)); // can also be  +
        System.out.println("a" + 1); // Converted to Integer that will call toString

    }
}
