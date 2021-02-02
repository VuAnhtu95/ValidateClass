import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExampleTest {
    private static ClassExample classExample;
    public static final String[] invalidEmail = new String[] { "C0318G" , "P0318G" , "A0318G" };
    public static final String[] validEmail = new String[] { "M0318G","A0323E" };

    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String i :invalidEmail) {
            boolean isvalid = classExample.validate(i);
            System.out.println("Class is " + i +" is valid: "+ isvalid);
        }
        for (String j :validEmail) {
            boolean valid = classExample.validate(j);
            System.out.println("Class is " + j +" is valid: "+ valid);
        }
    }
}
