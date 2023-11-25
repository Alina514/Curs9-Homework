package basketfruit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Basket {
    private List<String> fruits;

    public Basket() {
        fruits = new ArrayList<>();
    }
    public void addFruit(String fruit) {
        fruits.add(fruit);
    }
    public boolean find(String fruit) {
        return fruits.contains(fruit);
    }
    public boolean remove(String fruit) {
        return fruits.remove(fruit);
    }
    public int position(String fruit){
        return fruit.indexOf(fruit);
    }
    public Collection<String> distinct() {
        return new HashSet<>(fruits);
    }
    public int length(){
        return fruits.toArray().length;
    }
    public int customCount() {
        int count = 0;
        for (String fruit : fruits) {
            count++;
        }
        return count;
    }
}


