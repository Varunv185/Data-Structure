import java.util.Scanner;

class Node {
    int info;
    Node next;

    Node() {
        info = 0;
        next = null;
    }

    Node(int info) {
        this.info = info;
        this.next = null;
    }

    Node(int info, Node next) {
        this.info = info;
        this.next = next;
    }
}

class linkedList {
    Node start;

    linkedList() {
        start = null;
    }

    void addfirst(int item) {
        Node t = new Node(item);
        t.next = start;
        start = t;
    }
    void addLast(int item){
        Node t =new Node(item);
        Node ptr =start;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next =t;
    }
    int count(){
        int cnt=0;
        Node ptr =start;
        while(ptr!=null){
            cnt++;
            ptr=ptr.next;
        }
        return cnt;
    }
    int max(){
        int maxx=0;
        Node ptr =start;
        while(ptr!=null){
            if(ptr.info>maxx){
                maxx=ptr.info;
            }
            ptr=ptr.next;
        }
        return maxx;
    }
    void reverse(){
        Node p1=start,p2=null,p3;
        while(p1!=null){
            p3=p2;
            p2=p1;
            p1=p1.next;
            p2.next=p3;
        }
        start=p2;
    }
    void addAfter(int num,int item){
        Node ptr =start;
        Node t =new Node(item);
        while(  ptr!=null && ptr.info != num){
            ptr=ptr.next;
        }
        if(ptr==null){
            System.out.println("Not found...");
        }
        t.next=ptr.next;
        ptr.next=t;
    }
    void addBefore(int num,int item){
        Node preptr=null,ptr=start;
        Node t=new Node(item);
        while(ptr!=null&&ptr.info!=num){
            preptr=ptr;
            ptr=ptr.next;
        }
        if(ptr==null){
            System.out.println("NOT found...");
        return;
    }
        //sucess
        if(ptr==start){
            t.next=start;
            start=t;
        }
        t.next=ptr;
        preptr.next=t;


    }
    void delnode(int item){
        Node preptr=null,ptr=start;
        while(ptr!=null&&ptr.info!=item){
            preptr=ptr;
            ptr=ptr.next;
        }
        if(ptr==null){
            System.err.println("item not found...");
            return;
    }
        if(ptr==start){
            start= start.next;
        }
        else
            preptr.next=ptr.next;
    }
    void traverse() {
        Node ptr = start;
        while (ptr != null) {
            System.out.print(ptr.info+"\t");
            ptr = ptr.next;
        }
        System.out.println();
    }

}

public class linkedListCheck {
   public static void main(String[]args){
    linkedList l1  = new linkedList();
    Scanner sc=new Scanner(System.in);
    int item,num,ch;
    do{System.out.println("1. Addfirst\n2.Addlast\n3.addafter\n4.addbefore\n5.delnode\n6.traverse\n7.count\n8.Reverse\n9.Exit\n Enter your choice:");
    ch=sc.nextInt();
    switch(ch){
        case 1:
            System.out.print("Enter the element :");
            item=sc.nextInt();
            l1.addfirst(item);
            break;
        case 2:
            System.out.print("Enter the element :");
            item=sc.nextInt();
            l1.addLast(item);
            break;
        case 3:
            System.out.print("Enter the element to add and number after which u want to add:");
            num=sc.nextInt();
            item=sc.nextInt();
            l1.addAfter(num, item);
            break;
        case 4:
            System.out.print("Enter the element to add before and number before which u want to add:");
            num=sc.nextInt();
            item=sc.nextInt();
            l1.addBefore(num, item);
            break;
        case 5:
            System.out.print("Enter the element to delete :");
            item=sc.nextInt();
            l1.delnode(item);
            break;
        case 6:
            l1.traverse();
            break;
        case 7:
            System.out.println("the total node are "+l1.count());
            break;
        case 8:
            l1.reverse();
            break;
        case 9:
            break;
        default:
            System.out.println("INVAID INPUT...");
            break;
    }

    }while(ch!=9);
   }

}
