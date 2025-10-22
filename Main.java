public class Main {
    public static void main(String[] args) throws Exception {


        ArrayQueue<Character> customQueue = new ArrayQueue<>();
        customQueue.print();
        customQueue.offer('A');
        customQueue.offer('B');
        customQueue.poll();
        System.out.println("----------------");
        customQueue.print();
        customQueue.offer('C');
        customQueue.offer('D');
        customQueue.offer('E');
        System.out.println("----------------");
        customQueue.print();System.out.println("----------------");
        customQueue.print();



    }
}
