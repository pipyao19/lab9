import java.util.ArrayList;

public class Conference {
    private ArrayList<Learner> learners = new ArrayList<>();

    public Conference() {
    }

    public Conference(ArrayList<Learner> learners) {
        this.learners = learners;
    }

    public void addLearner(Learner learner) {
        learners.add(learner);
    }

    public Boolean findLearner(Learner learner) {
        return learners.contains(learner);
    }

    public void removeLearner(Learner learner) {
        learners.remove(learner);
    }

    public int getStudentsCount() {
        int count = 0;
        for (Learner learner : learners) {
            if (learner instanceof Student) {
                count++;
            }
        }
        return count;
    }

    public int getPupilsCount() {
        int count = 0;
        for (Learner learner : learners) {
            if (learner instanceof Pupil) {
                count++;
            }
        }
        return count;
    }

    public void printConference() {
        System.out.println("В конференции: ");
        for (Learner learner: learners) {
            System.out.println("\t" + learner.toString());
        }
    }
}