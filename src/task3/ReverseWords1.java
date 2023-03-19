package task3;

public class ReverseWords1 {
    public static void main(String[] args) {
        reverseWords("I like Java");
    }
    public static void reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String reversedWord = new StringBuilder(words[i]).reverse().toString();
            output.append(reversedWord);
            if (i != words.length - 1) {
                output.append(" ");
            }
        }
        System.out.println(output.toString());
    }
}

