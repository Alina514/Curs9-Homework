import basketfruit.Basket;
import bucketflower.FlowerBucket;
import persons.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //exercitiul 1
        Basket basket = new Basket();
        basket.addFruit("Apple");
        basket.addFruit("Banana");
        basket.addFruit("Orange");
        basket.addFruit("Grapes");

        System.out.println("Is Banana in the basket? " + basket.find("Banana"));

        System.out.println("Removing Apple from the basket: " + basket.remove("Apple"));
        System.out.println("Is Apple in the basket now? " + basket.find("Apple"));

        System.out.println("Position of Orange in the basket: " + basket.position("Orange"));

        Collection<String> distinctFruits = basket.distinct();
        System.out.println("Distinct fruits in the basket: " + distinctFruits);

        System.out.println("Are Grapes in the basket?" + basket.find("Grapes"));

        System.out.println("How many fruit are in basket? " + basket.length());

        System.out.println("Number of fruits in the basket: " + basket.customCount());

// exercitiul 2
        FlowerBucket flowerBucket = new FlowerBucket();

        flowerBucket.addFlowers("Trandafir");
        flowerBucket.addFlowers("Lalea");
        flowerBucket.addFlowers("Crizantema");
        flowerBucket.addFlowers("Liliac");

        Collection<String> allFlowers = flowerBucket.getAll();
        System.out.println("All flowers in the bucket: " + allFlowers);

        flowerBucket.remove("Lalea");
        System.out.println("All flowers in the bucket after removing Lalea: " + flowerBucket.getAll());

//exercitiul 3
        Person manager = new Person("Adrian", 35, "Manager");

        Welder welder = new Welder("Vasile", 27, "Welder");
        Carpenters carpenter = new Carpenters("Ion", 44, "Carpenter");
        Plummer plumber = new Plummer("Vlad", 44, "Plummer");

        List<Person> employees = new ArrayList<>();
        employees.add(manager);
        employees.add( welder);
        employees.add(carpenter);
        employees.add(plumber);

        Company company = new Company(manager, employees);
        System.out.println("Manager: " + company.getManager().getName());

       



    }
}