public class PriorityQueue 
{
    public class Node
    {
        private int info;
        private Node next;
        private Node prev;
        
        public Node()
        {
            info=0;
            next=null;
            prev=null;
        }
        
        public void setInfo(int i)
        {
            info=i;
        }
        
        public void setNext(Node p)
        {
            next=p;
        }
        
        public void setPrev(Node p)
        {
            prev=p;
        }
        
        public int getInfo()
        {
            return info;
        }
        
        public Node getNext()
        {
            return next;
        }
        
        public Node getPrev()
        {
            return prev;
        }
    }
    //establishes base Node information
    
    Node first;
    Node last;
    
    public PriorityQueue()
    {
        first=new Node();
        last=new Node();
        
        first.setNext(last);
        last.setPrev(first);
        //sets up header Nodes for start and end
        //puts them next to each other in rightful positions
    }
    
    public boolean isEmpty()
    {
        return first.getNext()==last;
        //if the first node references the last node, it must be empty
    }
    
    public void add(int x)
    {
        Node temp=new Node();
        temp.setInfo(x);
        //creates new node with set info
        
        if(isEmpty())
        {
            temp.setNext(last);
            temp.setPrev(first);
            first.setNext(temp);
            last.setPrev(temp);     
            //puts temp node in between first and last, as it's the only element 
        }
       
        else
        {            
            temp.setNext(last);
            temp.setPrev(last.getPrev());
            last.getPrev().setNext(temp);
            last.setPrev(temp);
            //under the case the queue isn't empty, puts the temp node after the previous node but before the last node
        }
    }
    
    public int max()
    {
        Node next = first.getNext();
        
        int max = -1;
        //initializes it as -1, as in the case the queue is empty, it returns -1
        if(isEmpty())
        {
            System.out.println("Empty - no value to be found!");
            //lets user know the queue is empty
        }
        
        else
        {            
            max = next.getInfo();
            //initializes max to first element's value, or else -1 would be less than all positive numbers
            while(next!=last)
            {
                if(next.getInfo()<max)
                {
                    max=next.getInfo();
                }
                next=next.getNext();
                //tranverses through whole queue and returns max with the least value
            }            
        }
        return max;
    }
    
    public void removeMax()
    {
        Node remove = first.getNext();
        
        int max = max();
        //receives max from the max method
        
        while(remove.getInfo()!=max)
        {
            remove=remove.getNext();
        }
        //tranverses whole queue until it finds node with correct value
        
        Node prev=remove.getPrev();
        Node next=remove.getNext();
        //sets up previous node with what the removed node's previous value was
        //sets up next node with what the remove node's next value was
        
        prev.setNext(next);        
        next.setPrev(prev);
        //makes the previous value of removed node directly connect to the removed node's next value
        //and vice versa

      
    }
    
    
}
