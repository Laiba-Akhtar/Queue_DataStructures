

    class arrayqueue{
        private static int front, rear, capacity;//here front is the first element and rare is the index
        private static Object queue[];
     
        arrayqueue(){

        }
        arrayqueue(int c)
        {
            front = rear = 0;
            capacity = c;
            queue = new String[capacity];
        } // function to insert an element
        // at the rear of the queue
        static void queueInsert(Object object)
        {
            // check queue is full or not
            if (capacity == rear) {
                System.out.printf("\nQueue is full\n");
                return;
            }
     
            // insert element at the rear
            else {
                queue[rear] =object;
                rear++;
            }
            return; }
 
            // function to delete an element
            // from the front of the queue
            static void queueDeletion()
            {
                // if queue is empty
                if (front == rear) {
                    System.out.printf("\nQueue is empty\n");
                    return;
                }
         
                // shift all the elements from index 2 till rear
                // to the right by one
                else {
                    for (int i = 0; i < rear - 1; i++) {
                        queue[i] = queue[i + 1];
                    }
         
                    // store 0 at rear indicating there's no element  if (rear < capacity)
                queue[rear] = 0;
 
                // decrement rear
                rear--;
            }
            return;
        }
        static void queueDisplay()
    {
        int i;
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
 
        // traverse front to rear and print elements
        for (i = front; i < rear; i++) {
            System.out.println( queue[i]);
        }
        return;
    }
 
    // print front of queue
    static void queueFront()
    {
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element is: %d", queue[front]);
        return;
    }
    public Queue tolinkedqueue(arrayqueue aq){
Queue q=new Queue();

while(rear!=0){
 q.add(aq.queue[rear]);
}


        return q;
    }
public static void main(String[] args)
{
    arrayqueue q=new arrayqueue(9);
    queueInsert("helllo");
    queueInsert("hello1");

    q.queueDisplay();
Queue qq=q.tolinkedqueue(q);
qq.display(qq);



    }
    
    

    
}
