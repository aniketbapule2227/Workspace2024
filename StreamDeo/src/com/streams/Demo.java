package com.streams;

public class Demo{
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        printCharacterOccurrence(inputString);
    }

    private static void printCharacterOccurrence(String str) {
        // Assuming ASCII characters, you can increase the array size accordingly
        int[] charOccurrences = new int[256]; 

        // Converting the string to char array
        char[] charArray = str.toCharArray();

        // Iterating through each character in the array
        for (char c : charArray) {
            // Updating the occurrence count in the array
            charOccurrences[c]++;
        }

        // Printing the occurrences
        System.out.println("Character occurrences in the string:");
        for (int i = 0; i < charOccurrences.length; i++) {
            if (charOccurrences[i] > 0) {
                System.out.println("'" + (char) i + "': " + charOccurrences[i] + " times");
            }
        }
    }
}
