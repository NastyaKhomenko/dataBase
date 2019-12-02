package ua.lviv.iot.view.implementation;

import ua.lviv.iot.controller.*;
import org.hibernate.Session;
import ua.lviv.iot.view.interfaces.Printable;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MyView {
    private Map<String, String> menu;
    private Map<String, Printable> methodsMenu;
    private static Scanner input = new Scanner(System.in);
    private Session session;
    public MyView(Session session) {
        this.session = session;
        menu = new LinkedHashMap<>();
        methodsMenu = new LinkedHashMap<>();
        Controller controller =new Controller();
        menu.put("A", "   A - Select all table");
        menu.put("B", "   B - Select structure of DB");

        menu.put("1", "   1 - Table: agency");
        menu.put("11", "  11 - Create for agency");
        menu.put("12", "  12 - Update agency");
        menu.put("13", "  13 - Delete from agency");
        menu.put("14", "  14 - Select agency");
        menu.put("15", "  15 - Find agency by ID");


        menu.put("2", "   2 - Table: agency_has_animator");
        menu.put("21", "  21 - Create for agency_has_animator");
        menu.put("22", "  22 - Update agency_has_animator");
        menu.put("23", "  23 - Delete from agency_has_animator");
        menu.put("24", "  24 - Select agency_has_animator");
        menu.put("25", "  25 - Find agency_has_animator by ID");


        menu.put("3", "   3 - Table: animator");
        menu.put("31", "  31 - Create for animator");
        menu.put("32", "  32 - Update animator");
        menu.put("33", "  33 - Delete from animator");
        menu.put("34", "  34 - Select animator");
        menu.put("35", "  35 - Find animator by Bus ID");

        menu.put("4", "   4 - Table: animator_has_order");
        menu.put("41", "  41 - Create for animator_has_order");
        menu.put("42", "  42 - Update animator_has_order");
        menu.put("43", "  43 - Delete from animator_has_order");
        menu.put("44", "  44 - Select animator_has_order");
        menu.put("45", "  45 - Find animator_has_order by ID");

        menu.put("5", "   5 - Table: cost");
        menu.put("51", "  51 - Create for cost");
        menu.put("52", "  52 - Update cost");
        menu.put("53", "  53 - Delete from cost");
        menu.put("54", "  54 - Select cost");
        menu.put("55", "  55 - Find cost by ID");

        menu.put("6", "   6 - Table: customer");
        menu.put("61", "  61 - Create for customer");
        menu.put("62", "  62 - Update customer");
        menu.put("63", "  63 - Delete from customer");
        menu.put("64", "  64 - Select customer");
        menu.put("65", "  65 - Find customer by ID");

        menu.put("7", "   7 - Table: order");
        menu.put("71", "  71 - Create for order");
        menu.put("72", "  72 - Update order");
        menu.put("73", "  73 - Delete from order");
        menu.put("74", "  74 - Select order");
        menu.put("75", "  75 - Find order by ID");


        menu.put("Q", "   Q - exit");

        methodsMenu.put("A", () -> Controller.selectAllTable(session));
        //methodsMenu.put("B", Controller::takeStructureOfDB);

        methodsMenu.put("11",() ->  AgencyController.createAgency(session));
        methodsMenu.put("12",() ->  AgencyController.updateAgency(session));
        methodsMenu.put("13",() ->  AgencyController.deleteFromAgency(session));
        methodsMenu.put("14",() ->  AgencyController.selectAgency(session));


        methodsMenu.put("21",() ->  AgencyHasAnimatorController.createAgencyHasAnimator(session));
        methodsMenu.put("22",() ->  AgencyHasAnimatorController.updateAgencyHasAnimator(session));
        methodsMenu.put("23",() ->  AgencyHasAnimatorController.deleteFromAgencyHasAnimator(session));
        methodsMenu.put("24", () -> AgencyHasAnimatorController.selectAgencyHasAnimator(session));


        methodsMenu.put("31",() ->  AnimatorController.createAnimator(session));
        methodsMenu.put("32",() ->  AnimatorController.updateAnimator(session));
        methodsMenu.put("33",() ->  AnimatorController.deleteFromAnimator(session));
        methodsMenu.put("34",() -> AnimatorController.selectAnimator(session));


        methodsMenu.put("41",() ->  AnimatorHasOrderController.createAnimatorHasOrder(session));
        methodsMenu.put("42",() ->  AnimatorHasOrderController.updateAnimatorHasOrder(session));
        methodsMenu.put("43",() ->  AnimatorHasOrderController.deleteFromAnimatorHasOrder(session));
        methodsMenu.put("44",() ->  AnimatorHasOrderController.selectAnimatorHasOrder(session));


        methodsMenu.put("51",() ->  CostController.createCost(session));
        methodsMenu.put("52",() -> CostController.updateCost(session));
        methodsMenu.put("53", () -> CostController.deleteFromCost(session));
        methodsMenu.put("54", () -> CostController.selectCost(session));

        methodsMenu.put("61", () -> CustomerController.createCustomer(session));
        methodsMenu.put("62",() ->  CustomerController.updateCustomer(session));
        methodsMenu.put("63",() ->  CustomerController.deleteFromCustomer(session));
        methodsMenu.put("64",() ->  CustomerController.selectCustomer(session));

        methodsMenu.put("71", () -> OrderController.createOrder(session));
        methodsMenu.put("72", () -> OrderController.updateOrder(session));
        methodsMenu.put("73", () -> OrderController.deleteFromOrder(session));
        methodsMenu.put("74", () -> OrderController.selectOrder(session));


    }

//------------------------------------------------------------------------------------

    private void outputMenu() {
        System.out.println("\nMENU:");
        for (String key : menu.keySet())
            if (key.length() == 1) System.out.println(menu.get(key));
    }

    private void outputSubMenu(String fig) {

        System.out.println("\nSubMENU:");
        for (String key : menu.keySet())
            if (key.length() != 1 && key.substring(0, 1).equals(fig)) System.out.println(menu.get(key));
    }

    public void show() {
        String keyMenu;
        do {
            outputMenu();
            System.out.println("Please, select menu point.");
            keyMenu = input.nextLine().toUpperCase();

            if (keyMenu.matches("^\\d")) {
                outputSubMenu(keyMenu);
                System.out.println("Please, select menu point.");
                keyMenu = input.nextLine().toUpperCase();
            }

            try {
                methodsMenu.get(keyMenu).print();
            } catch (Exception e) {
            }
        } while (!keyMenu.equals("Q"));
    }
}