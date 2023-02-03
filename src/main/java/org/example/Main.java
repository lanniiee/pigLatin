package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Main {

    // if word begin with vowels -> take first letter and add way
    // if not vowels -> take first letter and add ay

    // another -> nother-away
    // pig -> ig-pay



    public static String checkVowels (String x) {

        String result;
        String[] vowels = {"a", "e", "i", "o", "u", "y", "A", "E", "I", "O", "U", "Y"};

        if (Arrays.asList(vowels).contains(x)) {
            result = x + "way";
        } else {
            result = x + "ay";
        }

        return result;
    }

    public static String pigLatinize(String phrase) {
        String finalResult = "";
        if (phrase.contains(" ")) {
            String[] strArr = phrase.split(" ");

            for (int i = 0; i < strArr.length; i++) {
                String subStr = strArr[i].substring(1);
                String result = checkVowels(String.valueOf(strArr[i].charAt(0)));
                String newStr = subStr + "-" + result + " ";
                finalResult += newStr;
            }
        } else {
            String subStr = phrase.substring(1);
            finalResult = subStr + "-"  + checkVowels(String.valueOf(phrase.charAt(0)));
        }

        return finalResult;
    }

    public static void main(String[] args) {
        System.out.println(pigLatinize("Pig Latin"));
        System.out.println(pigLatinize("pig"));
        System.out.println(pigLatinize("another one"));
        System.out.println(pigLatinize("pig latin another one"));

    }
}