package Section11_004;

import Section11_003.Message;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private static HashMap<Integer, Product> products = new HashMap<>();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-------Product Management-------\n" +
                    "1.Add Product\n" +
                    "2.Edit Product\n" +
                    "3.Delete Product\n" +
                    "4.Display Product\n" +
                    "5.Filter Product(Price>100)\n" +
                    "6.Total value of Products\n" +
                    "0.Exit");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addProduct(scanner);
                    break;
                case 2:
                    updateProduct(scanner);
                    break;
                case 3:
                    deleteProduct(scanner);
                    break;
                case 4:
                    if (products.isEmpty()){
                        System.out.println("No products found");
                    }else {
                        displayProducts();
                    }
                    break;
                case 5:
                    filterProducts();
                    break;
                case 6:
                    totalValueOfProducts();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.err.println("Invalid choice!Please try again!");
            }


        } while (true);
    }

    public static void addProduct(Scanner scanner) {
        System.out.println("Enter product ID: ");
        int productId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter product Name: ");
        String productName = scanner.nextLine();
        System.out.println("Enter product Price: ");
        double productPrice = Integer.parseInt(scanner.nextLine());

        products.put(productId, new Product(productId, productName, productPrice));
    }

    public static void displayProducts() {
        for (HashMap.Entry<Integer, Product> entry: products.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getProductName() + ": " + entry.getValue().getProductPrice());
        }
    }

    public static void deleteProduct(Scanner scanner) {
        System.out.println("Enter product ID: ");
        int productId = Integer.parseInt(scanner.nextLine());
        products.remove(productId);
    }
    public static void updateProduct(Scanner scanner) {
        System.out.println("Enter product ID: ");
        int productId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter product Name: ");
        String productName = scanner.nextLine();
        System.out.println("Enter product Price: ");
        double productPrice = Integer.parseInt(scanner.nextLine());
        products.put(productId, new Product(productId, productName, productPrice));
    }
    public static void filterProducts() {
        products.values().stream()
                .filter(product -> product.getProductPrice()>100)
                    .forEach(System.out::println);
    }
    public static void totalValueOfProducts() {
        double totalValue = products.values().stream()
                .mapToDouble(Product::getProductPrice)
                .sum();
        System.out.println("total value of products: " + totalValue);
    }

}
