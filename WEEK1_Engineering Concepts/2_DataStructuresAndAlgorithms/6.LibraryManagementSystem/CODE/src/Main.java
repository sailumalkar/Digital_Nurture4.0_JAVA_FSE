public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "The Hobbit", "J.R.R. Tolkien"),
            new Book(2, "1984", "George Orwell"),
            new Book(3, "Pride and Prejudice", "Jane Austen"),
            new Book(4, "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book(5, "To Kill a Mockingbird", "Harper Lee")
        };

        String targetTitle = "The Great Gatsby";

        System.out.println("🔎 Linear Search:");
        Book result1 = SearchLibrary.linearSearch(books, targetTitle);
        System.out.println(result1 != null ? "Found: " + result1 : "Book not found.");

        System.out.println("\n🔎 Binary Search:");
        Book result2 = SearchLibrary.binarySearch(books, targetTitle);
        System.out.println(result2 != null ? "Found: " + result2 : "Book not found.");
    }
}
