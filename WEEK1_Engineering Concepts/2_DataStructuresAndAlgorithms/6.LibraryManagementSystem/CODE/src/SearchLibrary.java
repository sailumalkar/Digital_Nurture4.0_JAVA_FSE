import java.util.Arrays;

public class SearchLibrary {

    // Linear Search
    public static Book linearSearch(Book[] books, String target) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(target)) {
                return book;
            }
        }
        return null;
    }

    // Binary Search (assumes books are sorted by title)
    public static Book binarySearch(Book[] books, String target) {
        Arrays.sort(books); // ensure sorted
        int low = 0, high = books.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = target.compareToIgnoreCase(books[mid].getTitle());
            if (cmp == 0) return books[mid];
            else if (cmp < 0) high = mid - 1;
            else low = mid + 1;
        }
        return null;
    }
}
