package com.example.firstlesson;

public class First_Lesson {
    public static String rotate(String sourceString, String ignoredCharsString) {
        String[] sourceWords = sourceString.split(" ");
        char[] ignoredChars = ignoredCharsString.toCharArray();
        char[][] words = new char[sourceWords.length][];
        for (int i = 0; i < sourceWords.length; i++) {
            words[i] = sourceWords[i].toCharArray();
        }
        for (char[] word : words) {
            reverse(word, ignoredChars);
        }
        if (words.length == 0) return "..";

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(words[0]);
        for (int i = 1; i < words.length; i++) {
            stringBuilder.append(" ");
            stringBuilder.append(words[i]);
        }

        return stringBuilder.toString();
    }

    private static void reverse(char[] source, char[] ignoredChars) {
        int i = 0, j = source.length - 1;
        while (i < j) {
            if (isContainsIgnoredChars(source[i], ignoredChars)) {
                i++;
                continue;
            } else if (isContainsIgnoredChars(source[j], ignoredChars)) {
                j--;
                continue;
            }
            char temp = source[i];
            source[i] = source[j];
            source[j] = temp;
            i++;
            j--;
        }
    }

    private static boolean isContainsIgnoredChars(char chr, char[] ignored) {
        if (ignored.length == 0) return false;

        for (char ignoredChar : ignored)
            if (chr == ignoredChar) return true;

        return false;
    }

}
