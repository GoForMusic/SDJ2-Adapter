import java.util.ArrayList;

public class Queue implements StringQueue{

    private ArrayList<String> list;

    public Queue(){
        list= new ArrayList<>();
    }

    @Override
    public void enqueue(String element) {
        
    }

    @Override
    public String dequeue() {
        return null;
    }

    @Override
    public String first() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int indexOf(String element) {
        return 0;
    }

    @Override
    public boolean contains(String element) {
        return false;
    }
}
