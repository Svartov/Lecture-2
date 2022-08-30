public class Geron {
    public static void main(String[] args) {
        double a = 0.3;
        double b = 0.4;
        double c = 0.5;
        double p;
        double s;
        p = (a + b + c) / 2;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println(s);
    }
}
