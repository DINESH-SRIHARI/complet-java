public class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static  Node head;
    public static Node tail;
    public static int size;
    public void addfst(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addlst(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public static void pnt(Node head){
        if(head==null){
            System.out.println("empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        if(temp==null){
            System.out.print("null");
        }
        System.out.println();
    }
    public void addmdl(int idx,int data){

        if(idx==0){
            addfst(data);
            return;
        }
        Node newnode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public void rmmdl(int idx){
        Node temp=head;
        int c=1;
        while(temp!=null){
            if(c==idx){
                temp.next=temp.next.next;
            }
            temp=temp.next;
            c++;
        }
        pnt(temp);
    }
    public int rmfst(){
        if(head==null){
            System.out.println("already empty");
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int rmlst(){
        if(head==null){
            System.out.println("empty");
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        int val=tail.data;
        temp.next=null;
        tail=temp;
        size--;
        return val;
    }
    public void rl(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public int search(int k){
        int i=0;
        Node temp=head;
        while(temp!=null){
            if(k==temp.data){
                return i;
            }
            else{
                temp=temp.next;
                i++;
            }
        }
        return -1;

    }
    public void reverse(){
        Node pre=null;
        Node cur=head;
        Node next;
        while(cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        head=pre;
    }
    public void dltfrmend(int n){int s=0;
        Node temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(size == n){
            head=head.next;
            return;
        }
        int i=0;
        Node pre=head;
        int x=size-n;
        while(i<x){
            pre=pre.next;
            i++;
        }
        pre.next=pre.next.next;
        return;
    }
    public Node fndmidval(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
     public boolean palindrome(){
        Node mid=fndmidval(head);
        Node pre=null;
        Node cur=mid;
        Node next;
        while(cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        Node r=pre;
        Node l=head;
        while(r!=null){
            if(r.data!=l.data){
                return false;
            }
            r=r.next;
            l=l.next;
        }
        return true;
    }
    public static boolean cyclic(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public static boolean cyc(){
        //Node temp=head;
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void rmcl(){
        boolean clc=false;
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                clc=true;
                break;
            }
        }
        if(clc=false) return;
        Node pre=null;
        while(fast!=null&&fast.next!=null){
            pre =slow;
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                pre.next=null;
            }
        }
    }
   public static void rmcycle(){
            Node pre=null;
            Node fast=head;
            Node slow=head;
            while(fast.next!=null&&fast!=null){
                slow=slow.next;
                pre=fast;
                fast=fast.next.next;
                if(slow==fast){
                    slow=head;
                    fast=fast.next.next;
                    while(fast!=slow){
                        slow=slow.next;
                        pre=fast;
                        fast=fast.next;
                    }
                    pre.next=null;
                    return;
                }


            }
        }
   // public Node mergsrt(Node head){
//        //find mid value
//        Node slow=head;
//        Node fast=head.next;
//        while(fast!=null&&fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        Node mid=slow;
//        Node rhead=mid.next;
//        Node lhead=head;
//        mid.next=null;
//        Node newlft=mergsrt(lhead);
//        Node newrt=mergsrt(rhead);
//        //merge
//        return mergsrt(newlft,newrt);
//    }
    public static boolean clc(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null&&fast!=null){

            slow =slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static boolean pal(){
        Node fast=head;
        Node slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        Node pre=null;
        Node cur=head;
        Node nxt;
        while(cur!=slow){
            nxt=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nxt;
        }
        Node l=pre;
        Node r=slow;
        while(l!=null){
            if(l.data!=r.data){
                return false;
            }
            r=r.next;
            l=l.next;
        }
        return true;
    }
    public static void afsrt(LinkedList l,LinkedList l2){
        Node finallist=new Node(-1);
        Node temp=finallist;
        Node temp1=l.head;
        Node temp2=l2.head;
        while(temp1!=null||temp2!=null){
            if(temp1.data<=temp2.data){
                temp.next=temp1;
                temp1=temp1.next;
            }
            else{
                temp.next=temp2;
                temp2=temp2.next;
            }
        }
        if(temp1==null){
            while(temp2!=null){
                temp.next=temp2;
                temp2=temp2.next;
            }
        }
        if(temp2==null){
            while(temp1!=null){
                temp.next=temp1;
                temp1=temp1.next;
            }
        }
        pnt(finallist.next);
    }
    public static void dltwoh(){
        Node temp=head;
        while(temp!=null){
            if(temp.next.data>temp.data){

            }
        }
    }
//    //public static void mergsrt(){**********************************************
//        Node slow=head;
//        Node fast=head.next;
//
//    }

    public static void main(String args[]){
        LinkedList l2=new LinkedList();
        LinkedList l1=new LinkedList();
       // ll.pnt();
        l1.addlst(100);
        l1.addlst(600);
        l2.addlst(300);
        l2.addlst(400);
        pnt(l1.head);
        pnt(l2.head);
        //l1.pnt();
        //l1.rmmdl(2);
        //afsrt(l1,l2);
        //l1.pnt();
//        l2.pnt();
//        l2.rl();
//        l2.pnt();

//        ll.addmdl(1,3);
//        ll.pnt();
        //ll.rmfst();
        //ll.rmlst();
        //ll.pnt();
         //System.out.println(ll.size);
        //System.out.println(ll.search(10));
       // ll.reverse();
        //ll.pnt();
//        ll.dltfrmend(3);
//        ll.pnt();
//        ll.addlst(1);
//        ll.addlst(2);
//        ll.addlst(2);
//        ll.addlst(1);
//        head=new Node(1);
//        head.next=new Node(2);
//        head.next.next=new Node(3);
//        head.next.next.next=head;
//
//        rmcl();
//        pnt();

        //head.next.next.next=head;
        //System.out.println(cyc());
//        rmcycle();
//        System.out.println(cyclic(head));
//        head=new Node(1);
//        head.next=new Node(2);
//        head.next.next=new Node(3);
//        System.out.println( clc(head));
       // System.out.println(ll.pal());
    }

}