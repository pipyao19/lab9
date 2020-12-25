public class Learner {
    private String name;
    private int number;

    public Learner() {
        name = "";
        number = 0;
    }

    public Learner(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getnumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}