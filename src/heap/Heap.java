package heap;

import java.util.ArrayList;
import java.util.List;


// P = (LC-1)/2 => LC = 2P+1
// P = (RC/2-1) => RC = 2(P+1)
public class Heap {

    private final List<Integer> list = new ArrayList<>();
    public void add(Integer element){
        this.list.add(element);
        upheapify(this.list.size()-1);
        this.print();
    }

    private void upheapify(int index) {
        int parentIndex = (index-1)/2;

        if(this.list.get(parentIndex)>this.list.get(index)) {
            swap(parentIndex, index);
            upheapify(parentIndex);
        }
    }

    public Integer delete(Integer element){
        return null;
    }

    public Integer get(int index){
        return null;
    }
    public void print(){
        System.out.println(this.list);
    }

    private void swap(int i, int j){
        Integer ithElement = this.list.get(i);
        Integer jthElement = this.list.get(j);
        this.list.set(j, ithElement);
        this.list.set(i, jthElement);
    }

    public int size(){
        return this.list.size();
    }
}
