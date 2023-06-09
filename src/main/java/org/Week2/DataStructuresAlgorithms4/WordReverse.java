package org.Week2.DataStructuresAlgorithms4;

    public class WordReverse {
        public static String reverseWords(String sentence) {
            String[] words = sentence.split(" ");
            StringBuilder reversedSentence = new StringBuilder();

            for (String word : words) {
                String reversedWord = reverseString(word);
                reversedSentence.append(reversedWord).append(" ");
            }

            return reversedSentence.toString().trim();
        }

        public static String reverseString(String str) {
            char[] characters = str.toCharArray();
            int left = 0;
            int right = characters.length - 1;

            while (left < right) {
                char temp = characters[left];
                characters[left] = characters[right];
                characters[right] = temp;

                left++;
                right--;
            }

            return new String(characters);
        }

        public static void main(String[] args) {
            String sentence = "Java J2EE Reverse Me";
            String reversedSentence = reverseWords(sentence);
            System.out.println("Reversed Sentence: " + reversedSentence);
        }
    }

