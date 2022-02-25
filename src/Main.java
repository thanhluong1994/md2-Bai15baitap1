public class Main {
    public static void main(String[] args) {
        try {
            Triangle tria = new Triangle(2, 2, 3);
        }catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
