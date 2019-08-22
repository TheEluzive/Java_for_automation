package Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_3 {
    public static void main(String[] args) {
        String thirdTask =  "password wword word Heeeeeeello";
        String result = "";
        String[] words = thirdTask.trim().split(" ");

        Pattern pattern = Pattern.compile("(\\w)\\1+");
        Matcher matcher;
        for (String word : words) {
            matcher = pattern.matcher(word);
            if(!matcher.find()){
                result += word + " ";
            }

        }
        System.out.println(result);
    }
}
