/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andressa Silva
 */
public class Program18 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("%n%n%n");
        
        System.out.println("---------=|EMPLOYEE DATA|=---------");
        System.out.println();
        System.out.print("Number of employees: ");
        int n = sc.nextInt();
        
        List <Employee> list = new ArrayList<>(n);
        
        for(int i=0; i<n; i++){
            System.out.print("Employee id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Employee name: ");
            String name = sc.nextLine();
            System.out.print("Employee salary: ");
            double salary = sc.nextDouble();
            System.out.println();
            
            list.add(new Employee(id, name, salary));
        }
        System.out.println("---------------------------------");
        System.out.println();
        System.out.print("Enter id to increase salary: ");
        int id = sc.nextInt();
        
        Employee employee = list.stream().filter(x -> x.getId() == id).findAny().orElse(null);
        
        if(employee == null){
            System.out.print("The entered id does not exist. Finishing up program");
        } else{
            System.out.print("Enter the increase percentage: ");
            double percentage = sc.nextDouble();
            employee.increaseSalary(percentage);
        }
        System.out.println();
        // Para cada objeto do tipo Employee pertencente a minha lista list
        // imprima o objeto
        for (Employee obj : list){
            System.out.println(obj);
        }
    }
}
