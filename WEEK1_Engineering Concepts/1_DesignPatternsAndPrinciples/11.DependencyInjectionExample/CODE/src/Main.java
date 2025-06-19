public class Main {
    public static void main(String[] args) {
        // Create repository
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject dependency into service
        CustomerService service = new CustomerService(repository);

        // Use service
        System.out.println("Fetching C101:");
        service.displayCustomer("C101");

        System.out.println("\nFetching C999:");
        service.displayCustomer("C999");
    }
}
