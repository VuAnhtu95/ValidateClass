import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExample {
    private static final String NUMBER_REGEX = "^\\d{2}-[0]\\d{9}";
    public NumberExample(){}
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}