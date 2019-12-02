package ua.lviv.iot.controller;

        import ua.lviv.iot.model.AnimatorEntity;
        import org.hibernate.Session;
        import ua.lviv.iot.service.AnimatorService;

        import java.sql.SQLException;
        import java.util.List;
        import java.util.Scanner;

public class AnimatorController {
    private static Scanner input = new Scanner(System.in);

    public static void deleteFromAnimator(Session session) throws SQLException {
        System.out.println("Input ID(emp_no) for Animator: ");
        Integer id = input.nextInt();
        input.nextLine();
        AnimatorService animatorService = new AnimatorService(session);
        animatorService.delete(id);
        System.out.printf("There are deleted \n");
    }

    public static void createAnimator(Session session) throws SQLException {
        System.out.println("Input ID for Animator: ");
        Integer id = input.nextInt();
        input.nextLine();
        System.out.println("Input name : ");
        String name = input.nextLine();
        System.out.println("Input surname : ");
        String surname = input.nextLine();
        input.nextLine();
        System.out.println("Input lastName : ");
        String lastName = input.nextLine();
        System.out.println("Input photo: ");
        String photo = input.nextLine();
        System.out.println("Input education : ");
        String education = input.nextLine();
        System.out.println("Input experience : ");
        Integer experience = input.nextInt();
        System.out.println("Input age : ");
        Integer age = input.nextInt();
        System.out.println("Input additionalSkills : ");
        String additionalSkills = input.nextLine();


        AnimatorEntity entity = new AnimatorEntity(id, name, surname,lastName,photo,education, experience, age, additionalSkills);
        AnimatorService animatorService = new AnimatorService(session);
        animatorService.create(entity);
        System.out.printf("There are created ");
    }

    public static void updateAnimator(Session session) throws SQLException {
        System.out.println("Input ID for Animator: ");
        Integer id = input.nextInt();
        input.nextLine();
        System.out.println("Input name : ");
        String name = input.nextLine();
        System.out.println("Input surname : ");
        String surname = input.nextLine();
        input.nextLine();
        System.out.println("Input lastName : ");
        String lastName = input.nextLine();
        System.out.println("Input photo: ");
        String photo = input.nextLine();
        System.out.println("Input education : ");
        String education = input.nextLine();
        System.out.println("Input experience : ");
        Integer experience = input.nextInt();
        System.out.println("Input age : ");
        Integer age = input.nextInt();
        System.out.println("Input additionalSkills : ");
        String additionalSkills = input.nextLine();


        AnimatorEntity entity = new AnimatorEntity(id, name, surname,lastName,photo,education, experience, age, additionalSkills);
        AnimatorService animatorService = new AnimatorService(session);
        animatorService.update(entity);
        System.out.printf("There are updated \n");
    }

    public static void selectAnimator(Session session) throws SQLException {
        try {
            System.out.println("\nTable: Animator");
            AnimatorService animatorService = new AnimatorService(session);
            List<AnimatorEntity> animators = animatorService.findAll();
            for (AnimatorEntity entity : animators) {
                System.out.println(entity);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }


}