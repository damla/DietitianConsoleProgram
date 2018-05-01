
public class DoublyLinkedList extends Patient {
	//this code is taken from our teacher's codes to implement our project.
	//We did not started to work on doubly linked list yet.
	    protected Node start;
	    protected Node end ;
	    public int size;
	 
	    /* Constructor */
	    public DoublyLinkedList()
	    {
	        start = null;
	        end = null;
	        size = 0;
	    }
	    /* Function to check if list is empty */
	    public boolean isEmpty()
	    {
	        return start == null;
	    }
	    /* Function to get size of list */
	    public int getSize()
	    {
	        return size;
	    }
	    /* Function to insert element at begining */
	    public void insertAtStart(String name,String surname, double weight,double height, String birthdate, String phoneNo, String date, String time, String dList)
	    {
	        Node nptr = new Node(name,surname,weight,height,birthdate,phoneNo,date,time,dList,null,null); 
	        if(start == null) //liste bossa
	        {
	            start = nptr;
	            end = start;
	        }
	        else
	        {
	            start.setLinkPrev(nptr);
	            nptr.setLinkNext(start);
	            start = nptr;
	        }
	        size++;
	    }
	    /* Function to insert element at end */
	    public void insertAtEnd(String name,String surname, double weight,double height, String birthdate, String phoneNo, String date, String time, String dList)
	    {
	        Node nptr = new Node(name,surname,weight,height,birthdate,phoneNo,date,time,dList,null,null);        
	        if(start == null)
	        {
	            start = nptr;
	            end = start;
	        }
	        else
	        {
	            nptr.setLinkPrev(end);
	            end.setLinkNext(nptr);
	            end = nptr;
	        }
	        size++;
	    }
	    /* Function to insert element at position */
	    public void insertAtPos(String name,String surname, double weight,double height, String birthdate, String phoneNo, String date, String time, String dList, Node n, Node p , int pos)
	    {
	        Node nptr = new Node(name,surname,weight,height,birthdate,phoneNo,date,time,dList, null, null);    
	        if (pos == 1)
	        {
	            insertAtStart(name,surname,weight,height,birthdate,phoneNo,date,time,dList);
	            return;
	        }            
	        Node ptr = start;
	        for (int i = 2; i <= size; i++)
	        {
	            if (i == pos)
	            {
	                Node tmp = ptr.getLinkNext();
	                ptr.setLinkNext(nptr);
	                nptr.setLinkPrev(ptr);
	                nptr.setLinkNext(tmp);
	                tmp.setLinkPrev(nptr);
	            }
	            ptr = ptr.getLinkNext();            
	        }
	        size++;
	    }
	    /* Function to delete node at position */
	    public void deleteAtPos(int pos)
	    {        
	        if (pos == 1) 
	        {
	            if (size == 1)
	            {
	                start = null;
	                end = null;
	                size = 0;
	                return; 
	            }
	            start = start.getLinkNext();
	            start.setLinkPrev(null);
	            size--; 
	            return ;
	        }
	        if (pos == size)
	        {
	            end = end.getLinkPrev();
	            end.setLinkNext(null);
	            size-- ;
	        }
	        Node ptr = start.getLinkNext();
	        for (int i = 2; i <= size; i++)
	        {
	            if (i == pos)
	            {
	                Node p = ptr.getLinkPrev();
	                Node n = ptr.getLinkNext();
	 
	                p.setLinkNext(n);
	                n.setLinkPrev(p);
	                size-- ;
	                return;
	            }
	            ptr = ptr.getLinkNext();
	        }        
	    }   
	    
	    /* Function to display status of list */
	    public void display()
	    {
	        System.out.print("\nPatients = ");
	        
	        if (size == 0) 
	        {
	            System.out.print("No patient found.\n");
	            return;
	        }
	        
	        
	        if (start.getLinkNext() == null) 
	        {
	            System.out.println(start.toString());
	            return;
	        }
	        Node ptr = start;
	        System.out.print(start.toString() + " <-> ");
	        ptr = start.getLinkNext();
	        while (ptr.getLinkNext() != null)
	        {
	            System.out.print(start.toString() + " <-> ");
	            ptr = ptr.getLinkNext();
	        }
	        System.out.print(start.toString()+ "\n");
	    }
}
