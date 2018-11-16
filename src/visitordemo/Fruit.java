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
public class Fruit implements ItemElement {
    
    private int pricePerKg;
    private int weight;
    private String name;
	
    public Fruit(int priceKg, int weight, String name){
        this.pricePerKg=priceKg;
	this.weight=weight;
	this.name = name;
    }
	
    public int getPricePerKg() {
	return pricePerKg;
    }


    public int getWeight() {
	return weight;
    }
    public String getName(){
		return this.name;
	}
	
    @Override
    //Metodo con el que acepta el visitor por medio de Double Dispatch
    public int accept(ShoppingCartVisitor visitor) {
	return visitor.visit(this);
    }
    
}
