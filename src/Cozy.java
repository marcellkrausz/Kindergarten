public class Cozy extends Child{
    private String name;
    private int satisfied;
    private boolean isBlat;

    public Cozy(String name, int satisfied){
        this.name = name;
        this.satisfied = satisfied;
        this.isBlat = false;
    }

    @Override
    public void play(String activity) {
        if (activity.equals("draw")) {
            setSatisfied(satisfied + 4);
        }else if (activity.equals("dance")) {
            setSatisfied(satisfied - 1);
        }else if (activity.equals("ball")) {
            setSatisfied(satisfied - 2);
        }
        if (satisfied <= 0) {
            setBlat(true);
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getSatisfied() {
        return this.satisfied;
    }

    @Override
    public void setSatisfied(int satisfied) {
        this.satisfied = satisfied;
    }

    @Override
    public boolean isBlat() {
        return this.isBlat;
    }

    @Override
    public void setBlat(boolean isBlat) {
        this.isBlat = isBlat;
    }
}
