public class testConference {
    public static void main(String[] args) {
        Conference conference = new Conference();
        Student student1 = new Student("German", 1, "PI", 19);
        conference.addLearner(student1);
        conference.addLearner(new Student("Cardi", 2, "FIIT", 20));
        Pupil pupil1 = new Pupil("Finneas", 1, "high", 160);
        conference.addLearner(pupil1);
        conference.printConference();
        System.out.println("Количество  студентов в конференции: " + conference.getStudentsCount());
        System.out.println("Количество школьников в конференции: " + conference.getPupilsCount());
        if (conference.findLearner(student1)) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
        conference.removeLearner(student1);
    }
}