public abstract class Child {

    private String name;
    private int satisfied;
    private boolean isBlat;

    public abstract void play(String activity);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSatisfied() {
        return satisfied;
    }

    public void setSatisfied(int satisfied) {
        this.satisfied = satisfied;
    }

    public boolean isBlat() {
        return isBlat;
    }

    public void setBlat(boolean blat) {
        isBlat = blat;
    }
}
