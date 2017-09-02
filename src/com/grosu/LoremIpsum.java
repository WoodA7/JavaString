package com.grosu;

public class LoremIpsum {
    private String str;

    LoremIpsum(String s) {
        str = s;
    }

    public int lengh() {
        return str.length();
    }

    public int countOfWords() {
        String[] result = str.split(" ");
        return result.length;
    }

    public String changeS() {
        if (str.contains("s")) {
            str = str.replace('s', '*');
            return str;
        } else
            return "s not found";
    }
}
