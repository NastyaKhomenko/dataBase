package ua.lviv.iot.controller;

import ua.lviv.iot.model.AnimatorHasOrderEntity;
import ua.lviv.iot.model.AnimatorHasOrderEntityPK;
import org.hibernate.Session;
import ua.lviv.iot.service.AnimatorHasOrderService;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class AnimatorHasOrderController {
    private static Scanner input = new Scanner(System.in);

    public static void deleteFromAnimatorHasOrder(Session session) throws SQLException {
        System.out.println("Input ID(emp_no) for AnimatorHasOrder: ");
        Integer Animator_idAnimator = input.nextInt();
        input.nextLine();
        System.out.println("Input ID(project_no) for AnimatorHasOrder: ");
        Integer Order_idOrder = input.nextInt();
        input.nextLine();
        AnimatorHasOrderEntityPK pk = new AnimatorHasOrderEntityPK(Animator_idAnimator,Order_idOrder);

        AnimatorHasOrderService animatorHasOrderService = new AnimatorHasOrderService(session);
        animatorHasOrderService.delete(pk);
        System.out.printf("There are deleted \n");
    }

    public static void createAnimatorHasOrder(Session session) throws SQLException {
        System.out.println("Input Animator_idAnimator for AnimatorHasOrder: ");
        Integer Animator_idAnimator = input.nextInt();
        input.nextLine();
        System.out.println("Input Animator_IdAnimator for AnimatorHasOrder: ");
        Integer Order_idOrder = input.nextInt();
        input.nextLine();
        AnimatorHasOrderEntityPK pk = new AnimatorHasOrderEntityPK(Animator_idAnimator, Order_idOrder);
        AnimatorHasOrderEntity entity = new AnimatorHasOrderEntity(Animator_idAnimator, Order_idOrder);
        AnimatorHasOrderService animatorHasOrderService = new AnimatorHasOrderService(session);
        animatorHasOrderService.create(entity);
        System.out.printf("There are created  \n" );
    }

    public static void updateAnimatorHasOrder(Session session) throws SQLException {
        System.out.println("Input Animator_idAnimator for AnimatorHasOrder: ");
        Integer Animator_idAnimator = input.nextInt();
        input.nextLine();
        System.out.println("Input Animator_idAnimator for AnimatorHasOrder: ");
        Integer Order_idOrder = input.nextInt();
        input.nextLine();

        AnimatorHasOrderEntity entity = new AnimatorHasOrderEntity(Animator_idAnimator, Order_idOrder);
        AnimatorHasOrderService animatorHasOrderService = new AnimatorHasOrderService(session);
        animatorHasOrderService.update(entity);
        System.out.printf("There are updated  \n" );
    }

    public static void selectAnimatorHasOrder(Session session) throws SQLException {
        try {


            System.out.println("\nTable: AnimatorHasOrder");
            AnimatorHasOrderService animatorHasOrderService = new AnimatorHasOrderService(session);
            List<AnimatorHasOrderEntity> animatorHasOrders = animatorHasOrderService.findAll();
            for (AnimatorHasOrderEntity entity : animatorHasOrders) {
                System.out.println(entity);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
