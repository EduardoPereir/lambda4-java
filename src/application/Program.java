package application;

import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Mouse", 54.90 ));
        list.add(new Product("Monitor", 234.93 ));
        list.add(new Product("Xbox", 1190.99 ));
        list.add(new Product("Keyboard", 90.99 ));

       List<String> names = list.stream().map( f -> f.getName().toUpperCase()).toList();
       names.forEach(System.out::println);

    }
}
