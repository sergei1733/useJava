package split;

public class Main {
    public static void main(String[] args) {
        String str = "я в отпуске";
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
