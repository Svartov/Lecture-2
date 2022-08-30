public class Geron {
    public static void main(String[] args) {
        float a = 0.3F;
        float b = 0.4F;
        float c = 0.5F;
        float p;
        float s;
        p = (a + b + c) / 2;
        s = (float)Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println(s);
    }
}
