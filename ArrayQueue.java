public class ArrayQueue<T> implements IQueue<T> {

    private Object[] data;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue(){
        this(10);

    }

    public ArrayQueue(int tam){
        this.data=new Object[tam];
        this.front=0;
        this.rear=0;
        this.size=0;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T poll() {
        if(isEmpty()){
            System.out.println("La queue esta vacia");
            return null;
        }
        T result=(T) data[front];
        data[front]=null;
        front=(front+1)%data.length;
        size--;
        return result;
    }

    @Override
    public void offer(T element) {
        this.data[rear]=element;
        this.rear=(rear+1)%data.length;
        size++;

    }

    @SuppressWarnings("unchecked")
    @Override
    public T peek() {
        if(isEmpty()){
            System.out.println("La queue esta vacia");
            return null;
        }
        return (T) data[front];
    }

    @Override
    public void print() {
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append( data[ (front+i)%data.length ] );
            sb.append("->");

        }
        sb.append("]");
        System.out.println(sb.toString());

    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return this.size;
    }

}