public class MylLinkedListQueue {
    public Node head;
    public Node tail;

    public MylLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int key) {
        Node temporary = new Node(key);
        if (tail == null) {
            head = tail = temporary;
            return;
        }
        tail.next = temporary;
        tail =temporary;
    }

    public Node dequeue() {
        if (head == null) {
            return null;
        }
        Node temporary = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return temporary;

    }
}