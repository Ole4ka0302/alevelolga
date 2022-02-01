package hw3;

public class Task2 {
    public static void main(String[] args) {
        String text = "Hello boys and girls";
        String next = text.trim().replaceAll(" +", " ");
        System.out.println(calcWordsHere(next, ' '));
    }

    private static int calcWordsHere(String next, char words) {
        int here = 1;
        for (int i = 0; i < next.length(); i++) {
            if (next.charAt(i) == words) {
                here++;
            }
        }
        return here;
    }
}
