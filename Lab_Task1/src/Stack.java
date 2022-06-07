class Stack<T extends Object> {
    private int size;
    private T[] stackAr;
    private int top; // top of stack

    public Stack(int size) {
        this.size = size;
        stackAr = (T[])new Object[size]; //Creation of Generic Stack Array
        top = -1; // initialize Stack to with -1
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == size - 1);
    }

    public void push(T value){
        if(isFull()){
            System.out.println("Cannot push "+value+", Stack is full");
        }
        else{
            stackAr[++top] = value;
        }
    }

    public T pop() {
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        return stackAr[top--]; // remove item and decrement top as well.

    }

    public T top(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        return stackAr[top];
    }

    public String toString()
    {
        if (isEmpty())
            return "";

        String Ans = "";

        for (int i = 0; i < top; i++) {
            Ans += String.valueOf(stackAr[top]) + "->";
        }

        Ans += String.valueOf(stackAr[top]);

        return Ans;
    }

}


