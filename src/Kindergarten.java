import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Kindergarten {

    List<String> activities = new ArrayList<>();
    List<Child> kindergartenGroup = new ArrayList<>();

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

        kindergartenGroup.add(new Cherfull("Jani", 2));
        kindergartenGroup.add(new Musician("Pisti", 2));
        kindergartenGroup.add(new Cherfull("Gábor", 2));
        kindergartenGroup.add(new Cozy("Anna", 2));
        kindergartenGroup.add(new Musician("Ádám", 2));
        kindergartenGroup.add(new Cozy("Csilla", 2));
        kindergartenGroup.add(new Cherfull("Adrien", 2));

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


        kindergartenGroup.add(new Cherfull("Jani", 2));
        kindergartenGroup.add(new Musician("Pisti", 2));
        kindergartenGroup.add(new Cherfull("Gábor", 2));
        kindergartenGroup.add(new Cozy("Anna", 2));
        kindergartenGroup.add(new Musician("Ádám", 2));
        kindergartenGroup.add(new Cozy("Csilla", 2));
        kindergartenGroup.add(new Cherfull("Adrien", 2));

    }

    public void simulateDay() {
        for (int i = 0; i < activities.size(); i++) {
            for (int j = 0; j < kindergartenGroup.size(); j++) {
                kindergartenGroup.get(j).play(activities.get(i));
             //   System.out.println(kindergartenGroup.get(j).getName() + " has " + kindergartenGroup.get(j).getSatisfied());
             //   System.out.println(kindergartenGroup.get(j).isBlat());
            }
        }
    }

    public void printStatus(){
        for (int j = 0; j < kindergartenGroup.size(); j++) {
            System.out.println(kindergartenGroup.get(j).getName() + " has satisfied " + kindergartenGroup.get(j).getSatisfied());
        }
    }

    public void isDayChaos() {
        int childUnsatisfied = 0;
        for (int i = 0; i < kindergartenGroup.size(); i++) {
            if(kindergartenGroup.get(i).isBlat()) {
                childUnsatisfied += 1;
                System.out.println(childUnsatisfied);
            }
        }
        if (childUnsatisfied >= 3) {
            System.out.println("The day is in chaos!");
        }else {
            System.out.println("The day is good!");
        }
    }
    public String randomActivities(){
        String[] activities = new String[]{"ball", "draw", "sing", "dance"};
        Random random = new Random();
        return activities[random.nextInt(4)];
    }
}