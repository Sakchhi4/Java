import java.util.ArrayList;

public class Main {

    static class Product {
        String name;
        double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public void display() {
            System.out.println(name + " - ₹" + price);
        }
    }

    static class ShoppingCart {
        ArrayList<Product> products = new ArrayList<>();

        public void addProduct(Product product) {
            products.add(product);
            System.out.println(product.name + " added to cart.");
        }

        public void removeProduct(String productName) {
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).name.equalsIgnoreCase(productName)) {
                    products.remove(i);
                    System.out.println(productName + " removed from cart.");
                    return;
                }
            }
            System.out.println("Product not found.");
        }

        public double calculateTotalCost() {
            double total = 0;
            for (Product p : products) {
                total += p.price;
            }
            return total;
        }

        public void displayCart() {
            if (products.isEmpty()) {
                System.out.println("Cart is empty.");
            } else {
                System.out.println("\nProducts in Cart:");
                for (Product p : products) {
                    p.display();
                }
                System.out.println("Total Cost: ₹" + calculateTotalCost());
            }
        }
    }

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mouse", 500);
        Product p3 = new Product("Keyboard", 1200);

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.displayCart();

        cart.removeProduct("Mouse");

        cart.displayCart();
    }
}
