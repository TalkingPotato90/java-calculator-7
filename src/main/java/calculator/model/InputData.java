package calculator.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputData {
    private final String input;

    public InputData(String input) {
        this.input = input;
    }

    public void validate(String input){
        Pattern endPattern = Pattern.compile(".*[0-9]$");
        Matcher endMatcher = endPattern.matcher(input);

        Pattern startPattern = Pattern.compile("^[0-9/].*");
        Matcher startMatcher = startPattern.matcher(input);

        if(!endMatcher.matches()){
            throw new IllegalArgumentException();
        }

        if(!startMatcher.matches()){
            throw new IllegalArgumentException();
        }
    }
}
