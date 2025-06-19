public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Shoes", "Fashion"),
            new Product("P003", "Mobile", "Electronics"),
            new Product("P004", "Watch", "Accessories"),
            new Product("P005", "Tablet", "Electronics")
        };

        String target = "Mobile";

        System.out.println("Linear Search:");
        int index1 = SearchAlgorithms.linearSearch(products, target);
        System.out.println(index1 >= 0 ? "Found at index: " + index1 : "Product not found");

        System.out.println("\nBinary Search:");
        int index2 = SearchAlgorithms.binarySearch(products, target);
        System.out.println(index2 >= 0 ? "Found at index: " + index2 : "Product not found");
    }
}

