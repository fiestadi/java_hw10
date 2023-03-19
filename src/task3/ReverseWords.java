package task3;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "I like Java";
        reverseWords(str);

    }
    public static void reverseWords(String str) {
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
    }

