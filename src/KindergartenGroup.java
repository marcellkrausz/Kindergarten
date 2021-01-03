import java.util.ArrayList;
import java.util.List;

public class KindergartenGroup {

    String name;
    List<Child> kindergartenChildren = new ArrayList<>();

    public KindergartenGroup(String name){
        this.name = name;
    }

    public void add (Child child){
        kindergartenChildren.add(child);
    }

    public int size () {
       return kindergartenChildren.size();
    }
    public Child get(int index){
        return kindergartenChildren.get(index);
    }
}
