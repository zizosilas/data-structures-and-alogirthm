public class stack {

    int size ;
    int top;
    int[] array;

    stack(int capacity){
        top = -1;
        size = capacity;
        array = new int[size];

    }

    boolean isFull(){
        return (top == size-1);
    }

    boolean isEmpty(){
        return (top == -1);
    }
    void push(int item){
        if (isFull()) {
            System.out.println("Stack Overflow");

        }else {
            array[top +1] = item;
            top++;
        }

    }
    void pop(int team){
        if (isEmpty()){
            System.out.println("Stack is Empty");

        }else{
            top--;
        }
    }
    void printAll(){
        if(isEmpty()){
            System.out.println("Array is Empty");
        }else{
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }
}
