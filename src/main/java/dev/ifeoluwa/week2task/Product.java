package dev.ifeoluwa.week2task;

public class Product {
    private String category;
    private String name;
    private int quantity;
    private Double price;


    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String category, String name, int quantity, Double price) {
        this.category = category;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice () {
        return this.price;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product : " + "\n" +
                "category: " + category + "\n" +
                "name: " + name + "\n" +
                "quantity: " + quantity + "\n" +
                "price: " + price + "\n" ;
    }
}


/**
 * store : List<Products> stock;
 *              Buy(UserCustomer, Product){
 *                  if(){
 *                      stock.remove.remove
 *                      user.getCart.add
 *                      bal = user.wallet - totalAmount
 *                      user.getWallet.setAmount(bal)
 *                  }
 *              }
 *
 *     Product: name, price, qty
 *     User: name, Role, List<Product> cart, Wallet
 *          methodDoSomething(Role);\
 *     Wallet: amount
 *
 *
 *
 */