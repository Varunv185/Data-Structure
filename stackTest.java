import java.util.*;
class stack{
    int data[];
    int maxstck,top;
    stack(){
        maxstck=5;
        data= new int [maxstck];
        top=-1;
    }
    stack(int maxstck){
    this.maxstck=maxstck;
    data=new int [maxstck];
    top=-1;

}
void push(int item){
    if(maxstck==top-1){
        System.out.println("Overflow...");
    }
    top++;
    data[top]=item;
}
int pop(){
    if(top==-1){
        System.out.println("Underflow");
        return -1;
    }
    top--;
    return data[top];
    
}
int peek(){
    if(top==-1){
        System.out.println("No element");
        return -1;
    }
    return data[top];
}
boolean isEmpty(){
    if(top==-1){
        return true;
    }
    return false;
}
void display(){
    System.out.println("Stack is ");
    if(isEmpty()){
        System.err.println("Stack is empty");
    }
    for(int i=top;i>=0;i--){
        System.out.println(data[i]);
    }
}

}

public class stackTest {
    public static void main(String[]args){
        stack st =new stack(5);
       
        Scanner sc=new Scanner(System.in);
        int ch,item;
        do{
            System.out.print("1.push\n 2.pop\n 3.peek\n 4.display\n 5.exit\n Enter your choice:");
            ch=sc.nextInt();
            switch (ch) {
                case 1:{
                    System.out.print("Enter the number:");
                    item =sc.nextInt();
                    st.push(item);
                    break;
                }
                case 2:{
                   if(st.isEmpty()){
                    System.err.println("UNDERFLOW...");
                   }
                   st.pop();
                    break;
                }
                case 3:{
                   if(st.isEmpty()){
                    System.err.println("UNDERFLOW...");
                   }
                   st.peek();
                    break;
                }
                case 4:{
                   st.display();
                    break;
                }
                case 5:{
                    break;
                }

            
                default:
                System.err.println("Invalid input... ");
                    break;
            }


        }while(ch!=5);
    }
    
}
