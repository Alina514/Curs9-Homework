package bucketflower;
import java.util.Collection;
import java.util.HashSet;

public class FlowerBucket {
    private Collection<String> flowers;

    public FlowerBucket(){
        this.flowers = new HashSet<>();
    }

    public void addFlowers(String flowerName){
        flowers.add(flowerName);
    }
    public Collection<String> getAll(){
        return flowers;
    }
    public void remove(String flowerName) {
        flowers.remove(flowerName);
    }
}



