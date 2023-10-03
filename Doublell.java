public class Doublell {
    public class Node {
    int data;
    Node next;
    Node pre;
    public Node(int data){
        this.data=data;
        this.next=null;
        this.pre=null;
    }
    }
    public static Node head;
    public static Node tail;
    public void addfst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head.pre=newnode;
        head=newnode;
        //head.pre=null;
    }
    public void print(){
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        if(temp==null) System.out.println("null");
    }
    public void rmvlst(){
        if(head==null){
            System.out.println("there is nothing to remove");
        }
        Node temp=tail.pre;
        temp.next=null;
        tail.pre=null;

    }
    public static void main(String args[]){
        Doublell dl=new Doublell();
        dl.addfst(2);
        dl.addfst(1);
        dl.rmvlst();
        dl.print();
    }
}
