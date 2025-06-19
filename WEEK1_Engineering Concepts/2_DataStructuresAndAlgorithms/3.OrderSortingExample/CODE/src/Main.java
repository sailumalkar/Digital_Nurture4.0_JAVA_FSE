public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O101", "Alice", 2500.0),
            new Order("O102", "Bob", 999.0),
            new Order("O103", "Charlie", 4500.0),
            new Order("O104", "Daisy", 1200.0),
            new Order("O105", "Evan", 2999.0)
        };

        System.out.println("Original Orders:");
        printOrders(orders);

        // Bubble Sort
        System.out.println("\nSorted by Bubble Sort:");
        BubbleSort.sort(orders);
        printOrders(orders);

        // Reset array
        Order[] newOrders = {
            new Order("O101", "Alice", 2500.0),
            new Order("O102", "Bob", 999.0),
            new Order("O103", "Charlie", 4500.0),
            new Order("O104", "Daisy", 1200.0),
            new Order("O105", "Evan", 2999.0)
        };

        // Quick Sort
        System.out.println("\nSorted by Quick Sort:");
        QuickSort.sort(newOrders, 0, newOrders.length - 1);
        printOrders(newOrders);
    }

    public static void printOrders(Order[] orders) {
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}

