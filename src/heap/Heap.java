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

    //For min-heap, it deletes the root node element as it has the highest priority
    public Integer delete(){

        this.swap(0, this.list.size()-1);
        int leftChildIndex = 2*0+1;
        int rightChildIndex = 2*0+2;

        return this.list.get(this.list.size()-1);
    }

    private void downHeapify(int index){
        if(index>=this.list.size()-1){
            return;
        }
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
