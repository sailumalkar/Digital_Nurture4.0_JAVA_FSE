public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("mountain.jpg");

        System.out.println("First call:");
        image1.display(); // should load from remote

        System.out.println("\nSecond call:");
        image1.display(); // should load from cache

        System.out.println("\nThird call with new file:");
        Image image2 = new ProxyImage("ocean.jpg");
        image2.display(); // load from remote
    }
}
