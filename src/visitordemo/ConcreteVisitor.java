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
public class ConcreteVisitor implements ShoppingCartVisitor {

    //Metodo que define la operacion que se va a llevar a cabo sobre el objeto tipo Book
    @Override
    public int visit(Book book) {
        int cost = 0;
        //aplicar descuento si el precio esta por encima de 50
        if (book.getPrice() > 50) {
            cost = book.getPrice() - 5;
        } else {
            cost = book.getPrice();
        }
        System.out.println("Codigo ISBN: " + book.getIsbnNumber() + " precio = " + cost);
        return cost;
    }

    //Metodo que define la operacion que se va a llevar a cabo sobre el objeto tipo Fruit
    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " precio = " + cost);
        return cost;
    }
    
    @Override
    public int visit(TV tv){
        int cost = 0;
        if(tv.getBrand().equals("Sony")){
            cost = tv.getPrice() - 20;
        }
        else cost = tv.getPrice();
        System.out.println("Precio TV "+ tv.getBrand()+": "+cost);
        return cost;
    }

}
