package Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_2 {
    public static void main(String[] args) {
        String secondTask = "            Removing        Extra Spaces       Between Words in  the             text  ";
        System.out.println(secondTask);
        Pattern pattern = Pattern.compile("[\\s]{2,}");
        Matcher matcher = pattern.matcher(secondTask);
        secondTask = matcher.replaceAll( " ").replaceFirst("[\\s]+", "");
        System.out.println(secondTask);

    }
}
