import java.util.Scanner;

public class Pupil extends Learner {
    private String grade;
    private int height;

    public Pupil() {
        super();
        grade = "";
        height = 0;
    }

    public Pupil(String name, int number, String grade, int height) {
        super(name, number);
        this.grade = grade;
        this.height = height;
    }

    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setAllInfo() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя школьника: ");
        String name = in.next();
        setName(name);
        System.out.print("Введите количество: ");
        int number = in.nextInt();
        setNumber(number);
        System.out.print("Введите класс школьника: ");
        grade = in.next();
        System.out.print("Введите рост школьника: ");
        height = in.nextInt();
    }

    @Override
    public String toString() {
        return
                "Школьник = '" + getName() + '\'' +
                        ", количество = '" + getnumber() + '\'' +
                        ", класс = '" + grade + '\'' +
                        ", рост = " + height + "см";
    }
}
