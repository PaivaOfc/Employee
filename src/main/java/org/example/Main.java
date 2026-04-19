package org.example;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        sc.nextLine();

        List<Employee> employee = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i+1) + " data:");
            System.out.print("Outsourced? (y/n): ");
            String outsourced = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double value = sc.nextDouble();

            if (outsourced.equals("y")) {
                System.out.print("Addicional charge: ");
                Double additional = sc.nextDouble();
                employee.add(new OutsourcedEmployee(name, hours, value, additional));
            } else {
                employee.add(new Employee(name, hours, value));
            }

            sc.nextLine();
        }

        System.out.println("PAYMENTS:");
        for (Employee c : employee) {
            System.out.println(c);
        }


        sc.close();
    }
}
