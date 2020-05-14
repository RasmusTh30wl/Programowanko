package org.example;


public class App {
    public static void main(String [] args){
        Basic baza=new Basic();
        Basic truskawkowe=new WithStrawberries(baza);
        Basic czekoladowe=new WithChocolate(baza);
        Basic kremowoTruskawkowe =new WithCream(new WithStrawberries(baza));
        Basic czekoladowoTruskawkowe = new WithChocolate(new WithStrawberries(baza));

        System.out.println("Baza koszt: "+ baza.getCost()+"\nSkład: "+baza.getIngredients()+"\n");
        System.out.println("Truskawkowe koszt: "+ truskawkowe.getCost()+"\nSkład: "+truskawkowe.getIngredients()+"\n");
        System.out.println("Czekoladowe koszt: "+ czekoladowe.getCost()+"\nSkład: "+czekoladowe.getIngredients()+"\n");
        System.out.println("Kremowo-truskawkowe koszt: "+ kremowoTruskawkowe.getCost()+"\nSkład: "+kremowoTruskawkowe.getIngredients()+"\n");
        System.out.println("Czekoladowo-truskawkowe koszt: "+ czekoladowoTruskawkowe.getCost()+"\nSkład: "+czekoladowoTruskawkowe.getIngredients()+"\n");

        //Dodawanie do tego samego obiektu
        Basic cake=new Basic();
        cake=new WithChocolate(cake);
        cake=new WithCream(cake);
        System.out.println("Czekoladowo-kremowe koszt: "+cake.getCost()+"\nSkład: "+cake.getIngredients()+"\n");

    }
}

