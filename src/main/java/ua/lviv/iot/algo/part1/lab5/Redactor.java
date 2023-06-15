package ua.lviv.iot.algo.part1.lab5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Redactor {
    public static final Pattern patternForWordsNeedToDelete = Pattern.compile("(\\b\\w*[AaOrK]\\w*\\b\\s*)|(\\s*\\b\\w*[AaOrK]\\w*\\b\\s*$)");
    public String deleteWordsWithSomeLetters(String string) {
        Matcher matcherForText = patternForWordsNeedToDelete.matcher(string);

        return matcherForText.replaceAll("");
    }

    public static void main(String[] args) {
        Redactor textRedactor = new Redactor();
        System.out.println(textRedactor.deleteWordsWithSomeLetters(args[0]));
    }
}
