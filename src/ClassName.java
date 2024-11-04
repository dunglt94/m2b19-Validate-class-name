import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    public static final String CLASS_NAME_REGEX = "^[CAP]\\d{4}[GHIK]$";

    public ClassName() {}

    public boolean validate (String className) {
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher= pattern.matcher(className);
        return matcher.matches();
    }
}
