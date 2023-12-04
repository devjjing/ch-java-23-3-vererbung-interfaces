package org.example.product;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProductRepo productRepo = new ProductRepo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Produktliste: ");
        for (Product product : productRepo.getProductList()) {
            System.out.println(product);
        }

        scanner.close();
    }
}
