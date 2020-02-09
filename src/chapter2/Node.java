package chapter2;


public class Node<T> {
    private T data;
    private Node next = null;

    public Node(T data){
        this.data = data;
    }

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    public T getData(){
        return data;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }
}