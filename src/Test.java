import java.util.LinkedList;
import java.util.Scanner;
//id =index+1
//index=id-1
public class Test{

		  public static void main(String[] args) {
			
			  Patient d=new Patient("Damla", "Koksal",51, 1.61);
			  d.setBirthday("10/10/1996");
			  d.setBmi();
			  d.setUsername();
			  d.setPhoneNo("0(212)222-2222");
			  d.setDateAppointment("10/04/2018");
			  d.setTimeAppointment("10:30");
			  d.setdList("Mukemmel,gerek yok.");
			  d.setBmi(); //!! dikkat height weight set edildikten sonra yap
			  
			  System.out.println(d.toString());
			  System.out.println(); 
			  
			  Scanner s = new Scanner(System.in);
			  int x;
			  BinarySearchTree b = new BinarySearchTree();
			  b.insert(d.getpId());
			  b.insert(2);
			  b.insert(3);
			  System.out.println("inorder traversal:");
			  b.inorder(b.getRoot());
			  System.out.println();
			  
			  System.out.println("number of nodes in the tree: " + b.getSize());
			  System.out.println("Enter a number to delete from the tree: ");
			  x = d.getpId();
			  if(b.delete(x)) //true gelirse
			  System.out.println(x + " is deleted from the tree.");
			  else
			  System.out.println(x + " is not in the tree");
			  b.inorder(b.getRoot());
			  
			  System.out.println();
			  LinkedList<Patient> ml = new LinkedList<Patient>();

			   ml.add(d);
			   ml.add(1, new Patient("Demet","Ozbay",45,1.55));
			   if(!b.search(d.getpId()))
				  ml.remove(d.getpId()-1);
			    for (Patient element : ml)
			      System.out.println(element + "\n");
			/*  System.out.println("Enter a number to delete from the tree: ");
			  x = s.nextInt();
			  if(b.delete(x))
			  System.out.println(x + " is deleted from the tree.");
			  else
			  System.out.println(x + " is not in the tree");
			  System.out.println("inorder traversal after delete:");
			  b.inorder(b.getRoot());
			  System.out.println("\nEnter a number to search in the tree: ");
			  x = s.nextInt();
			  if(b.search(x))
			  System.out.println(x + " is in the tree.");
			  else
			  System.out.println(x + " is not in the tree");
			*/  
			  
	}
}

	
	
		//once linked list
		//sonra tree
		//en son console seceneklerini yonlendirme
		
	/* 3.TEST System.out.println("Linked Listimiz:");
			
		
		
		
		
		char ch;
		do
		   {
		System.out.print("Welcome to the Patient Customize for Dietitian Program!" +
						   "\nOur console application is working with numbers so you have to select which way you want to go by numbers."+
						   "\n *Select (1) to get patient's information."+
						   "\n *Select (2) to see appoinments."+
						   "\n *Select (3) to create new patient."+
						   "\nYour selection: ");
		
		Scanner sc=new Scanner(System.in);
		int choice = sc.nextInt();            
        switch (choice)
        {
       
        case 1 : 
            System.out.println("1 i secti");
            
            break;
        
        case 2 : 
            System.out.println("2 yi secti");
            
            break;                         
        
        case 3 : 
            System.out.println("3 u secti");
        
            break;                                          
        
        default : 
            System.out.println("Please select an option from the list belove. \n ");
            System.out.println("\nDo you want to continue (Type y or n) \n");
            break;
        }    
        ch = sc.next().charAt(0);
    } while (ch == 'Y'|| ch == 'y');   
	}
	
} 3.TEST SONU*/
		
 	

	

	/* ILK TEST  
	  public static void main(String[]args) {
	 
		//Test Starting here.	
			//1st patient

				Patient d=new Patient();
				
				d.setBirthday("10/10/1990");
				d.setBmi();
				d.setUsername();
				d.setPhoneNo("0(212)222-2222");
				d.setDateAppointment("");
				d.setTimeAppointment("");
				d.setdList("");
				d.setWeight(50);
				d.setHeight(1.61);
				d.setBmi(); //!! dikkat height weight set edildikten sonra yap
				System.out.println(d.toString());

			System.out.println();

				Patient o=new Patient("Yaprak", "Koksal", 54, 1.62);
				//2nd patient
				
				o.setBirthday("10/10/2001");
				o.setBmi();
				o.setUsername();
				System.out.println(o.toString()); 
				System.out.println();
	
	}
	  }ILK TEST SONU	*/

