package Basics.elc;

import Basics.blc.InventoryItems;

public class InventoryMain{
    static void main(){
        String itemName = IO.readln();
        double pricePerUnit = Double.parseDouble(IO.readln());
        int quantityInStock = Integer.parseInt(IO.readln());

        InventoryItems inventoryItems = new InventoryItems(itemName, pricePerUnit, quantityInStock);
        IO.println("Inventory Item Details:");
        IO.println("Item Name: "+itemName);
        IO.println("Price Per Unit: "+pricePerUnit);
        IO.println("Quantity in Stock: "+quantityInStock);
        System.out.printf("Total Inventory Value: %.2f\n",inventoryItems.calculateTotalValue());
        String choice = IO.readln("Any updation in Stock Price OR Quantity :");
        IO.println(choice.toUpperCase());
        if(choice.equalsIgnoreCase("YES")){
            double newPrice = Double.parseDouble(IO.readln());
            int newQuantity = Integer.parseInt(IO.readln());
            inventoryItems.setPricePerUnit(newPrice);
            inventoryItems.setQuantityInStock(newQuantity);

            IO.println();
            IO.println("Updated Inventory Item Details:");
            IO.println("Item Name: "+itemName);
            IO.println("Price Per Unit: "+newPrice);
            IO.println("Quantity in Stock: "+newQuantity);
            System.out.printf("Total Inventory Value: %.2f\n",inventoryItems.calculateTotalValue());
        }
    }
}
