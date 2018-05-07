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
			  
			  
			 /*for (Patient element : ml)
			      System.out.println(element + "\n");
			  
			  System.out.println("inorder print binary:");
			  bst.inorder(bst.getRoot());
			  Bulunan hastalari ve treeyi dokmek icin
			 */
			  
			  //console app starts here.
			  Scanner sc = new Scanner(System.in);
			 
			  char ch='a';
			  do{
				  
				  int choice=0;
				  int choice2=0;
				  int choice3=0;
				  int choice4=0;
				  String username="";
				  int flag=0;
				  int backupID=0;
				  String nName="";
				  String nSurname="";
				  String nPhoneNo="";
				  String nBirthdate="";
				  double nWeight=0;
				  double nHeight=0;
				  String nAppDate="";
				  String nAppTime="";
				  String nDlist="";
				  
			  System.out.print("Welcome to the Patient Customize for Dietitian Program!" +
					   "\nOur console application is working with numbers so you have to select which way you want to go by numbers."+
					   "\n *Select (1) to get patient's general information."+
					   "\n *Select (2) to see appoinments."+
					   "\n *Select (3) to create new patient or delete."+
					   "\nYour selection: ");
			  try {
			  choice=sc.nextInt();
			  } catch(Exception e){
				  System.out.println("-----------------------------------------------");
				  System.out.println("Your selection is not valid.");
			  }
			
			  //First choice: Patient's information.
			  if(choice==1) {
				  System.out.println("-----------------------------------------------");
				  System.out.println("Please enter the username of patient: ");   
				  try {  
				  username=sc.next();
		          }catch(Exception e) {
		        	  System.out.println("Please enter a valid username. Do you want to continue?");
		          }
		          for(int i=0; i<bst.findMax(bst.getRoot()); i++) { //root en buyuk idli olan yani son eklenen eleman oluyor. Eleman silerken id yerini
		            												  //doldurmamiz gerekiyor. 
		        	  	if(ml.get(i).getUsername().equals(username)){ //donguyu onlari kullanarak karsilastir.
		        	  		backupID=ml.get(i).getpId();
		        	  		flag++;
		        	  		}  		
		          }
		          if(flag==1) {
		        		//after valid username
		        	  	System.out.println("-----------------------------------------------");
		            	System.out.println("username: " + username);
		            	System.out.println("-----------------------------------------------");
		            	System.out.print("Please select which information you want to see:" +
		 					   "\n *Select (1) to get personel information of "+ml.get(backupID-1).getpName()+" "+ml.get(backupID-1).getpSurname()+
		 					   "\n *Select (2) to see appoinments of " + ml.get(backupID-1).getpName()+ " " +ml.get(backupID-1).getpSurname()+
		 					   "\n *Select (3) to see diet list of " + ml.get(backupID-1).getpName()+ " " +ml.get(backupID-1).getpSurname()+
		 					   "\nYour selection: ");
		            	try {
		            		choice2=sc.nextInt();
		            	}catch(Exception e) {
		            		System.out.println("-----------------------------------------------");
		  				System.out.println("Your selection is not valid.");
		            	}
		            	//sub menu selection for user
		            	if(choice2 == 1) {
		            		System.out.println("-----------------------------------------------");
		            		System.out.println(ml.get(backupID-1));
		            		System.out.println("-----------------------------------------------");
		            		System.out.println("*Select (1) to make changes on patient's personel information." +
		            						 "\n*Press 'Y' to go back to main menu." );
		            		
		            		try {
		            		choice3=sc.nextInt(); //sub choice
		            		}catch(Exception e) {}
		            		
		            		if(choice3 == 1) {
		            			System.out.println("-----------------------------------------------");
		            			System.out.println("Name: " + ml.get(backupID-1).getpName()+
		            							   "\nSurname: " + ml.get(backupID-1).getpSurname()+
		            							   "\nPhone No: " + ml.get(backupID-1).getPhoneNo()+
		            							   "\nBirthdate: " + ml.get(backupID-1).getBirthday()+
		            							   "\nWeight: " + ml.get(backupID-1).getWeight()+
		            							   "\nHeight: " + ml.get(backupID-1).getHeight());
		            			System.out.println("-----------------------------------------------");
		            			System.out.println("Please select the information you want to change:" +
		            							"\n*Select (1) to change name."+
		            							"\n*Select (2) to change surname."+
		            							"\n*Select (3) to change phone number."+
		            							"\n*Select (4) to change birthdate."+
		            							"\n*Select (5) to change weight." +
		            							"\n*Select (6) to change height.");
		            			try {
		            				choice4=sc.nextInt();
		            			}catch(Exception e) {
		            				System.out.println("-----------------------------------------------");
		            				System.out.println("Your choice is not valid. Press 'Y' to go back to main menu or 'N' to end the program.");
		            				}
		            			if(choice4==1) {
		            				System.out.println("-----------------------------------------------");
		            				System.out.print("Please enter the new name: ");
		            				nName=sc.next();
		            				
		            				ml.get(backupID-1).setpName(nName);
		            				System.out.println("\nNew name: " + ml.get(backupID-1).getpName());
		            				ml.get(backupID-1).setUsername();
		            				System.out.println("New username: " + ml.get(backupID-1).getUsername());

		            			}
		            			else if(choice4==2) {
		            				System.out.println("-----------------------------------------------");
		            				System.out.print("Please enter the new surname: ");
		            				nSurname=sc.next();
		            				
		            				ml.get(backupID-1).setpSurname(nSurname);
		            				System.out.println("\nNew surname: " + ml.get(backupID-1).getpSurname());
		            				
		            				ml.get(backupID-1).setUsername();
		            				System.out.println("New username: " + ml.get(backupID-1).getUsername());

		            			}
		            			else if(choice4==3) {
		            				System.out.println("-----------------------------------------------");
		            				System.out.print("Please enter the new phone number: ");
		            				nPhoneNo=sc.next();
		            				
		            				ml.get(backupID-1).setPhoneNo(nPhoneNo);
		            				System.out.println("\nNew phone no: " + ml.get(backupID-1).getPhoneNo());
		            			}
		            			else if(choice4==4) {
		            				System.out.println("-----------------------------------------------");
		            				System.out.print("Please enter the new birthdate: ");
		            				nBirthdate=sc.next();
		            				
		            				ml.get(backupID-1).setBirthday(nBirthdate);
		            				System.out.println("\nNew birthdate: " + ml.get(backupID-1).getBirthday());
		            				
		            				ml.get(backupID-1).setAge();
		            				if(!ml.get(backupID-1).getBirthday().equals("Birthdate is not valid."))
		            				System.out.println("\nNew age: " + ml.get(backupID-1).getAge());
		            				else
		            					ml.get(backupID-1).setAgeDetail(-1);
		            			}
		            			else if(choice4==5) {
		            				System.out.println("-----------------------------------------------");
		            				System.out.print("Please enter the new weight: ");
		            				try {
		            				nWeight=sc.nextDouble();
		            				}catch(Exception e) {
		            					System.out.println("Weight is not valid. Do you want to restart?(Press 'Y' or 'N')");
		            				}
		            				ml.get(backupID-1).setWeight(nWeight);
		            				System.out.println("\nNew weight: " + ml.get(backupID-1).getWeight());
		            				
		            				ml.get(backupID-1).setBmi();
		            				System.out.println("New bmi: " + ml.get(backupID-1).getBmi());

		            			}
		            			else if(choice4==6) {
		            				System.out.println("-----------------------------------------------");
		            				System.out.print("Please enter the new height: ");
		            				try {
		            				nHeight=sc.nextDouble();
		            				}catch(Exception e) {
		            					System.out.println("Height is not valid. Do you want to restart?(Press 'Y' or 'N')");
		            				}
		            				ml.get(backupID-1).setHeight(nHeight);
		            				System.out.println("\nNew height: " + ml.get(backupID-1).getHeight());
		            				
		            				ml.get(backupID-1).setBmi();
		            				System.out.println("New bmi: " + ml.get(backupID-1).getBmi());

		            			}
		            			else
		            				System.out.println("Your selection is not valid. Do you want to restart?(Press 'Y' or 'N')");
		            		}
		            	}
		            	//personal information of patient done
		            	
		            	else if(choice2 == 2) {
		            		System.out.println("-----------------------------------------------");
	            			System.out.println("Name: " + ml.get(backupID-1).getpName()+
     							   		   "\nSurname: " + ml.get(backupID-1).getpSurname()+
	            							   "\nAppointment Date: " + ml.get(backupID-1).getDateAppointment()+
	            							   "\nAppointment Time: " + ml.get(backupID-1).getTimeAppointment());	  
		            		System.out.println("-----------------------------------------------");
	            			System.out.println("Please select the information you want to change:" +
	            							"\n*Select (1) to change appointment date."+
	            							"\n*Select (2) to change appointment time.");
	            			
	            			try {
	            				choice3=sc.nextInt();
	            			}catch(Exception e) {
	            				System.out.println("-----------------------------------------------");
	            				System.out.println("Your choice is not valid. Press 'Y' to go back to main menu or 'N' to end the program.");
	            				}
	            			
	            			if(choice3==1) {
	            				System.out.println("-----------------------------------------------"); //BURAYA YAZILACAK TARIH DOLU MU DIYE KONTROL EKLENEBILIR?
	            				System.out.print("Please enter the new date of appointment: ");
	            				nAppDate=sc.next();
	            				
	            				ml.get(backupID-1).setDateAppointment(nAppDate);
	            				System.out.println("\nNew date of appointment: " + ml.get(backupID-1).getDateAppointment());
	            			}
	            			else if(choice3==2) {
	            				System.out.println("-----------------------------------------------"); //BURAYA YAZILACAK TARIH DOLU MU DIYE KONTROL EKLENEBILIR?
	            				System.out.print("Please enter the new time of appointment: ");
	            				nAppTime=sc.next();
	            				
	            				ml.get(backupID-1).setTimeAppointment(nAppTime);
	            				System.out.println("\nNew time of appointment: " + ml.get(backupID-1).getTimeAppointment());
	            			}
	            			else
	            				System.out.println("Your selection is not valid. Do you want to restart?(Press 'Y' or 'N')");
		            	}//appointment informations of patient done
		            	
		            	else if(choice2 == 3) {
		            		System.out.println("-----------------------------------------------");
	            			System.out.println("Name: " + ml.get(backupID-1).getpName()+
     							   		   "\nSurname: " + ml.get(backupID-1).getpSurname()+
     							   		   "\nWeight: " + ml.get(backupID-1).getWeight()+
         							       "\nHeight: " + ml.get(backupID-1).getHeight() +
         							       "\nBmi: " + ml.get(backupID-1).getBmi()+
           							       "\nDiet List: " + ml.get(backupID-1).getdList());
		            		System.out.println("-----------------------------------------------");
            				System.out.print("Please enter the new diet list of appointment: ");
            				nDlist=sc.next();
            				
            				ml.get(backupID-1).setdList(nDlist);
            				System.out.println("\nNew Diet List: " + ml.get(backupID-1).getdList());
		            	}//dietlist information of patient done
		            	
		            	else
		            	System.out.println("Your selection is not valid. Do you want to restart?(Press 'Y' or 'N')");
		            	
		            	System.out.println("Do you want to continue? (Press 'Y' or 'N')");
		          }
		          else { //after non valid username.
		        	  	username = "Username is not valid.";
		        		System.out.println("-----------------------------------------------");
		        	  	System.out.println("username: " + username + "Do you want to continue? (Press 'Y' or 'N')");
					
		          }
		          //username check done.
			   }

			  //linked list 0 1 2 3 4 5
			  //binary tree 1 2 3 4 5 6 idler
			  //roota(en buyuk id) kadar kontrol et bosluk varsa doldur yoksa sona ekle! Ona gore linkede ekle
			  
			  //Second choice: See appointments
			  else if(choice==2) {
				  
				  System.out.println("-----------------------------------------------");
				  
				  if(ml!=null)
					  for (int i = 0; i < ml.size(); i++) 
					  {
						  		System.out.println();
								System.out.println(ml.get(i).getpName() +"   "+  ml.get(i).getpSurname() + " -----> "
																			  + ml.get(i).getDateAppointment()
																			  + "   " 
																			  + ml.get(i).getTimeAppointment()+" ");
					  }
			
							else

								System.out.println();
				  				System.out.println("-----------------------------------------------------------------------------------");
								System.out.println("There are no patients with appointments. Do you want to restart? (Press 'Y' or 'N')"); 
								System.out.println("-----------------------------------------------------------------------------------");

								
			  }
			  //Third choice: Create or Delete new patient
			  else if(choice==3) {
				  //ml.add(1, new Patient("Demet","Ozbay",45,1.55)); bu sekilde eklersek patient ismi sorunu kalmaz
				  System.out.println("-----------------------------------------------");
				  System.out.print("*Select (1) to add new patient."+
						   			"\n*Select (2) to delete patient."+
						  			"\nYour selection: ");
				  try {
					  choice2=sc.nextInt();
					  } catch(Exception e){
						  System.out.println("-----------------------------------------------");
						  System.out.println("Your selection is not valid. Do you want to restart?(Press 'Y' or 'N')");
					  }
				  
				  if(choice2 == 1) {
					  //patient add
					  //degiskenler yarat bilgileri tek tek yerlestir ama en basinda id yi kaydetki yerine birini yerlestirebil.
					  //tree kontrol et eksik id varsa onu kaydet, sonra linked listte o idyi atayarak yeni objeyi olustur. Yoksa, direk en son node'a ekle.
					  
					  System.out.println("Patient ekleme secildi");
				  }
				  
				  else if(choice2 == 2) {
					  //patient delete
					  //sildigimiz konumu kaydedelim. bunu yapmak icin degiskeni dongu disinda tanimalayalim?
					  System.out.println("Patient silme secildi");
				  }
				  
				  else
					  System.out.println("Your selection is not valid. Do you want to restart?(Press 'Y' or 'N')");
			  }
			  else
				  System.out.println("Your selection is not valid. Do you want to restart?(Press 'Y' or 'N')");
			  
			  ch = sc.next().charAt(0); //En son y secilmesi icin
			  }while(ch=='y'||ch=='Y');
			}
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

