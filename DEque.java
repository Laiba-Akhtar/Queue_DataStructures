import java.util.ArrayDeque;
public class DEque {
    public static void main(String[] args) {
        ArrayDeque a=new ArrayDeque<>();
        System.out.println("Add Elements ");
        a.add(4);
        a.add(7);
        a.addFirst(7);
        a.addLast(19);
        System.out.println(a.toString());
        System.out.println("peek element first"+a.peekFirst());
        System.out.println("peek element last"+a.peekLast());


    }

    
}
