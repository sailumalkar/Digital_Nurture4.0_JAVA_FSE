import java.util.Arrays;

public class SearchAlgorithms {

    // Linear Search
    public static int linearSearch(Product[] products, String target) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search
    public static int binarySearch(Product[] products, String target) {
        Arrays.sort(products); // Ensure array is sorted
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = target.compareToIgnoreCase(products[mid].getProductName());
            if (cmp == 0) return mid;
            else if (cmp < 0) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}

