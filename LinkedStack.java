
import java.util.NoSuchElementException;


public class LinkedStack  {
private Node top;
private int size;

class Node{
Object object;
Node next;
Node(Object object,Node next){
this.object=object;
this.next=next;


}


}
public boolean isempty()
{
    return (size==0);
}
public Object peak()
{
    if(size==0) throw new NoSuchElementException();
return top.object;

}
public Object pop()
{
    if(size==0) throw new NoSuchElementException();
Object temptop= top.object;
size--;
top=top.next;
return temptop;

}
public void push(Object obj)
{
top=new Node(obj, top);
++size;

}
public int size()
{
    return size;
}
  


    


public void linearSearching(LinkedStack s,Object o){

    boolean status=false;
    for(Node p=top ;p!=null;p=p.next)
    {
    if(p.object==o){
        status=true;
    }
    }
    System.out.println(status);

}




public void toarraystack(Object object,int size)
    {
       
    Object newarr[]=new Object [size];
    for(int i=0;i<size;i++)
    {
        
newarr[i]=((LinkedStack) object).pop();
//System.out.println(newarr[i]);

    }
    System.out.println("The new Array becomes");
    for(int i=(newarr.length-1);i>=0;i--)
    { 
       
System.out.println(newarr[i]);


    }
    
    

       
    }
  public   void display (LinkedStack lq){
      while(size!=0)
      System.out.println(lq.pop());
  }
    

public static void main(String[] args) {
    
    LinkedStack l= new LinkedStack();
    

    //System.out.println(l.toString());

    l.push("helo");
    l.push("helo0");
    l.push("helo00");
  l.linearSearching(l, "hello");
   // stack ss=l.sirarraystack();
   //while(ss.size()!=0)
  // {
  //  ss.pop();
  // }

   // System.out.println(l.pop());
   // System.out.println(l.peak());
   //System.out.println(l.toString());
 // l.toarraystack(l, l.size);


}
}
