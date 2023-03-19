package task1;

public class StringMetod {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Diana";
        reverseConcat(str1, str2);
    }
    public static void reverseConcat(String str1, String str2) {
        String concatenated = str1 + str2;
        String reversed = new StringBuilder(concatenated).reverse().toString();
        System.out.println(reversed);
    }
}
