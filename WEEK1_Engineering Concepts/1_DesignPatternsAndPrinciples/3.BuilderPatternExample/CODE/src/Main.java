

public class Main {
    public static void main(String[] args) {
        // Basic configuration
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB")
                                        .build();

        // Gaming configuration
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                                        .setStorage("1TB SSD")
                                        .setGpu("NVIDIA RTX 4090")
                                        .setOs("Windows 11")
                                        .build();

        // Linux workstation
        Computer linuxWorkstation = new Computer.Builder("Ryzen 7", "16GB")
                                        .setStorage("512GB SSD")
                                        .setOs("Ubuntu 22.04")
                                        .build();

        // Display Configs
        System.out.println("Basic Computer:");
        basicComputer.displayConfig();

        System.out.println("Gaming Computer:");
        gamingComputer.displayConfig();

        System.out.println("Linux Workstation:");
        linuxWorkstation.displayConfig();
    }
}
