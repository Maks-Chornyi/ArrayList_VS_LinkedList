package list;

import message.Messages;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListManipulation {

    public List<Integer> arrayList;
    private int listSize;

    public ArrayListManipulation(int listSize) {
        this.listSize = listSize;
        this.arrayList = new ArrayList<>(this.listSize);
    }

    public void fillArrayList() {
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < this.listSize; i++)
            this.arrayList.add(new Random().nextInt(50000));
        Messages.filledArrayMessage(System.currentTimeMillis() - startTime, this.arrayList.size(), this.arrayList);
    }

    public void removeElem(int index) {
        long startTime = System.currentTimeMillis();
        this.arrayList.remove(index);
        Messages.removeMessage(System.currentTimeMillis() - startTime, index, this.arrayList);
    }

    public void insertElem(int index) {
        long startTime = System.currentTimeMillis();
        this.arrayList.add(index,1);
        Messages.insertMessage(System.currentTimeMillis() - startTime, index, this.arrayList);
    }
}
