//6039168
public class Main 
{
    public static void main (String args[])
    {    
        PriorityQueue Q1= new PriorityQueue();
        System.out.println("Priority Queue created!");
        //Priority Queue created
        
        System.out.println("What's the max priority?");
        System.out.println(Q1.max());
        //ensures that returned value warns user that they didn't enter any value yet
        
        System.out.println("Is it empty?");
        System.out.println(Q1.isEmpty());
        
        System.out.println("Value 2 inputted!");
        Q1.add(2);
        
        System.out.println("Is it empty?");
        System.out.println(Q1.isEmpty());
        
        System.out.println("What has the max priority? (Should be 1)");
        System.out.println(Q1.max());
        
        System.out.println("Values 3 and 1 inputted!");
        Q1.add(3);
        Q1.add(1);
        
        System.out.println("What has the max priority? (Should be 2)");
        System.out.println(Q1.max());
        
        System.out.println("Removed max priority!");
        Q1.removeMax();
        
        System.out.println("What has the max priority? (Should be 3)");
        System.out.println(Q1.max());

        System.out.println("Removed max priority!");
        Q1.removeMax();
        
        System.out.println("What has the max priority?");
        System.out.println(Q1.max());
        
        System.out.println("Removed max priority!");
        Q1.removeMax();
        
        System.out.println("What has the max priority?");
        System.out.println(Q1.max());
        
        System.out.println("Is it empty?");
        System.out.println(Q1.isEmpty());

    }
}
