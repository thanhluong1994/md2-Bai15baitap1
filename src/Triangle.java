public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Canh khong duoc am ");
        }
        if (a + b <= c || b + c <= a || c + a <= b) {
            throw new IllegalTriangleException("Khong phai la tam giac");
        }else
        if (a + b > c || b + c > a || c + a > b){
            throw new IllegalTriangleException("Tam giac co canh a: " + a + ", canh b: " + b + ", canh c: " + c );
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}