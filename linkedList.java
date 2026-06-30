class Node{
    int info;
    Node next;
    Node(){
        info=0;
        next=null;
    }
    Node(int info){
        this.info=info;
        this.next=null;
    }
    Node(int info,Node next){
        this.info=info;
        this.next=next;
    }
}
class list{
    private Node start;
    list(){
        start=null;
    }
    void addFirst(int item){
        Node t =new Node(item);
        t.next = start;
        start = t;
    }
    void addlast(int item){
        Node ptr =start;
        Node t =new Node(item);
        if(start==null){
            t.next =start;
            start=t;
        }
        else {
            while(ptr.next!=null){
                ptr=ptr.next;
            }
            ptr.next =t;
        }
    }
    
    void display(){
        Node ptr =start;
        while(ptr!=null){
            System.out.print(ptr.info+"\t");
            ptr=ptr.next;
        }
    }

}
public class linkedList {
    public static void main(String[]args){
        list l1 =new list();
        l1.addFirst(50);
        l1.addFirst(40);
        l1.addFirst(30);
        l1.addFirst(20);
        l1.addFirst(10);
        l1.addlast(60);
        l1.display();
    }
    
}
