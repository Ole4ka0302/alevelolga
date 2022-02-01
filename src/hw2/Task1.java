package hw2;

public class Task1 {
    public static void main(String[] args) {
        double x1 = 2, y1 = 5, x2 = 5, y2 = 7, x3 = -6, y3 = -2;
        double z = (x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1);
        double sq = Math.abs(z) / 2;
        System.out.println(sq);
    }
}