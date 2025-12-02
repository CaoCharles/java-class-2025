import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Product p = new Food(42,"Cake",2.99,LocalDate.now().plusDays(1));
        Product pp = new Food(87,"milktea",3.5,LocalDate.now());
        System.out.println(pp);
        System.out.println(p);

        Product p1 = new Product(42,"Cake",2.99);
        Product p2 = new Product(42,"Cake",2.99);
        boolean sameObject = (p1 == p2); // false
        boolean sameContent = (p1.equals(p2)); // true
        System.out.println(sameObject);
        System.out.println(sameContent);
    }
}
