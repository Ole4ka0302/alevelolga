public class Task2 {
    public static void main(String[] args) {
        String textWithWords = "Hello boys and girls";
        System.out.println(calcWordsHere(textWithWords, ' '));
    }

    private static int calcWordsHere(String textWithWords, char words) {
        int here = 1;
        for (int i =1; i < textWithWords.length(); i++) {
            if (textWithWords.charAt(i) == words) {
                here++;
            }
        }
        return here;
    }
}
