package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Product market[]=new Product[4];
        market[0]=new Bread("pszeniczny", 2.2,16);
        market[1]=new Bread("żytni", 2.2,6);
        market[2]=new Milk("krowie", 2.8,3);
        market[3]=new Book("Gra o Tron", 50,3);
        String listaZakupów=new String();
        for(Product p:market)
            System.out.println(p.getPrice() + " " + p.getNetPrice());

        for(Product p:market)
            listaZakupów+=p.ordered(10);
        System.out.println(listaZakupów);

        System.out.println(Product.storeValue(market));

        for(Product p:market)
            System.out.println(p.sell(4));
        System.out.println(Product.storeValue(market));



    }
}
