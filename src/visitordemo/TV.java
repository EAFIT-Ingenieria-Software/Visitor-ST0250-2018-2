/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitordemo;

/**
 *
 * @author Acer
 */
public class TV implements ItemElement {
    
    private String brand;
    private int size;
    private int price;
    
    public TV(String brand, int size, int price){
        this.brand = brand;
        this.size = size;
        this.price = price;
    }
    //Metodo que invoca el visitor por medio de doble dispatch
    public int accept(ShoppingCartVisitor visitor){
        return visitor.visit(this);
    }
    public String getBrand(){
        return brand;
    }
    public int getPrice(){
        return price;
    }
    
    
    
}
