package task3;

import dop.Calculator;
import task2.Worker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pr = 2;
        Scanner in = new Scanner(System.in);
        ArrayList<Price> prices = new ArrayList<>();

        for (int i = 0; i < pr; i++) {
            System.out.println("Введите название товара, название магазина, стоимость товара: ");
            Price price = new Price(in.next(), in.next(), in.nextInt());
            prices.add(price);
        }
        prices.sort(Comparator.comparing(Price::getNameMag));
        System.out.println(prices.toString());

        System.out.println("Введите название магазина: ");
        String newNameMag = in.next();

        try {
            printMag(prices, newNameMag);
        }catch (NoSuchElementException ex){
            System.out.println(ex.getMessage());
        }
    }
    private static void printMag(ArrayList<Price> prices, String newNameMag){
        Price found = findMag(prices, newNameMag);
        if(found == null){
            throw new NoSuchElementException("Такого магазина нет");
        }
        else {
            System.out.println(found);
        }
    }

    private static Price findMag(ArrayList<Price> prices, String newNameMag){
        for (Price price: prices) {
            if(newNameMag.equals(price.getNameMag())){
                return price;
            }
        }
        return null;
    }

}
