public class Furniture {
    String color;
    int grade;
    String type;
    boolean isOutdoor;


    public Furniture() {
    }


    public Furniture(String col, int grd, String typ, boolean outdoor) {
        color = col;
        grade = grd;
        type = typ;
        isOutdoor = outdoor;
    }


    public double calculatePrice(double price) {
        if (isOutdoor) {
            return price * 0.95;
        } else {
            return price;
        }
    }

    // Main method
    public static void main(String[] args) {
        Furniture item = new Furniture("Red", 1, "Chair", true);
        double price = 100.0;
        System.out.println("Final Price: " + item.calculatePrice(price));
    }
}
