import java.util.Scanner;

public class Test{
// for dongusuyle giris yaptiririz. treeye eklemek icin id kullanacagimizi ele alirsak kullanicilara atanan en 
//son id numarasini kayit ettirerek ordan eklemeye devam etmesini saglayabiliriz.
	

	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
	    /* Creating object of linkedList */
	    DoublyLinkedList list = new DoublyLinkedList();    
	    System.out.println("Doubly Linked List Test\n");          
	    char ch;
	    /*  Perform list operations  */
	    do
	    {
	        System.out.println("\nDoubly Linked List Operations\n");
	        System.out.println("1. insert at begining");
	        System.out.println("2. insert at end");
	        System.out.println("3. insert at position");
	        System.out.println("4. delete at position");
	        System.out.println("5. check empty");
	        System.out.println("6. get size");

	        int choice = scan.nextInt();            
	        switch (choice)
	        {
	        case 1 : 
	            System.out.println("Bilgileri gir.");
	            String a="damla";
	            String b="koksal";
	            double weight=51;
	            double height=1.61;
	            String birthdate= "10/10/1996";
	            String phoneNo="05348871814";
	            String date="01/04/2018";
	            String time="10:00";
	            String dList="Mukemmel,gerek yok";
	            list.insertAtStart(a,b,weight,height,birthdate,phoneNo,date,time,dList);                     
	            break;                          
	        case 2 : 
	            System.out.println("Enter integer element to insert");
	           // list.insertAtEnd(a,b,weight,height,birthdate,phoneNo,date,time,dList,null,null);                     
	            break;                         
	        case 3 :  
	       /*     System.out.println("Enter integer element to insert");
	            int num = scan.nextInt() ;
	            System.out.println("Enter position");
	            int pos = scan.nextInt() ;
	            if (pos < 1 || pos > list.getSize() )
	                System.out.println("Invalid position\n");
	            else
	                list.insertAtPos(num, pos);*/
	            break;                                          
	        case 4 : 
	            System.out.println("Enter position");
	            int p = scan.nextInt() ;
	            if (p < 1 || p > list.getSize() )
	                System.out.println("Invalid position\n");
	            else
	                list.deleteAtPos(p);
	            break;     
	        case 5 : 
	            System.out.println("Empty status = "+ list.isEmpty());
	            break;            
	        case 6 : 
	            System.out.println("Size = "+ list.getSize() +" \n");
	            break;                         
	        default : 
	            System.out.println("Wrong Entry \n ");
	            break;   
	        }    
	        /*  Display List  */ 
	        list.display();
	        System.out.println("\nDo you want to continue (Type y or n) \n");
	        ch = scan.next().charAt(0);    

	    } while (ch == 'Y'|| ch == 'y');   
		

		
		
		
		
		
	}
}
		//once linked list
		//sonra tree
		//en son console seceneklerini yonlendirme
		
/*	System.out.println("Linked Listimiz:");
			
		
		
		
		
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
	
}
		
*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	//Test Starting here.	
	//1st patient
		
	/*burayi sil	Patient d=new Patient("damla","koksal",51,1.61);
		
		d.setBirthdate("10/10/1996"); 
		d.setBmi();
		d.setUsername();
		d.setPhoneNo("0(212)222-2222");
		System.out.println(d.toString());
		
		System.out.println();
		Patient o=new Patient("Yaprak", "Koksal", 54, 1.62);
		//2nd patient
		
		o.setBirthdate("10/10/2001");
		o.setBmi();
		o.setUsername();
		System.out.println("Username: "+ o.getUsername() +
				   "\nName: "+ o.getpName() +
				   "\nSurname: "+ o.getpSurname() +
				   "\nBirthdate: " + o.getBirthdate() +
				   "\nAge: " + o.getAge() +
				   "\nWeight: " + o.getWeight() +
				   "\nHeight: " + o.getHeight() +
				   "\nBmi: " + o.getBmi() +
				   "\nId: " + o.getpId()); 
		
		System.out.println();
		
		//3nd patient
		Patient k = new Patient("Demet","Ozbay",45,1.55);
		k.setBirthdate("25/03/1992");
		k.setBmi();
		k.setUsername();
		System.out.println("Username: "+ k.getUsername()+ "\nName: "+ k.getpName() +
				   "\nSurname: "+ k.getpSurname() +
				   "\nBirthdate: " + k.getBirthdate() +
				   "\nAge: " + k.getAge() +
				   "\nWeight: " + k.getWeight() +
				   "\nHeight: " + k.getHeight() +
				   "\nBmi: " + k.getBmi() +
				   "\nId: " + k.getpId()); 
		System.out.println();

	  public static void main(String[]args) {
	 
		



	} 

		System.out.println("------------------------- ");
		DietList a=new DietList();
		a.setdList("");
		d.setDietList(a);
		System.out.println(d.getDietList());
		
		
		System.out.println("------------------------- ");
		DietList c = new DietList();
		c.setdList("");
		k.setDietList(c);
		System.out.println(k.getDietList());


		//Diet object test ended here.

		System.out.println("--------------------------");

		Appointment b=new Appointment();
		b.setDate("30/04/2018");
		b.setTime("22:50");
		k.setAppointment(b);
		System.out.println(k.getAppointment());
		
	}}	   burayi sil*/
		//Appointment test ended here.
		
		
		//regex test
		/*Scanner sc= new Scanner(System.in);
		System.out.println("isim Gir");
		String name=sc.nextLine();
		String pattern = "(?<=\\s|^)[a-zA-Z]*(?=[.,;:]?\\s|$)"; //Regex for phone numbers WITHOUT ZERO.
		if(name=="" || name==" " || !name.matches(pattern))
			System.out.println("problem var");
			
		else
			System.out.println("problem yok");
		*/	
