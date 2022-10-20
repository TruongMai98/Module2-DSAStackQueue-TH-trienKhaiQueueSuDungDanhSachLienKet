public class LinkedListQueueClient {
    public static void main(String[] args) {
        MylLinkedListQueue mylLinkedListQueue = new MylLinkedListQueue();

        mylLinkedListQueue.enqueue(20);
//        mylLinkedListQueue.enqueue();
//        mylLinkedListQueue.enqueue();
        mylLinkedListQueue.enqueue(30);
        mylLinkedListQueue.enqueue(40);
        mylLinkedListQueue.enqueue(50);
        mylLinkedListQueue.enqueue(11);
        System.out.println("dequeue item is = " + mylLinkedListQueue.dequeue().key);
        // first in first out
    }
}
