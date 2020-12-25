import java.util.Scanner;

public class testLearner {
    public static void main(String[] args) {
        Learner learner= new Learner();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        learner.setName(name);
        System.out.print("Введите количество: ");
        int number = in.nextInt();
        learner.setNumber(number);
        System.out.println("Учащийся: " + learner.getName() + " " + learner.getnumber());
        System.out.println();

        Student student1 = new Student("German", 1, "PI", 19);
        Student student2 = new Student();
        System.out.print("Введите имя : ");
        name = in.next();
        student2.setName(name);
        System.out.print("Введите количество : ");
        number = in.nextInt();
        student2.setNumber(number);
        System.out.print("Введите группу: ");
        String group = in.next();
        student2.setGroup(group);
        System.out.print("Введите возраст: ");
        int age = in.nextInt();
        student2.setAge(age);
        System.out.println();
        System.out.println("Первый студент: " + student1.toString());
        System.out.println("Второй студент: " + student2.toString());

        Pupil pupil = new Pupil();
        pupil.setAllInfo();
        System.out.println(pupil.toString());
    }
}