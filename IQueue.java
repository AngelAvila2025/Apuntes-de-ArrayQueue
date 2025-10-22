public interface IQueue<T> {
    T poll();
    void offer(T data);
    T peek();
    void print();
    boolean isEmpty();
    int size();

}