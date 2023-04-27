package ua.lviv.iot.algo.part1.lab5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Redactor {
    public String toRedact(String string) {
        Pattern patternForText = Pattern.compile("(\\b\\w*[AaOrK]\\w*\\b\\s*)|(\\s*\\b\\w*[AaOrK]\\w*\\b\\s*$)");
        Matcher matcherForText = patternForText.matcher(string);
        String result = matcherForText.replaceAll("");

        return result;
    }

    public static void main(String[] args) {
        Redactor textRedactor = new Redactor();
        String string = "As programmer I like working with computers I Kyle";
        System.out.println(textRedactor.toRedact(string));
    }
}
