package main.java.ua.lviv.iot.text;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Input {

    private String input;
    private Set<String> indexSet;
    private Set<String> indexLvivSet;
    private static String indexPattern = "7[0-9][0-9][0-9][0-9]";
    private static String indexLvivPattern = "790[0-9][0-9]";

    public Input(final String input) throws NullPointerException {
        if (input != null) {
            this.input = input;
            indexSet = new HashSet<>();
            indexLvivSet = new HashSet<>();
        } else {
            throw new NullPointerException();
        }
    }

    public Set<String> getIndexLvivSet() {
        return indexLvivSet;
    }

    public void findIndex() {
        Pattern pattern = Pattern.compile(indexPattern);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            indexSet.add(matcher.group());
        }
    }
    
    public String findIndexesLviv() {
        this.findIndex();
        if (indexSet.size() != 0) {
            Pattern pattern = Pattern.compile(indexLvivPattern);
            Matcher matcher = pattern.matcher(indexSet.toString());
            while (matcher.find()) {
                indexLvivSet.add(matcher.group());
            }
            return indexLvivSet.toString();
        }
        return null;
    }

    public void showResults() {
        System.out.println("Lviv index:");
        System.out.println(this.findIndexesLviv());
    }
}
