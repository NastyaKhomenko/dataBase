package ua.lviv.iot.controller;

import ua.lviv.iot.model.CostEntity;
import ua.lviv.iot.model.CostEntityPK;
import org.hibernate.Session;
import ua.lviv.iot.service.CostService;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class CostController {
    private static Scanner input = new Scanner(System.in);

    public static void deleteFromCost(Session session) throws SQLException {
        System.out.println("Input ID for Cost: ");
        Integer id= input.nextInt();
        input.nextLine();
        System.out.println("Input idPrice for Cost: ");
        Integer idPrice= input.nextInt();
        input.nextLine();
        System.out.println("Input Agency_idAgency for Cost: ");
        Integer Agency_idAgency= input.nextInt();
        input.nextLine();

        CostEntityPK pk = new CostEntityPK(id, idPrice );

        CostService costService = new CostService(session);
        costService.delete(pk);
        System.out.printf("There are deleted  \n" );
    }

    public static void createCost(Session session) throws SQLException {
        System.out.println("Input ID for Cost: ");
        Integer id= input.nextInt();
        System.out.println("Input forWedding for Cost: ");
        Integer forWedding = input.nextInt();
        System.out.println("Input forChildBirthday for Cost: ");
        Integer forChildBirthday = input.nextInt();
        System.out.println("Input forAdultBirthday for Cost: ");
        Integer forAdultBirthday  = input.nextInt();
        System.out.println("Input forFirstBell for Cost: ");
        Integer forFirstBell= input.nextInt();
        System.out.println("Input forLastBell for Cost: ");
        Integer forLastBell= input.nextInt();
        input.nextLine();
        System.out.println("Input ID(idPrice) for Cost: ");
        Integer idPrice = input.nextInt();
        input.nextLine();
        System.out.println("Input ID(Agency_idAgency) for Cost: ");
        Integer Agency_idAgency = input.nextInt();
        input.nextLine();
        CostEntityPK pk = new CostEntityPK(id, idPrice );
        CostEntity entity = new CostEntity(id, forWedding, forChildBirthday,forAdultBirthday,forFirstBell, forLastBell,idPrice);
        CostService costService = new CostService(session);
        costService.create(entity);
        System.out.printf("There are created \n");
    }

    public static void updateCost(Session session) throws SQLException {
        System.out.println("Input ID for Cost: ");
        Integer id= input.nextInt();
        input.nextLine();
        System.out.println("Input forWedding for Cost: ");
        Integer forWedding = input.nextInt();
        System.out.println("Input forChildBirthday for Cost: ");
        Integer forChildBirthday = input.nextInt();
        System.out.println("Input forAdultBirthday for Cost: ");
        Integer forAdultBirthday  = input.nextInt();
        System.out.println("Input forFirstBell for Cost: ");
        Integer forFirstBell= input.nextInt();
        System.out.println("Input forLastBell for Cost: ");
        Integer forLastBell= input.nextInt();
        input.nextLine();
        System.out.println("Input ID(idPrice) for Cost: ");
        Integer idPrice = input.nextInt();
        input.nextLine();
        System.out.println("Input ID(Agency_idAgency) for Cost: ");
        Integer Agency_idAgency = input.nextInt();
        input.nextLine();;

        CostEntity entity = new CostEntity(id, forWedding, forChildBirthday,forAdultBirthday,forFirstBell, forLastBell,idPrice);
        CostService costService = new CostService(session);
        costService.update(entity);
        System.out.printf("There are updated  \n" );
    }

    public static void selectCost(Session session) throws SQLException {
        try {
            System.out.println("\nTable: Cost");
            CostService costService = new CostService(session);
            List<CostEntity>costServices = costService.findAll();
            for (CostEntity entity : costServices) {
                System.out.println(entity);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}