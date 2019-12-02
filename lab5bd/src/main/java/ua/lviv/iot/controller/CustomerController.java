package ua.lviv.iot.controller;


import ua.lviv.iot.model.CustomerEntity;
import org.hibernate.Session;
import ua.lviv.iot.service.CustomerService;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class CustomerController {
    private static Scanner input = new Scanner(System.in);

    public static void deleteFromCustomer(Session session) throws SQLException {
        System.out.println("Input ID(emp_no) for Customer: ");
        Integer id = input.nextInt();
        input.nextLine();
        CustomerService customerService = new CustomerService(session);
        customerService.delete(id);
        System.out.printf("There are deleted \n");
    }

    public static void createCustomer(Session session) throws SQLException {
        System.out.println("Input ID for Customer: ");
        Integer id = input.nextInt();
        input.nextLine();
        System.out.println("Input name : ");
        String name = input.nextLine();
        System.out.println("Input surname : ");
        String surname = input.nextLine();
        input.nextLine();
        System.out.println("Input lastName : ");
        String lastName = input.nextLine();
        System.out.println("Input phoneNumber: ");
        Integer phoneNumber = input.nextInt();



        CustomerEntity entity = new CustomerEntity(id, name, surname,lastName,phoneNumber);
        CustomerService customerService = new CustomerService(session);
        customerService.create(entity);
        System.out.printf("There are created ");
    }

    public static void updateCustomer(Session session) throws SQLException {
        System.out.println("Input ID for Customer: ");
        Integer id = input.nextInt();
        input.nextLine();
        System.out.println("Input name : ");
        String name = input.nextLine();
        System.out.println("Input surname : ");
        String surname = input.nextLine();
        input.nextLine();
        System.out.println("Input lastName : ");
        String lastName = input.nextLine();
        System.out.println("Input phoneNumber: ");
        Integer phoneNumber = input.nextInt();



        CustomerEntity entity = new CustomerEntity(id, name, surname,lastName,phoneNumber);
        CustomerService customerService = new CustomerService(session);
        customerService.update(entity);
        System.out.printf("There are updated \n");
    }

    public static void selectCustomer(Session session) throws SQLException {
        try {
            System.out.println("\nTable: Customer");
            CustomerService customerService = new CustomerService(session);
            List<CustomerEntity> customers = customerService.findAll();
            for (CustomerEntity entity : customers) {
                System.out.println(entity);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }


}