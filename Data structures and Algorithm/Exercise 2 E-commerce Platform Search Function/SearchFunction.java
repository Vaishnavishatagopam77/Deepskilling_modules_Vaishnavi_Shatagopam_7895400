import java.util.Arrays;
import java.util.Comparator;

public class SearchFunction {
    public static Product linearSearch(Product[] products, String target) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(target)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, String target) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = products[mid].productName
                    .compareToIgnoreCase(target);

            if (result == 0)
                return products[mid];
            else if (result < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mouse", "Electronics"),
            new Product(103, "Keyboard", "Electronics"),
            new Product(104, "Monitor", "Electronics"),
            new Product(105, "Printer", "Electronics")
        };
        Product p1 = linearSearch(products, "Monitor");
        if (p1 != null)
            System.out.println("Found using Linear Search: " + p1.productName);
        Arrays.sort(products,
                Comparator.comparing(p -> p.productName));
        Product p2 = binarySearch(products, "Monitor");

        if (p2 != null)
            System.out.println("Found using Binary Search: " + p2.productName);
    }
}