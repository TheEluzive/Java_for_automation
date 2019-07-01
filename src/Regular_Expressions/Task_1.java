package Regular_Expressions;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_1 {

    public static void main(String[] args) {
        String firstTask =  "Word cAT DATA A site Java tExt";
        Pattern pattern = Pattern.compile("\\b[A-Z].*?\\b");
        Matcher matcher = pattern.matcher(firstTask);
        System.out.println(firstTask);
        while (matcher.find()){
            System.out.print(firstTask.substring(matcher.start(), matcher.end()) + " ");
        }







    }
}
