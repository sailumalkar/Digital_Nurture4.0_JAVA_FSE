public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Add products
        manager.addProduct(new Product("P001", "Keyboard", 50, 999.99));
        manager.addProduct(new Product("P002", "Mouse", 30, 499.49));
        manager.addProduct(new Product("P003", "Monitor", 20, 8999.00));

        // Update product
        manager.updateProduct("P002", "Wireless Mouse", 35, 699.99);

        // Delete product
        manager.deleteProduct("P003");

        // Display all products
        System.out.println("\nFinal Inventory:");
        manager.displayAllProducts();
    }
}

