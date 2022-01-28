public class Main3 {
    public static void main(String[] args) {
        String text = "Hello students";
        System.out.println(isPalindrome(text));
    }

    public static boolean isPalindrome(String text) {
        String getText = text.replaceAll(" ", "");
        System.out.println(getText);
        int stringLength = getText.length();
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = getText.charAt(i) + result;
        }
        return text.equalsIgnoreCase(getText);
    }

}
