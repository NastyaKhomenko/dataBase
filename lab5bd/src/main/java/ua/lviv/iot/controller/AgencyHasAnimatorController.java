package ua.lviv.iot.controller;

import ua.lviv.iot.model.AgencyHasAnimatorEntity;
import ua.lviv.iot.model.AgencyHasAnimatorEntityPK;
import org.hibernate.Session;
import ua.lviv.iot.service.AgencyHasAnimatorService;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class AgencyHasAnimatorController {
    private static Scanner input = new Scanner(System.in);

    public static void deleteFromAgencyHasAnimator(Session session) throws SQLException {
        System.out.println("Input ID(emp_no) for AgencyHasAnimator: ");
        Integer Agency_idAgency = input.nextInt();
        input.nextLine();
        System.out.println("Input ID(project_no) for AgencyHasAnimator: ");
        Integer Animator_idAnimator = input.nextInt();
        input.nextLine();
        AgencyHasAnimatorEntityPK pk = new AgencyHasAnimatorEntityPK(Agency_idAgency, Animator_idAnimator);

        AgencyHasAnimatorService agencyHasAnimatorService = new AgencyHasAnimatorService(session);
        agencyHasAnimatorService.delete(pk);
        System.out.printf("There are deleted \n");
    }

    public static void createAgencyHasAnimator(Session session) throws SQLException {
        System.out.println("Input Agency_idAgency for AgencyHasAnimator: ");
        Integer Agency_idAgency = input.nextInt();
        input.nextLine();
        System.out.println("Input Animator_IdAnimator for AgencyHasAnimator: ");
        Integer Animator_idAnimator = input.nextInt();
        input.nextLine();
        AgencyHasAnimatorEntityPK pk = new AgencyHasAnimatorEntityPK(Agency_idAgency, Animator_idAnimator);
        AgencyHasAnimatorEntity entity = new AgencyHasAnimatorEntity(Agency_idAgency, Animator_idAnimator);
        AgencyHasAnimatorService agencyHasAnimatorService = new AgencyHasAnimatorService(session);
        agencyHasAnimatorService.create(entity);
        System.out.printf("There are created  \n" );
    }

    public static void updateAgencyHasAnimator(Session session) throws SQLException {
        System.out.println("Input Agency_idAgency for AgencyHasAnimator: ");
        Integer Agency_idAgency = input.nextInt();
        input.nextLine();
        System.out.println("Input Animator_idAnimator for AgencyHasAnimator: ");
        Integer Animator_idAnimator = input.nextInt();
        input.nextLine();

        AgencyHasAnimatorEntity entity = new AgencyHasAnimatorEntity(Agency_idAgency, Animator_idAnimator);
        AgencyHasAnimatorService agencyHasAnimatorService = new AgencyHasAnimatorService(session);
        agencyHasAnimatorService.update(entity);
        System.out.printf("There are updated  \n" );
    }

    public static void selectAgencyHasAnimator(Session session) throws SQLException {
        try {


            System.out.println("\nTable: AgencyHasAnimator");
            AgencyHasAnimatorService agencyHasAnimatorService = new AgencyHasAnimatorService(session);
            List<AgencyHasAnimatorEntity> agencyHasAnimators = agencyHasAnimatorService.findAll();
            for (AgencyHasAnimatorEntity entity : agencyHasAnimators) {
                System.out.println(entity);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}