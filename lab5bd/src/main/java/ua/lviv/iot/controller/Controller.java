package ua.lviv.iot.controller;
import org.hibernate.Session;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class Controller {

    public static  void selectAllTable(Session session) throws SQLException {
        AgencyController agency=new AgencyController();
        AgencyHasAnimatorController agencyHasAnimatorController=new AgencyHasAnimatorController();
        AnimatorController animator=new AnimatorController();
        AnimatorHasOrderController animatorHasOrderController=new AnimatorHasOrderController();
        CostController cost=new CostController();
        CustomerController customer=new CustomerController();
        OrderController order=new OrderController();


        agency.selectAgency( session);
        agencyHasAnimatorController.selectAgencyHasAnimator( session);
        animator.selectAnimator( session);
        animatorHasOrderController.selectAnimatorHasOrder( session);
        cost.selectCost( session);
        customer.selectCustomer( session);
        order.selectOrder( session);

    }


}