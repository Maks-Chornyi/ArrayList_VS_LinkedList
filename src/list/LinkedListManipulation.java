package list;

import message.Messages;

import java.util.LinkedList;
import java.util.List;

public class LinkedListManipulation {

    public List<Integer> linkedList;

    public LinkedListManipulation() {
        this.linkedList = new LinkedList<>();
    }

    public void fillLinkedList(int listCount) {
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < listCount; i++)
            this.linkedList.add(i);
        Messages.filledArrayMessage(System.currentTimeMillis() - startTime, listCount, this.linkedList);
    }

    public void removeElem(int index) {
        long startTime = System.currentTimeMillis();
        this.linkedList.remove(index);
        Messages.removeMessage(System.currentTimeMillis() - startTime, index, this.linkedList);
    }

    public void insertElem(int index) {
        long startTime = System.currentTimeMillis();
        this.linkedList.add(index,1);
        Messages.insertMessage(System.currentTimeMillis() - startTime, index, this.linkedList);
    }
}
