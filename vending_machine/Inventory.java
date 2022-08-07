package vending_machine;

public class Inventory {
    String itemsName;
    int itemCode;
    int price;
    int quantity;
    public Inventory(int itemCode, int quantity){
        this.itemCode = itemCode;
        this.quantity = quantity;
    }

    @override
    public double CalculateBillAmount(){
        return quantity*price;
    }
    
    
}
