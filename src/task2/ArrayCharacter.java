package task2;

public class ArrayCharacter {
    public static void main(String[] args) {
        char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};
        String str = new String(arr);
        str = str.replace("?", "e");
        System.out.println(str);

    }
}
