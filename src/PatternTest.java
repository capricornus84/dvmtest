import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PatternTest {
    public static void main(String[] args) {
        //брать из текста номер телефона в формате 8(999)999-99-99
        String text = "Этот номер телефона 8(926)123-45-67 рабочий";
        Pattern pattern = Pattern.compile("8[\\(][0-9]{3}[\\)][0-9]{3}[\\-][0-9]{2}[\\-][0-9]{2}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Found match\n" + text.substring(start, end) + "\nfrom " + start + " to " + (end - 1));
        }
        //System.out.println(matcher.replaceAll(""));
    }
}
