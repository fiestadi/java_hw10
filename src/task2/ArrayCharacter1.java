package task2;

public class ArrayCharacter1 {
    public static void main(String[] args) {
        char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};
        replaceChar(arr);

    }
    public static void replaceChar(char[] arr) {
        String str = new String(arr);
        str = str.replace("?", "e");
        System.out.println(str);
    }

}


