public class Agrs {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
         return b * b - 4 * a * c;
    }
    public double getRoot1() {
        return ((- this.b - Math.pow(this.getDiscriminant(),0.5)) / 2 * this.a);
    }
    public double getRoot2() {
        return ((- this.b + Math.pow(this.getDiscriminant(),0.5)) / 2 * this.a);
    }
}
