import java.util.Scanner;

class Product {
    int pid;
    double price;
    int quantity;

    // Parameterized constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public double getAmount() {
        return price * quantity;
    }
}

class XYZ {
    // Method to calculate the total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.getAmount();
        }
        return totalAmount;
    }

    // Method to find the product ID with the highest price
    public static int findHighestPricedProduct(Product[] products) {
        double maxPrice = products[0].price;
        int maxPid = products[0].pid;
        for (Product product : products) {
            if (product.price > maxPrice) {
                maxPrice = product.price;
                maxPid = product.pid;
            }
        }
        return maxPid;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accepting product information from user
        for (int i = 0; i < products.length; i++) {
            System.out.print("Enter Product ID: ");
            int pid = scanner.nextInt();
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        // Finding the product ID with the highest price
        int highestPricedProductId = findHighestPricedProduct(products);
        System.out.println("Product ID with the highest price: " + highestPricedProductId);

        // Calculating the total amount spent on all products
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);

        scanner.close();
    }
}
