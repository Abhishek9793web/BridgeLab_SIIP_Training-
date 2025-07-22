import java.util.ArrayList;
import java.util.List;

public abstract class WarehouseItem {
    private  String name;
    public WarehouseItem(String name){
        this.name=name;

    }
    public String getName(){
        return name;

    }
    public abstract String getCategory();

    @Override
    public String toString() {
        return getCategory() + ": " + name;
    }
}
class Electronics extends WarehouseItem{

    public Electronics(String name) {
        super(name);
    }

    @Override
    public String getCategory() {
        return "Electronic";
    }
}
class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }

    @Override
    public String getCategory() {
        return "Groceries";
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }

    @Override
    public String getCategory() {
        return "Furniture";
    }
}

 class Storage<T extends WarehouseItem>{
     private List<T> items = new ArrayList<>();

     public void addItem(T item) {
         items.add(item);
     }

     public List<T> getItems() {
         return items;
     }

}
 class WarehouseUtils{
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}
class Main{
    public static void main(String[] args) {
        Storage<Electronics> electronicStorage = new Storage<>();
        electronicStorage.addItem(new Electronics("Laptop"));
        electronicStorage.addItem(new Electronics("Smartphone"));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice"));
        groceryStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        System.out.println("=== Electronics ===");
        WarehouseUtils.displayItems(electronicStorage.getItems());

        System.out.println("\n=== Groceries ===");
        WarehouseUtils.displayItems(groceryStorage.getItems());

        System.out.println("\n=== Furniture ===");
        WarehouseUtils.displayItems(furnitureStorage.getItems());
    }
}
