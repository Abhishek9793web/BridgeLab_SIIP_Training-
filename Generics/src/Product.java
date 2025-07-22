import java.util.ArrayList;
import java.util.List;

interface BookCategory {}
interface ClothingCategory {}
 interface GadgetCategory {}

public class Product <T>{
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() { return name; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public T getCategory() { return category; }

    @Override
    public String toString() {
        return name + " - $" + price + " [" + category.getClass().getSimpleName() + "]";
    }
}
  enum Books implements BookCategory {
     FICTION, NONFICTION, SCIENCE, HISTORY
 }

 enum Clothing implements ClothingCategory {
     SHIRT, TROUSERS, JACKET
 }

 enum Gadgets implements GadgetCategory {
     PHONE, LAPTOP, TABLET
 }
 class MarketplaceUtils {
     public static <T> void applyDiscount(Product<T> product, double percentage) {
         double oldPrice = product.getPrice();
         double newPrice = oldPrice - (oldPrice * (percentage / 100));
         product.setPrice(newPrice);
         System.out.println("Applied " + percentage + "% discount on " + product.getName() +
                 ". New Price: $" + newPrice);
     }
 }

 class ain{
     public static void main(String[] args) {
         Product<BookCategory> book = new Product<>("The Alchemist", 500.0, Books.FICTION);
         Product<ClothingCategory> shirt = new Product<>("Formal Shirt", 1200.0, Clothing.SHIRT);
         Product<GadgetCategory> laptop = new Product<>("Gaming Laptop", 80000.0, Gadgets.LAPTOP);

         // Catalog can store all types
         List<Product<?>> catalog = new ArrayList<>();
         catalog.add(book);
         catalog.add(shirt);
         catalog.add(laptop);

         // Apply discounts
         MarketplaceUtils.applyDiscount(book, 10);
         MarketplaceUtils.applyDiscount(shirt, 15);
         MarketplaceUtils.applyDiscount(laptop, 5);

         // Display catalog
         System.out.println("\n=== Product Catalog ===");
         for (Product<?> p : catalog) {
             System.out.println(p);
         }
     }
 }