package com.company;

public class StringManipulation {

    public StringManipulation() {}

    public boolean equation(String firstWord, String secondWord) {
        String[] first = (firstWord.split(""));
        String[] second = (secondWord.split(""));

        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                System.out.println("false");

                return false;
            }
        }
        System.out.println("true");

        return true;
    }

    public static void main(String[] args) {

        String firstWord = "cat";
        String secondWord = "dog";

        StringManipulation test = new StringManipulation();

        test.equation(firstWord, secondWord);
    }

}

