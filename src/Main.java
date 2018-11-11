import list.ArrayListManipulation;
import list.LinkedListManipulation;
import message.Messages;

public class Main {

    public static void main(String[] args) {
        fillInsertRemoveStatistic(10000);
        Messages.separateLines();
        fillInsertRemoveStatistic(100000);
        Messages.separateLines();
        fillInsertRemoveStatistic(500000);
        Messages.separateLines();
        fillInsertRemoveStatistic(1000000);
    }

    private static void fillInsertRemoveStatistic(int listSize) {
        LinkedListManipulation linkedList = new LinkedListManipulation();
        ArrayListManipulation arrayList = new ArrayListManipulation(listSize);

        linkedList.fillLinkedList(listSize);
        linkedList.removeElem(0);
        linkedList.removeElem(linkedList.linkedList.size()/2);
        linkedList.removeElem(linkedList.linkedList.size()-1);
        Messages.separateLines();

        linkedList.insertElem(0);
        linkedList.insertElem(linkedList.linkedList.size()/2);
        linkedList.insertElem(linkedList.linkedList.size()-1);
        Messages.separateLines();

        arrayList.fillArrayList();
        arrayList.removeElem(0);
        arrayList.removeElem(arrayList.arrayList.size()/2);
        arrayList.removeElem(arrayList.arrayList.size()-1);
        Messages.separateLines();

        arrayList.insertElem(0);
        arrayList.insertElem(arrayList.arrayList.size()/2);
        arrayList.insertElem(arrayList.arrayList.size()-1);
    }
}