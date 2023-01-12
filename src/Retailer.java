public class Retailer extends Wholesaler {
    int retail_id;
    String retail_name;
    int retail_proId;
    String retail_proName;
    int retail_price;
    int retail_stock;

    Retailer(){}

    Retailer( int id, String name,int prodid, String proName,int retail_quantity, int retail_price){
        this.retail_id = id;
        this.retail_name = name;
        this.retail_proId = prodid;
        this.retail_proName = proName;
        this.retail_stock = retail_quantity;
        this.retail_price = retail_price;

    }

    void displayAllRetailer(){
        System.out.println("Retailer Id "+retail_id);
        System.out.println("Retailer name "+retail_name);
        System.out.println("Product Id "+retail_proId);
        System.out.println("Product name: "+retail_proName);
        System.out.println("Product Stock "+retail_stock);
        System.out.println("Product Price "+retail_price);
        System.out.println("\n ----------------> \n");

    }

//    @Override
    void dispQuantity() {
//        super.dispQuantity();
        System.out.println("The Stock of the product with wholesaler is "+wholesale_stock);
    }

//    void buyQuantity(int quantity){
////        super.buyQuantity(quantity);
//        this.wholesale_stock = wholesale_stock-quantity;
////        return wholesale_stock;
//    }

}