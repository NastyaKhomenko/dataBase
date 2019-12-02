package ua.lviv.iot.controller;

import org.hibernate.Session;
import ua.lviv.iot.model.AgencyEntity;
import ua.lviv.iot.service.AgencyService;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class AgencyController {
    private static Scanner input = new Scanner(System.in);

    public static void deleteFromAgency(Session session) throws SQLException {
        System.out.println("Input ID(emp_no) for Agency: ");
        Integer id = input.nextInt();
        input.nextLine();
        AgencyService agencyService = new AgencyService(session);
        agencyService.delete(id);
        System.out.printf("There are deleted \n");
    }

    public static void createAgency(Session session) throws SQLException {
        System.out.println("Input ID for Agency: ");
        Integer id = input.nextInt();
        input.nextLine();
        System.out.println("Input name : ");
        String name = input.nextLine();
        System.out.println("Input address : ");
        String address = input.nextLine();
        input.nextLine();
        System.out.println("Input phoneNumber : ");
        Integer phoneNumber = input.nextInt();
        System.out.println("Input webSite : ");
        String webSite = input.nextLine();
        System.out.println("Input raiting : ");
        Integer raiting = input.nextInt();

        AgencyEntity entity = new AgencyEntity(id, name, address,phoneNumber,webSite,raiting);
        AgencyService agencyService = new AgencyService(session);
        agencyService.create(entity);
        System.out.printf("There are created ");
    }

    public static void updateAgency(Session session) throws SQLException {
        System.out.println("Input ID for Agency: ");
        Integer id = input.nextInt();
        input.nextLine();
        System.out.println("Input name : ");
        String name = input.nextLine();
        System.out.println("Input address : ");
        String address = input.nextLine();
        input.nextLine();
        System.out.println("Input phoneNumber : ");
        Integer phoneNumber = input.nextInt();
        System.out.println("Input webSite : ");
        String webSite = input.nextLine();
        System.out.println("Input raiting : ");
        Integer raiting = input.nextInt();

        AgencyEntity entity = new AgencyEntity(id, name, address,phoneNumber,webSite,raiting);
        AgencyService agencyService = new AgencyService(session);
        agencyService.update(entity);
        System.out.printf("There are updated \n");
    }

    public static void selectAgency(Session session) throws SQLException {
        try {
            System.out.println("\nTable: Agency");
            AgencyService agencyService = new AgencyService(session);
            List<AgencyEntity> agencies = agencyService.findAll();
            for (AgencyEntity entity : agencies) {
                System.out.println(entity);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }


}