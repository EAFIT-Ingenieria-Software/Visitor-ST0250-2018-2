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
public class ShoppingCartClient {

    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{new Book(30, "3445"), 
            new Book(120, "0710"),
            new Fruit(11, 3, "Pera"), new Fruit(5, 5, "Mandarina"),
        new TV("Panasonic",50,500), new TV("Sony",60,550)};

        int total = calculatePrice(items);
        System.out.println("Costo Total = " + total);
    }

    private static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ConcreteVisitor();
        int sum = 0;
        for (ItemElement item : items) {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }

}
