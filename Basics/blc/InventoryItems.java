package Basics.blc;

public class InventoryItems {
        private String itemName;
        private double pricePerUnit;
        private int quantityInStock;

        public InventoryItems(String itemName, double pricePerUnit, int quantityInStock){
            this.itemName = itemName;
            this.pricePerUnit = pricePerUnit;
            this.quantityInStock = quantityInStock;
        }

        public void setItemName(String itemName){
            this.itemName = itemName;
        }

        public String getItemName(){
            return this.itemName;
        }

        public void setPricePerUnit(double pricePerUnit){
            this.pricePerUnit = pricePerUnit;
        }

        public double getPricePerUnit(){
            return this.pricePerUnit;
        }

        public void setQuantityInStock(int quantityInStock){
            this.quantityInStock = quantityInStock;
        }

        public int getQuantityInStock(){
            return this.quantityInStock;
        }

        public double calculateTotalValue(){
            return pricePerUnit * quantityInStock;
        }
    }
