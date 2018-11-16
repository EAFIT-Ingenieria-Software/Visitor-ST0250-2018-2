/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitordemo;

/**
 *
 * @author Acer
 * Interfaz para los elementos del carrito de compras
 */
public interface ItemElement {
    
    public int accept(ShoppingCartVisitor visitor);
    
}
