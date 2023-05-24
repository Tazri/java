package books.java_programming.chapter_07.shopingProgram;

public class Demo {
    public static void main(String []args){
        ShoppingCart shoppingCart = new ShoppingCart();

        Product keyboard = new Product("Mechanical Gaming Keyboard", 48);
        Product mouse = new Product("Gaming Mouse",48);
        Product ecoDot = new Product("Eco Dot (4th Generation)", 48);

        shoppingCart.addProduct(keyboard);
        shoppingCart.addProduct(mouse);
        shoppingCart.addProduct(ecoDot);

        System.out.println("shoopingCart = "+shoppingCart);
        int totalPrice = shoppingCart.getTotalPrice();
        System.out.println("Total Price : "+totalPrice);
    }
}

/*
Output : 
shoopingCart = ShoppingCart { products=[Product{name = 'Mechanical Gaming Keyboard' price = 48}, Product{name = 'Gaming Mouse' price = 48}, Product{name = 'Eco Dot (4th Generation)' price = 48}]}
Total Price : 144
*/
