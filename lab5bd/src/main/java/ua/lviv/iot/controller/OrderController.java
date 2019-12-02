package ua.lviv.iot.controller;

import ua.lviv.iot.model.OrderEntity;
import ua.lviv.iot.model.OrderEntityPK;
import org.hibernate.Session;
import ua.lviv.iot.service.OrderService;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class OrderController {
    private static Scanner input = new Scanner(System.in);

    public static void deleteFromOrder(Session session) throws SQLException {
        System.out.println("Input ID for Order: ");
        Integer id= input.nextInt();
        input.nextLine();
        System.out.println("Input idOrder for Order: ");
        Integer idOrder= input.nextInt();
        input.nextLine();
        System.out.println("Input Customer_idCustomer for Order: ");
        Integer Customer_idCustomer= input.nextInt();
        input.nextLine();
        System.out.println("Input Agency_idAgency for Order: ");
        Integer agencyIdAgency= input.nextInt();
        input.nextLine();

        OrderEntityPK pk = new OrderEntityPK(id, idOrder ,Customer_idCustomer);

        OrderService orderService = new OrderService(session);
        orderService.delete(pk);
        System.out.printf("There are deleted  \n" );
    }

    public static void createOrder(Session session) throws SQLException {
        System.out.println("Input ID for Order: ");
        Integer id= input.nextInt();
        input.nextLine();
        System.out.println("Input date for Order: ");
        String date = input.nextLine();
        System.out.println("Input time for Order: ");
        String time = input.nextLine();
        System.out.println("Input typeOfHoliday for Order: ");
        String typeOfHoliday  = input.nextLine();
        System.out.println("Input cost for Order: ");
        Integer cost= input.nextInt();
        System.out.println("Input amountOfAnimators for Order: ");
        Integer amountOfAnimators= input.nextInt();
        input.nextLine();
        System.out.println("Input amountOfGuests for Order: ");
        Integer amountOfGuests= input.nextInt();
        input.nextLine();
        System.out.println("Input address for Order: ");
        String address= input.nextLine();
        input.nextLine();
        System.out.println("Input duration for Order: ");
        String duration= input.nextLine();
        input.nextLine();
        System.out.println("Input ID(idOrder) for Order: ");
        Integer idOrder = input.nextInt();
        input.nextLine();
        System.out.println("Input ID(Customer_idCustomer) for Order: ");
        Integer Customer_idCustomer = input.nextInt();
        input.nextLine();
        System.out.println("Input ID(agencyIdAgency) for Order: ");
        Integer agencyIdAgency = input.nextInt();
        input.nextLine();
        OrderEntityPK pk = new OrderEntityPK(id, idOrder ,Customer_idCustomer);
        OrderEntity entity = new OrderEntity(id, date, time,typeOfHoliday,cost, amountOfAnimators,amountOfGuests,address,duration, idOrder, Customer_idCustomer );
        OrderService orderService = new OrderService(session);
        orderService.create(entity);
        System.out.printf("There are created \n");
    }

    public static void updateOrder(Session session) throws SQLException {
        System.out.println("Input ID for Order: ");
        Integer id= input.nextInt();
        input.nextLine();
        System.out.println("Input date for Order: ");
        String date = input.nextLine();
        System.out.println("Input time for Order: ");
        String time = input.nextLine();
        System.out.println("Input typeOfHoliday for Order: ");
        String typeOfHoliday  = input.nextLine();
        System.out.println("Input cost for Order: ");
        Integer cost= input.nextInt();
        System.out.println("Input amountOfAnimators for Order: ");
        Integer amountOfAnimators= input.nextInt();
        input.nextLine();
        System.out.println("Input amountOfGuests for Order: ");
        Integer amountOfGuests= input.nextInt();
        input.nextLine();
        System.out.println("Input address for Order: ");
        String address= input.nextLine();
        input.nextLine();
        System.out.println("Input duration for Order: ");
        String duration= input.nextLine();
        input.nextLine();
        System.out.println("Input ID(idOrder) for Order: ");
        Integer idOrder = input.nextInt();
        input.nextLine();
        System.out.println("Input ID(Customer_idCustomer) for Order: ");
        Integer Customer_idCustomer = input.nextInt();
        input.nextLine();
        System.out.println("Input ID(Agency_idAgency) for Order: ");
        Integer Agency_idAgency = input.nextInt();
        input.nextLine();

        OrderEntity entity = new OrderEntity(id, date, time,typeOfHoliday,cost, amountOfAnimators,amountOfGuests,address,duration, idOrder, Customer_idCustomer );
        OrderService orderService = new OrderService(session);
        orderService.update(entity);
        System.out.printf("There are updated  \n" );
    }

    public static void selectOrder(Session session) throws SQLException {
        try {
            System.out.println("\nTable: Order");
            OrderService orderService = new OrderService(session);
            List<OrderEntity> orderServices = orderService.findAll();
            for (OrderEntity entity : orderServices) {
                System.out.println(entity);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}