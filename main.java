public class main {
    public static void main(String[] args){
        stack mystack = new stack(5);
        mystack.push(5);
        mystack.push(4);
        mystack.push(3);
        mystack.push(2);
        mystack.push(1);

        mystack.printAll();
    }
}
