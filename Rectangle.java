import java.util.Scanner;

class Area {
    private int length;
    private int breadth;

    public Area(int l, int b) {
        length = l;
        breadth = b;
    }

    public int returnArea() {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        int length = scanner.nextInt();

        System.out.print("Enter breadth of rectangle: ");
        int breadth = scanner.nextInt();

        Area area = new Area(length, breadth);

        System.out.println("Area of rectangle: " + area.returnArea());
    }
}
