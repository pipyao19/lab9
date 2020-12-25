public class Student extends Learner {
    private String group;
    private int age;

    public Student() {
        super();
        group = "";
        age = 0;
    }

    public Student(String name, int number, String group, int age) {
        super(name, number);
        this.group = group;
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "Учащиеся = '" + getName() + '\'' +
                        ", количество = '" + getnumber() + '\'' +
                        ", группы = '" + group + '\'' +
                        ", возраст = " + age;
    }
}

