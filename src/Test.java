import java.util.LinkedList;
import java.util.Scanner;
//id =index+1
//index=id-1
public class Test{

		  public static void main(String[] args) {
			  //Example patients
			  LinkedList<Patient> ml = new LinkedList<Patient>();
			  BinarySearchTree bst = new BinarySearchTree();
			  
			  Patient a=new Patient("Damla", "Koksal",51, 1.61);
			  a.setBirthday("10/10/1996");
			  a.setPhoneNo("0(212)222-2222");
			  a.setDateAppointment("10/04/2018");
			  a.setTimeAppointment("10:30");
			  a.setdList("Mukemmel,gerek yok.");
			  ml.add(a); //added to index #0 of linked list.
			  bst.insert(a.getpId()); //added the id to binary search tree.
			  
			  Patient b=new Patient("Demet", "Ozbay", 45, 1.55);
			  b.setBirthday("02/05/1992");
			  b.setPhoneNo("0532222-2222");
			  ml.add(b.getpId()-1,b); //setted b to index #1 of linked list.
			  bst.insert(b.getpId()); //added the id to binary search tree.
			  
			  Patient c=new Patient("Yaprak", "Koksal", 58, 1.61);
			  ml.add(c.getpId()-1,c);
			  bst.insert(c.getpId());
			  
			  Patient d=new Patient("Yagmur", "Koksal", 55, 1.65);
			  d.setBirthday("08/09/1992");
			  d.setPhoneNo("0(212)211-1111");
			  d.setDateAppointment("15/04/2018");
			  d.setTimeAppointment("11:30");
			  d.setdList("sabah---ogle---aksam");
			  ml.add(d.getpId()-1,d);
			  bst.insert(d.getpId());
			  
			 for (Patient element : ml)
			      System.out.println(element + "\n");
			  
			  System.out.println("inorder print binary:");
			  bst.inorder(bst.getRoot());
		
			  //console app starts here.
			  Scanner sc=new Scanner(System.in);
			  int choice=0;
			  String username="";

			  System.out.print("Welcome to the Patient Customize for Dietitian Program!" +
					   "\nOur console application is working with numbers so you have to select which way you want to go by numbers."+
					   "\n *Select (1) to get patient's information."+
					   "\n *Select (2) to see appoinments."+
					   "\n *Select (3) to create new patient."+
					   "\nYour selection: ");
			  try {
			  choice=sc.nextInt();
			  } catch(Exception e){
				  System.out.println("Your selection is not valid.");
			  }
			  //First choice: Patient's information.
			  if(choice==1) {
				  System.out.println("Please enter the username of patient: ");
		          
				  try {  
				  username=sc.next();
		          }catch(Exception e) {
		        	  System.out.println("Please enter a valid username.");
		          }
		            for(int i=0; i<bst.getRoot().getElement(); i++) { //root en buyuk idli olan yani son eklenen eleman oluyor. Eleman silerken id yerini
		            													//doldurmamiz gerekiyor. 
		            		if(!ml.get(i).getUsername().equals(username)){ //donguyu onlari kullanarak karsilastir.
		            			username="Not valid.";
		            		}
		            	}
		          System.out.println("username: " +username);
			   }
			  
			  
			  //linked list 0 1 2 3 4 5
			  //binary tree 1 2 3 4 5 6 idler
			  //roota(en buyuk id) kadar kontrol et bosluk varsa doldur yoksa sona ekle! Ona gore linkede ekle
			  
			  //Second choice: See appointments
			  else if(choice==2) {
				  System.out.println("Selected 2");	  
			  }
			  //Third choice: Create new patient
			  else if(choice==3) {
				  //ml.add(1, new Patient("Demet","Ozbay",45,1.55)); bu sekilde eklersek patient ismi sorunu kalmaz
				  System.out.println("Selected 3");	  
			  }
			  
			  
			  
			  
			  
			/*  char ch;
				do
				   {
				System.out.print("Welcome to the Patient Customize for Dietitian Program!" +
								   "\nOur console application is working with numbers so you have to select which way you want to go by numbers."+
								   "\n *Select (1) to get patient's information."+
								   "\n *Select (2) to see appoinments."+
								   "\n *Select (3) to create new patient."+
								   "\nYour selection: ");
				String username;
				Scanner sc=new Scanner(System.in);
				int choice = sc.nextInt();            
		        switch (choice)
		        {
		       
		        case 1 : 
		            System.out.println("Please enter the username of patient: ");
		            username=sc.nextLine();
		            
		            for(int i=0; i<bst.getRoot().getElement(); i++) { //root ve id iliskisini coz.
		            		if(!ml.get(i).getUsername().equals(username)){ //donguyu onlari kullanarak karsilastir.
		            			username="Not valid.";
		            		}
		            		}
		            
		   
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
			
		*/
			  
			  
			  
			  
			/*
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
			 

			   ml.add(d);
			   ml.add(1, new Patient("Demet","Ozbay",45,1.55));
			   if(!b.search(d.getpId()))
				  ml.remove(d.getpId()-1);
			    for (Patient element : ml)
			      System.out.println(element + "\n");	  */
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

