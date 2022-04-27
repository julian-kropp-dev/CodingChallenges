package RingBuffer;

public class RingBuffer {
    private static final int BUFFER_SIZE = 8;

    private int head = 0;
    private int count = 0;
    private String[] queue = new String[BUFFER_SIZE];

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count >= queue.length;
    }
    public boolean enqueue(String value) { if (isFull()) {
        return false; }
        queue[(head + count) % queue.length] = value; count++;
        return true; }
    public String dequeue() { if (isEmpty()) {
        return null; }
        String result = queue[head];
        head = (head + 1) % queue.length; count--;
        return result;
    }
}
