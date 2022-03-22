import java.util.ArrayList;

public class QueueOfDistinctStrings 
{
    // Overview: QueueOfDistinctStringsare mutable, bounded         
    // collection of distinct strings that operate in      
    // FIFO (First-In-First-Out) order.      
    //     
    // The abstraction function is:
    // a)Write the abstraction function here     
    //Abtract funtion = all the strings the stack such that the stack is not null        
    //and it follows the repOk method.      

    // The rep invariant is:
    //b)Write the rep invariant here
    //The last string in the stack is not null and the stack has to contain elements
    
    //The rep     
    private ArrayList<String> items;
    
        //Constructor     
        public QueueOfDistinctStrings() 
        {         
            // EFFECTS: Creates a new QueueOfDistinctStringsobject         
            items = new ArrayList<String>();     
        }     
        
        // MODIFIES: this     
        // EFFECTS: Appends the element at the end of the queue      
        //          if the element is not in the queue, otherwise     
        //          does nothing.     
        public void enqueue(String element) throws Exception 
        {         
            if(element == null) throw new Exception();
                if(false == items.contains(element))              
                    items.add(element);     
        }     
        
        public String dequeue() throws Exception 
        {         
            // MODIFIES: this         
            // EFFECTS: Removes an element from the front of the queue          
            if (items.size() == 0) throw new Exception();         
                return items.remove(0);     
        }     
        
        public boolean repOK() 
        {         
            // EFFECTS: Returns true if the rep invariant holds for this            
            //          object; otherwise returns false    
            for(String elements : items)
            {
                for(int i = 0; i < items.size(); i++)
                {
                    if(items.contains(elements))
                        return true;
                }
            }
            return false;
        }
        
        @Override
        public String toString() 
        {         
            // EFFECTS: Returns a string that contains the strings in the          
            //          queue, the front element and the end element.          
            //          Implements the abstraction function.
            String Tester = "The Stack Contains " + items.size() + " Elements.\n";
                for(int i = 0; i < items.size(); i++)
                {
                    Tester += " " + items.get(i) + "\n";
                }
                return Tester;
        }
        
        //Main method to test all methods built within the class QueueOfDistinctStrings.
        //Try methods to return if the operations complile correctly
        public static void main(String [] args)
        {
            QueueOfDistinctStrings Queue = new QueueOfDistinctStrings();
            boolean gotEx = false;
            
            //Tests enqueue method
            try
            {
                Queue.enqueue("AB");
                Queue.enqueue("CD");
                Queue.enqueue("EF");
                Queue.enqueue("GH");  
                    System.out.println(Queue);
            }
            catch(Exception ex)
            {
                gotEx = false;
            }
            
            //Tests Dequeue and repOk methods
            try
            {
                Queue.dequeue();
                Queue.dequeue();
                    System.out.println(Queue);
                    System.out.println("Is the rep invarriant valid? " 
                            + Queue.repOK() + "\n");
            }
            
            catch(Exception ex)
            {
                gotEx = true;
            }
            
            //Tests toString method
            try
            {
                Queue.enqueue("HI");
                Queue.enqueue("JK");
                String toString = Queue.toString();
                    System.out.println(toString);
            }
            catch(Exception ex)
            {
                gotEx = false;
            }
        }
}