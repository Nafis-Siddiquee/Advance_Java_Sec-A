public class Main {
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<Double>(20);
        Stack<String> stack1 = new Stack<String>(20);

        Queue<Double> queue = new Queue<Double>(20);
        Queue<String> queue1 = new Queue<String>(20);


        stack.push(11d);
        stack.push(21.7);
        stack.push(31.23);
        stack.push(41d);
        stack.push(51.5);


        System.out.print("Popped items: ");
        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+" ");


        queue.enQueue(5d);
        queue.enQueue(21d);
        queue.enQueue(31.34);
        queue.enQueue(41d);
        queue.enQueue(51.67);


        System.out.print("Dequeued items: ");
        System.out.print(queue.deQueue()+" ");
        System.out.print(queue.deQueue()+" ");
        System.out.print(queue.deQueue()+" ");
        System.out.print(queue.deQueue()+" ");
        System.out.print(queue.deQueue()+" ");


    }
}