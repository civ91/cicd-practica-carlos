package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los nombres separados por comas:");
        String input = scanner.nextLine();
        
        List<String> names = new ArrayList();
        for (String name : input.split(",")) {
            names.add(name.trim());
        }

        for (String name : names) {
            System.out.println(StringUtils.saludar(name));
        }

        scanner.close();
    }
}
