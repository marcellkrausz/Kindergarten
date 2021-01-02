public class Cherfull extends Child{

    private String name;
    private int satisfied;
    private boolean isBlat;

    public Cherfull(String name, int satisfied){
        this.name = name;
        this.satisfied = satisfied;
        this.isBlat = false;
    }

    @Override
    public void play(String activity ) {
        if (activity.equals("ball")) {
            setSatisfied(satisfied + 3);
        } else if (activity.equals("sing") || activity.equals("draw")) {
            setSatisfied(satisfied - 1);
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
