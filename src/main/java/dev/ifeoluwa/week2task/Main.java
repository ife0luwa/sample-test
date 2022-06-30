package dev.ifeoluwa.week2task;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {

    static Stock thisStock = new Stock();
    static Product myProduct;

    public static void main(String[] args) {
        Store villageGrocery = new Store();
        Product myStock = new Product("rice", 10.40);

        villageGrocery.reStock(myStock);
        villageGrocery.checkStock();


        User manager = new User("Kola", Roles.MANAGER);

        System.out.println("Welcome " + manager.getName() + ", our new " + manager.getRole() + "\n");

        StoreHire hr = new StoreHire();
        System.out.println(hr.hire(manager, new User("Oby", Roles.APPLICANT)));
        System.out.println();


        User customer = new User("Hassan", Roles.CUSTOMER);
        customer.loadWallet(200.0);
        System.out.println("Welcome " + customer.getName() + ", village grocery at your service");

        System.out.println(villageGrocery.sell(new User("oby", Roles.CASHIER), customer, "rice"));

        villageGrocery.checkStock();


    }

    static {
        try (BufferedReader productFile = new BufferedReader(new FileReader("products_data.txt"))) {
            String input;
            while((input = productFile.readLine()) != null) {
                String [] productData = input.split(",");
                String category = productData[0];
                String name = productData[1];
                int quantity = Integer.parseInt(productData[2]);
                double price = Double.parseDouble(productData[3]);
                myProduct = new Product(category, name, quantity, price);
                System.out.println(myProduct);
            }

        } catch (IOException e) {
            System.out.printf(e.getLocalizedMessage());
        }

    }





}
