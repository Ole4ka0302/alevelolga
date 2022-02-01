package hw1;

public class Task1 {
    public static void main(String[] args) {
        String name = "Olga";
        String surname = "Gostieva";
        String info = name + " " + surname;
        System.out.println(info);
        int length = name.length();
        if (length > 7) {
            System.out.println("more than 7");
        } else {
            System.out.println("less than 7");
        }
    }
}