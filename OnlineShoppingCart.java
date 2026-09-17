import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String productName;
    private int price;
    private int quantity;

    public Product(String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return productName + " x" + quantity + " = " + getTotal();
    }
}

class Order {
    private String orderId;
    private List<Product> products;

    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public int calculateTotal() {
        int total = 0;
        for (Product p : products) {
            total += p.getTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ID: ").append(orderId).append("\n");
        sb.append("Products:\n");
        for (Product p : products) {
            sb.append(p.toString()).append("\n");
        }
        sb.append("Total: ").append(calculateTotal());
        return sb.toString();
    }
}

public class OnlineShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read Order ID and number of items
        String orderId = sc.nextLine().trim();
        int n = Integer.parseInt(sc.nextLine().trim());

        Order order = new Order(orderId);

        // Read products
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            String[] parts = line.split(",\\s*");
            String name = parts[0];
            int price = Integer.parseInt(parts[1]);
            int qty = Integer.parseInt(parts[2]);

            order.addProduct(new Product(name, price, qty));
        }

        // Print order summary
        System.out.println(order);

        sc.close();
    }
}