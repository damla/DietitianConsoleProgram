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
			  a.setdList("Sabah Kahvaltı;\n" + 
			  		"\n" + 
			  		"1 dilim kepek ekmeği\n" + 
			  		"1 dilim beyaz peynir\n" + 
			  		"Bol domates\n" + 
			  		"Salatalık\n" + 
			  		"Ara Öğün;\n" + 
			  		"\n" + 
			  		"1 adet meyve\n" + 
			  		"Öğlen Yemeği;\n" + 
			  		"\n" + 
			  		"100gr. Yağsız etli salata\n" + 
			  		"1 kase light yoğurt\n" + 
			  		"1 kase çorba\n" + 
			  		"Ara Öğün;\n" + 
			  		"\n" + 
			  		"1 adet meyve\n" + 
			  		"2 ceviz, 6 fındık veya badem\n" + 
			  		"Akşam Yemeği;\n" + 
			  		"\n" + 
			  		"7 yemek kaşığı etsiz sebze yemeği\n" + 
			  		"1 ince dilim kepek ekmeği\n" + 
			  		"Salata\n" + 
			  		"1 kase light yoğurt");
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
			  d.setdList("Sabah\n" + 
			  		"\n" + 
			  		"Mısır gevreği\n" + 
			  		"1 kase yağsız yoğurt\n" + 
			  		"Taze meyve veya taze sıkılmış portakal suyu\n" + 
			  		"Kafeinsiz kahve veya şekersiz çay\n" + 
			  		"\n" + 
			  		"Öğle\n" + 
			  		"\n" + 
			  		"Fırında kızartılmış patates\n" + 
			  		"Brokoli, marul, karnabahar ve nohuttan oluşan bir salata (üzerine limon olabilir)\n" + 
			  		"Taze meyve veya meyve suyu\n" + 
			  		"\n" + 
			  		"Akşam\n" + 
			  		"\n" + 
			  		"Haşlanmış makarna üzerine de yeşil dolma biber\n" + 
			  		"Haşlanmış fasulye\n" + 
			  		"Karışık yeşil salata (üzerine sarımsaklı, limonlu bir sos hazırlayabilirsiniz.)\n" + 
			  		"1 adet şeftali\n" + 
			  		"\n" + 
			  		"Ara öğünlerde ihtiyaç duyarsanız herhangi bir mevsim meyvesi tüketebilirsiniz.");
			  ml.add(d.getpId()-1,d);
			  bst.insert(d.getpId());
			  
			  
			  //console app starts here.
			  Scanner sc = new Scanner(System.in);
			  BinarySearchTree save=new BinarySearchTree();//to save deleted ids.
			  
			  char ch='a';
			  do{
				  int unvalid=0;
				  int choice=0;
				  int choice2=0;
				  int choice3=0;
				  int choice4=0;
				  String username="";
				  int flag=0;
				  int flag2=0;
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
				  int nId=0;
				  int max=0;
				  int min=0;
				  int flag3=0;
				  int unvalid2=0;
				  
			  System.out.print("Welcome to the Patient Customize for Dietitian Program!" +
					   "\nOur console application is working with numbers so you have to select which way you want to go by numbers. "+
					   "\n *Select (1) to get patient's general information."+
					   "\n *Select (2) to see appoinments."+
					   "\n *Select (3) to create new patient or delete."+
					   "\nYour selection: ");
			  try {
			  choice=sc.nextInt();
			  } catch(Exception e){
				  System.out.println("-----------------------------------------------");
				  System.out.println("Your selection is not valid. Do you want to restart?(Press 'Y' or 'N')");
			  }
			
			  //First choice: Patient's information.
			  if(choice==1) {
				  System.out.println("-----------------------------------------------");
				  System.out.print("Please enter the username of patient: ");   
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
	            				System.out.println("-----------------------------------------------"); 
	            				System.out.print("Please enter the new date of appointment: ");
	            				nAppDate=sc.next();

	            				//butun listeyi dolandir, eger appointment date+time'in aynisi yoksa eklet, seceneklerle al en son duruma gore set et
	            				//System.out.println(nAppDate+ " " +ml.get(0).getTimeAppointment());
	            				
	            				for(int j=0; j<bst.findMax(bst.getRoot());j++) {
	            					if( (ml.get(j).getDateAppointment() + ml.get(j).getTimeAppointment() ).equals(nAppDate + ml.get(backupID-1).getTimeAppointment() ) ) {
	            						flag2++;
	            						unvalid=j;
	            						System.out.println(ml.get(j).getDateAppointment() + ml.get(j).getTimeAppointment());
	            					}

	            				}
	            						System.out.println(flag2);

	            						if(flag2>0) {
	            						
	            							System.out.println(nAppDate+" "+ml.get(unvalid).getTimeAppointment() + " unavailable, please choose anohter date:");
	            							nAppDate=sc.next();
	            							ml.get(backupID-1).setDateAppointment(nAppDate);
	            							System.out.println("\nNew date of appointment: " + ml.get(backupID-1).getDateAppointment());
	            						}
	            						else {
	            						//dogrusunu yazinca donguden cikicak
	            						ml.get(backupID-1).setDateAppointment(nAppDate);
	            						System.out.println("\nNew date of appointment: " + ml.get(backupID-1).getDateAppointment());
	            						}
	            				
	            			}
	            			else if(choice3==2) {
	            				System.out.println("-----------------------------------------------"); 
	            				System.out.print("Please enter the new time of appointment: ");
	            				nAppTime=sc.next();
	            				
	            				for(int j=0; j<bst.findMax(bst.getRoot()); j++) {
	            					
	            					if( (ml.get(j).getDateAppointment() + ml.get(j).getTimeAppointment()).equals( ml.get(backupID-1).getDateAppointment()+nAppTime )) {
	            						flag3++;
	            					}
	            				}
	            				System.out.println(flag3);
	            				if(flag3>0) {
	            					System.out.println(ml.get(unvalid2).getDateAppointment()+ " "+ nAppTime + " unavailable, please choose another time: " );
	            					nAppTime=sc.next();
	            					ml.get(backupID-1).setTimeAppointment(nAppTime);
        							System.out.println("\nNew time of appointment: " + ml.get(backupID-1).getTimeAppointment());
	            				}
	            				else {
	            					ml.get(backupID-1).setTimeAppointment(nAppTime);
            						System.out.println("\nNew time of appointment: " + ml.get(backupID-1).getTimeAppointment());
	            				}
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
            				System.out.print("Please enter the new diet list of patient: ");
            				nDlist=sc.next();
            				
            				if(nDlist.equals(" ") || nDlist.equals("") || nDlist.equals("-")) {
            					nDlist="No diet list found for this patient.";	
            					ml.get(backupID-1).setdList(nDlist);
            				}
            				else
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
			
							else {

								System.out.println();
				  				System.out.println("-----------------------------------------------------------------------------------");
								System.out.println("There are no patients with appointments. Do you want to restart? (Press 'Y' or 'N')"); 
								System.out.println("-----------------------------------------------------------------------------------");
							}
								
			  }
			  //Third choice: Create or Delete new patient
			  else if(choice==3) {
				 
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
				  
				  if(choice2 == 1) { //Burdan once silmeye bakin
					  //patient add

					  System.out.println("-----------------------------------------------");
					  
					  System.out.print("Please write the name of new patient: ");
					  nName=sc.next();
					  
					  System.out.print("\nPlease write the surname of new patient: ");
					  nSurname=sc.next();
					  
					  System.out.print("\nPlease write the weight of new patient: ");
					  nWeight=sc.nextDouble();
					  
					  System.out.print("\nPlease write the height of new patient: ");
					  nHeight=sc.nextDouble();
					  
					  System.out.print("\nPlease write the birthdate of new patient: ");
					  nBirthdate=sc.next();
					  
					  System.out.print("\nPlease write the phone number of new patient: ");
					  nPhoneNo=sc.next();
					  
					  
					  System.out.print("\nPlease write the appointment date of new patient: ");
					  nAppDate=sc.next();
					  
					  System.out.print("\nPlease write the appointment time of new patient: ");
					  nAppTime=sc.next();
					 
					  
					  if(save.getSize()>0) { //if there are any deleted elements, we can see it from save tree.

						  for(int i=1; i<= bst.findMax(bst.getRoot()); i++) {
							 
							 if( save.search(i) ) { //looking for the id deleted first
								 ml.add(i-1,new Patient(nName, nSurname, nWeight, nHeight));
								 ml.get(i-1).setPhoneNo(nPhoneNo);
								 ml.get(i-1).setBirthday(nBirthdate);
								 ml.get(i-1).setdList(nDlist);
								 ml.get(i-1).setDateAppointment(nAppDate);
								 ml.get(i-1).setTimeAppointment(nAppTime);
								 ml.get(i-1).setpId(i);
								 ml.get(i-1).setUsername();
								 //new patient created to the first place.
								 bst.insert(i);
								 save.delete(i);
								
								 break;
							 }
							 
						  	}
						  
						  }
						  else {
							  	 ml.addLast(new Patient(nName, nSurname, nWeight, nHeight));
								 ml.getLast().setPhoneNo(nPhoneNo);
								 ml.getLast().setBirthday(nBirthdate);
								 ml.getLast().setdList(nDlist);
								 ml.getLast().setDateAppointment(nAppDate);
								 ml.getLast().setTimeAppointment(nAppTime);
								 bst.insert(ml.getLast().getpId());
								 
						  }
					  System.out.println("-----------------------------------------------");
					  System.out.println("               NEW PATIENT LIST");
					  System.out.println("-----------------------------------------------");
					  for (Patient element : ml)
						  System.out.println(element + "\n");
				  }
				  
				  else if(choice2 == 2) {
					 
					  //patient delete
					  System.out.println("-----------------------------------------------");
					  System.out.println("Please write the ID of patient you want to delete: ");
					  try {
						  nId=sc.nextInt();
						  } catch(Exception e){
							  System.out.println("-----------------------------------------------");
							  System.out.println("The ID you entered is not valid. Do you want to restart?(Press 'Y' or 'N')");
						  }

					  max=bst.findMax(bst.getRoot()); 
					  min=bst.findMin(bst.getRoot()); 
					  
					  if(max<nId || nId<min) {
						  System.out.println("Your selection is not valid. Do you want to restart?(Press 'Y' or 'N')");
					  }
					  else if(!bst.search(nId))//Listede yoksa veya liste bos ise
						  System.out.println("Your selection is not valid. Do you want to restart?(Press 'Y' or 'N')");
					  else {
						  save.insert(nId); //Added deleted ID
						  bst.delete(nId);
						  for(int i=0; i<ml.size(); i++) {
							 if(ml.get(i).getpId()==nId)
								 ml.remove(i);
						  }
						  if(bst.getSize()>0) {
							  System.out.println("New tree:");
							  bst.inorder(bst.getRoot());
					  	  
							  System.out.println("Deleted ids: ");
							  save.inorder(save.getRoot());
							  
							  for (Patient element : ml)
								  System.out.println(element + "\n");
						  }
						  else
							  System.out.println("There are no patients to show in the list.");
					  }
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
		       
