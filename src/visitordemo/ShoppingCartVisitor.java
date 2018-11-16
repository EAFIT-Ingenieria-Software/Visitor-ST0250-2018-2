/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitordemo;

/**
 *
 * @author Acer
 * Interfaz que implementara el Visitor
 */
public interface ShoppingCartVisitor {

    /*metodos para visitar los elementos. Se debe hacer un metodo visit
    para cada tipo de elemento que se quiere visitar
    */
    
    int visit(Book book);

    int visit(Fruit fruit);
    
    int visit(TV tv);
}
