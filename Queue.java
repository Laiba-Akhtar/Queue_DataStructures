import java.util.ArrayDeque;

class Queue   implements QueueInterface{

    private Node head =new Node(null);
    private int size;
  
    class Node{
        Object object;
        Node next=this;
        Node prev=this;

Node(Object o)
{
object=o;
       
}
Node (Object object,Node temp,Node prev)
{
this.object=object;
this.next=temp;
this.prev=prev;
}

    }
public void add(Object object)
{

head.prev=head.prev.next=new Node(object, head, head.prev);
size++;
}
public Object first(){

    if(size==0)  System.out.println("empty"); 

  //System.out.println(head.next.next.object);
    return head.next.object;
}
public Object last(){

    if(size==0)  System.out.println("empty"); 


    return head.prev.object;
}
public int size(){
    return size;}

   
public Object remove()
{
    if(size==0) {
     System.out.println("empty");
    return 0;}

Object first=head.next.object;
head.next=head.next.next;
head.next.prev=head;
size--;
return first;

}
public static Queue merge(Queue headnew,Queue headold)
{

Node head2=headnew.head;
Node head1=headold.head;

head1.prev.next=head2.next;
head2.next.prev=head1.prev;
head1.prev=head2.prev;
head2.prev.next=head1;

return headold;

}
public static void contains(Queue headpass,Object object)
{
    boolean status=false;
   
    Node head2=headpass.head;

   while(head2.next.object!=null){
   
    if(head2.next.object==object)
    {
        status=true;
    }

    head2=head2.next;
}
System.out.println(status);


}
/*
public static   Queue   insert(Queue headpass,Object object1)
{
    int count=0;
    int middle=headpass.size/2;
  
   
    Node head2=headpass.head;
   
    while(head2.next.object!=null){
        count++;
   if(count==middle){
    Node temp=(Node )head2.object;
    head2.next=head2.next.next=new Node(object1, temp,head2.next );
   
    
   }
       
        head2=head2.next;
        
    }
    
    System.out.println(middle);
   System.out.println(count);
  
    
   
   
return headpass;

}*/

public static void  ToString(Queue headpass){

    Node head2=headpass.head;
    for(Node i=head2;i!=head2.prev;i=i.next)
    {
        

if(i.next.object==null){
System.out.println("The end.");
break;
}


System.out.println(i.next.object.toString()+",");

head2=head2.next;

    }
    /*
while(head2.next!=null)
{
    System.out.println(head2.next.object+","); 
    head2=head2.next;
}*/




}
public String  toString(){

    Node head2=this.head.next.next;
    StringBuffer buff=new StringBuffer("["+this.remove());
   while(size!=0)
    {
buff.append(","+this.remove());
    }
return buff+"]";
}

public static void Reverse(Queue headpass)
{
    //Queue q=new Queue();
   Node  p=headpass.head;
for(Node p1=p.prev;p1!=p;p1=p1.prev)
{

//q.head.object=p.object;
//q.head=q.head.next;
System.out.println(p1.object);
}

}
public static void equal(  Queue q,  Queue q1){
    boolean status=false;
Node p=q.head.next;
Node p1=q1.head.next; 
System.out.println(p1.object);
if(q.size==q1.size){
while(p!=null && p1!=null)
{
   Object po=p.object;
   Object p1o=p1.object;
   if(po.equals(p1o))
  status=true;

  p=p.next;
  p1=p1.next;

}

}
System.out.println(status);

}
public   Queue middle(Queue q,Object o)
{
   
Node p=q.head.next;
Node q1=q.head.next;
while(p!=q.head.prev&& p.next!=q.head.prev){

p=p.next.next;
q1=q1.next;

}
q1=q1.next;
q1.prev=q1.prev.next=new Node(o,q1,q1.prev);

//System.out.println(q1.object);
++size;
return q;

}
public   Queue middlesir(Queue q,Object o)
{
   int mid=q.size/2;
  int  count=1;
Node p=q.head;

while(p.object!=null){

    if(count==mid) {
p.next=new Node(o,p.next,p);
    }
p=p.next;
count++;
}

//System.out.println(q1.object);
++size;
return q;

}
public static void display(Queue q){
//Node p=q.head.next;
for(Node p=q.head.next;p!=q.head;p=p.next){

System.out.println(p.object);



}



}
public Queue clone(Queue q){

    Queue q1=new Queue();
    while(q.size!=0)
    q1.add(q.remove());
    
    
        return q1;
    }

   public arrayqueue toarr(){

    arrayqueue newobj=new arrayqueue(8);
    
   // Object temp[]=new Object [size];
    
      for(Node i=this.head.next;i!=head.prev.next;i=i.next)
        
   {
      newobj.queueInsert(i.object);
   }
    
    
    return newobj;
   } 
   public LinkedStack toStack(){
       if(head.next==null)
       throw new IllegalArgumentException();
       LinkedStack  l=new LinkedStack() ;
       for(Node i=this.head.next;i!=head.prev.next;i=i.next){
           l.push(i.object);
       }
         
         
       return l;
   }

public static void main(String[] args) {
    
     Queue q=new Queue();
     Queue q1=new Queue();
     Queue q2=new Queue();
     q.add("hello");
     q.add("hello1");
     q.add("hello2");
     q.add("hello3");
     q1.add("2-hello");
     q1.add("2-hello1");
     q1.add("2-hello2");
     q1.add("2-hello3");
     q2.add("hello");
     q2.add("hello1");
     q2.add("hello2");
     System.out.println("hello");
    //display(q);
   System.out.println(q);
   // display(q.middlesir(q, "hhh"));
  //  q.toString(q);
   // display(q.middle(q, "hhhhhh"));
     //arrayqueue toarr=q2.toarr();
    //toarr.queueDisplay();
   // LinkedStack ls=q2.toStack();
   // ls.display(ls);


    // Queue colne=q.clone(q);
    // display(colne);
    // q.Reverse(q);
    // q.middle(q);
   
     //equal(q, q1);
     
     //display(q);
     //Reverse(q);
     //ToString(q);
     //System.out.println("Size="+q.size);
     //merge

     //Queue merge=merge(q1,q);
     //ToString(q);
    //System.out.println( merge.first());
    //System.out.println( merge.last());
  
    
    //display(merge);
   // contains(q, "hhello");

   //insert
 // Queue insert=insert(q1,"hello-6");
    
   //System.out.println(q1);

   //Reverse(q);
    //System.out.println( q.first());
    //System.out.println( q.size);
    //System.out.println( q1.remove());
   // System.out.println( q1.size);


 }
}