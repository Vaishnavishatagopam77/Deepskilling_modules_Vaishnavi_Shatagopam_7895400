public class Main {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();

        product p1 = new product(101, "Laptop", 10, 50000);
        product p2 = new product(102, "Mouse", 50, 500);

        manager.addProduct(p1);
        manager.addProduct(p2);

        System.out.println("\nInventory:");
        manager.displayProducts();

        manager.updateProduct(101,
                              "Gaming Laptop",
                              8,
                              65000);

        System.out.println("\nAfter Update:");
        manager.displayProducts();

        manager.deleteProduct(102);

        System.out.println("\nAfter Deletion:");
        manager.displayProducts();
    }
}