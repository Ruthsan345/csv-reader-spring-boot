public class Wholesaler extends Product {
    int wholesale_id;
    String wholesale_name;
    int wholesale_proId;
    String wholesale_proName;
    int wholesale_price;
    int wholesale_stock;

    Wholesaler() {
    }

    Wholesaler(int id, String name, int prodid, String proName, int wholesale_quantity, int wholesale_price) {
        this.wholesale_id = id;
        this.wholesale_name = name;
        this.wholesale_proId = prodid;
        this.wholesale_proName = proName;
        this.wholesale_stock = wholesale_quantity;
        this.wholesale_price = wholesale_price;

    }

    void displayAllWholesaler() {
        System.out.println("Wholesaler Id " + wholesale_id);
        System.out.println("Wholesaler name " + wholesale_name);
        System.out.println("Product Id " + wholesale_proId);
        System.out.println("Product name: " + wholesale_proName);
        System.out.println("Product Stock " + wholesale_stock);
        System.out.println("Product Price " + wholesale_price);
        System.out.println("\n ----------------> \n");

    }

    void buyQuantity(int quantity){
//        super.buyQuantity(quantity);
        this.wholesale_stock = wholesale_stock-quantity;
//        return wholesale_stock;
    }
}