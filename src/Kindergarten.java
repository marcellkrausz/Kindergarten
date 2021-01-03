import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Kindergarten {

    List<String> activities = new ArrayList<>();
    List<Child> kindergartenChildList = new ArrayList<>();
    List<KindergartenGroup> kindergartenGroups = new ArrayList<>();

    public Kindergarten() {

        activities.add("ball");
        activities.add("sing");
        activities.add("draw");
        activities.add("draw");
        activities.add("ball");
        activities.add("sing");
        activities.add("ball");
        activities.add("dance");
        activities.add("dance");
        activities.add("dance");
        activities.add("ball");
        activities.add("sing");


        kindergartenGroups.add(new KindergartenGroup("1"));
        kindergartenGroups.add(new KindergartenGroup("2"));
        kindergartenGroups.add(new KindergartenGroup("3"));

        kindergartenChildList.add(new Cherfull("Jani", 2));
        kindergartenChildList.add(new Musician("Pisti", 2));
        kindergartenChildList.add(new Cherfull("Gábor", 2));
        kindergartenChildList.add(new Cozy("Anna", 2));
        kindergartenChildList.add(new Musician("Ádám", 2));
        kindergartenChildList.add(new Cozy("Csilla", 2));
        kindergartenChildList.add(new Cherfull("Adrien", 2));

        for (int i = 0; i < kindergartenChildList.size(); i++) {
            int grpNumber = randomGroup();
            kindergartenGroups.get(grpNumber).add(kindergartenChildList.get(i));
        }
    }

    public Kindergarten(String random) {

        activities.add(randomActivities());
        activities.add(randomActivities());
        activities.add(randomActivities());
        activities.add(randomActivities());
        activities.add(randomActivities());
        activities.add(randomActivities());
        activities.add(randomActivities());
        activities.add(randomActivities());

        kindergartenGroups.add(new KindergartenGroup("1"));
        kindergartenGroups.add(new KindergartenGroup("2"));
        kindergartenGroups.add(new KindergartenGroup("3"));

        kindergartenChildList.add(new Cherfull("Jani", 2));
        kindergartenChildList.add(new Musician("Pisti", 2));
        kindergartenChildList.add(new Cherfull("Gábor", 2));
        kindergartenChildList.add(new Cozy("Anna", 2));
        kindergartenChildList.add(new Musician("Ádám", 2));
        kindergartenChildList.add(new Cozy("Csilla", 2));
        kindergartenChildList.add(new Cherfull("Adrien", 2));

        for (int i = 0; i < kindergartenChildList.size(); i++) {
            int grpNumber = randomGroup();
            kindergartenGroups.get(grpNumber).add(kindergartenChildList.get(i));
        }
    }

    public void simulateDay() {
        for (int i = 0; i < activities.size(); i++) {
            for (int groupNumber = 0; groupNumber < kindergartenGroups.size(); groupNumber++) {
                for (int k = 0; k < kindergartenGroups.get(groupNumber).size(); k++) {
                    kindergartenGroups.get(groupNumber).get(k).play(activities.get(i));
                    //   System.out.println(kindergartenGroup.get(j).getName() + " has " + kindergartenGroup.get(j).getSatisfied());
                    //   System.out.println(kindergartenGroup.get(j).isBlat());
                }
            }
            if (isDayChaos()) {
                break;
            }
        }
    }

    public void printStatus() {
        for (int groupNumber = 0; groupNumber < kindergartenGroups.size(); groupNumber++) {
            for (int j = 0; j < kindergartenGroups.get(groupNumber).size(); j++) {
                System.out.println("\n " + kindergartenGroups.get(groupNumber).get(j).getName() + " has satisfied " + kindergartenGroups.get(groupNumber).get(j).getSatisfied());
            }
        }
    }

    public boolean isDayChaos() {
        int childUnsatisfied = 0;
        for (int groupNumber = 0; groupNumber < kindergartenGroups.size(); groupNumber++) {
            for (int j = 0; j < kindergartenGroups.get(groupNumber).size(); j++) {
                Child child = kindergartenGroups.get(groupNumber).get(j);
                if (child.isBlat()) {
                    childUnsatisfied += 1;
                    // System.out.println(childUnsatisfied);
                }
            }
        }
        if (childUnsatisfied >= 3) {
            System.out.println("The day is in chaos!");
            return true;
        } else {
            System.out.println("The day is good!");
            return false;
        }
    }

    public String randomActivities() {
        String[] activities = new String[]{"ball", "draw", "sing", "dance"};
        Random random = new Random();
        return activities[random.nextInt(4)];
    }

    public int randomGroup() {
        Random random = new Random();
        return random.nextInt(3);
    }
}