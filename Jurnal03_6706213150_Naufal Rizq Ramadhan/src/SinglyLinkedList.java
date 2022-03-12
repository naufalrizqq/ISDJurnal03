import java.util.NoSuchElementException;
public class SinglyLinkedList<E> {
    private ListNode<E> firstNode;
    private ListNode<E> lastNode;
    private String name;

    public SinglyLinkedList() {
        this("linked list");
    }

    public SinglyLinkedList(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }
    private boolean isEmpty(){
        return firstNode == null;
    }
    public void insertAtFront(E insertItem) {
        ListNode newNode = new ListNode(insertItem);
        if (isEmpty()) {
            firstNode = lastNode = new ListNode<E>(insertItem);
        } else {
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }

    public void insertAtBack(E insertItem) {
        ListNode newNode = new ListNode(insertItem);
        if (isEmpty()) {
            firstNode = lastNode = new ListNode<E>(insertItem);
        } else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
    }
    public E removeFromBack() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(name + " is empty");
        }
        E removedItem = lastNode.data;
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            ListNode<E> current = firstNode;
            while (current.next != lastNode) {
                current = current.next;
            }
            lastNode = current;
            current.next = null;
        }
        return removedItem;
    }
    public E removeFromFront() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(name + " is empty");
        }
        E removedItem = firstNode.data;
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            ListNode<E> current = firstNode.next;
            firstNode = current;
            firstNode = null;
        }
        return removedItem;
    }
    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s%n", name);
            return;
        }
        System.out.printf("The %s is: %n", name);
        ListNode<E> current = firstNode;
        while (current != null) {
            System.out.printf("%s ", current.data);
            current = current.next;
        }
        System.out.println();
    }
}
