public class NumberExampleTest {
    private static NumberExample numberExample;
    public static final String[] invalidNumber = new String[] { "84-0978489648" };
    public static final String[] validNumber = new String[] { "a8-22222222" };
    public static void main(String[] args) {
        numberExample = new NumberExample();
        for (String a :invalidNumber) {
            boolean isvalid = numberExample.validate(a);
            System.out.println("Class is " + a +" is valid: "+ isvalid);
        }
        for (String b :validNumber) {
            boolean valid = numberExample.validate(b);
            System.out.println("Class is " + b +" is valid: "+ valid);
        }
    }
}
