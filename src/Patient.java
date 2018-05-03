import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Patient{
/* Sonradan eklenebilecekler:
 *weight,height icin kontrol.
*/
	private static AtomicInteger uniqueId=new AtomicInteger(); //for the delete of users, we can maybe use decrease property of AtomicInteger.
	private String pName="";
	private String pSurname="";
	private int pId;  //id will increase.
	private String username;
	private double weight;
	private double height;
	private double bmi;
	private Date birthdate=new Date();
	private int age;
	private String phoneNo;
	private Date date=new Date();
	private Date time=new Date();
	private String dList;
	private String birthday;
	private String dateAppointment;
	private String timeAppointment;
	
	public String getpName() { //Name and surname must be set before username.
		return pName;
	}
	public void setpName(String pName) {
		Scanner sc=new Scanner(System.in);
		String pattern = "(?<=\\\\s|^)[a-zA-Z]*(?=[.,;:]?\\\\s|$)" ; //Regex for only alphabetical characters.
		
		this.pName=pName;
		if(this.pName=="" || !this.pName.matches(pattern) || this.pName==" ") {
			while(this.pName=="" || !this.pName.matches(pattern) || this.pName==" ") {
				System.out.println("Please enter a valid name: ");
				this.pName=sc.nextLine();
			}
		}
		else
			this.pName=pName;
	}
	//pName get set done
	public String getpSurname() {
		return pSurname;
	}
	public void setpSurname(String pSurname) {
		Scanner sc=new Scanner(System.in);
		String pattern = "(?<=\\\\s|^)[a-zA-Z]*(?=[.,;:]?\\\\s|$)" ; //Regex for only alphabetical characters.
		
		this.pSurname=pSurname;
		if(this.pSurname=="" || !this.pSurname.matches(pattern) || this.pSurname==" ") {
			while(this.pSurname=="" || !this.pSurname.matches(pattern) || this.pSurname==" ") {
				System.out.println("Please enter a valid surname: ");
				this.pSurname=sc.nextLine();
			}
		}
		else
			this.pSurname = pSurname;
	}
	//pSurname get set done
	public int getpId() { //Id must be added before username.
		return pId;
	}
	
	public void setpId(int pId) { //set will be use only in case of deleting patient or changing details.
		this.pId= pId;
	}

	//pId get set done
	public String getUsername() {
		return username;
	}
	public void setUsername() { //no parameter need.
		this.username=this.getpName() + this.getpSurname() + this.getpId();
		
	}
	//username get set done
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight=weight;
		if(this.weight== -1|| this.weight==0 || this.weight>800) {
			while(this.weight== -1) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Please enter a valid weight: ");
				this.weight=sc.nextDouble();
			}
		}
		else
			this.weight=weight;
	}
	//weight get set done
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height=height;
		if(this.height== -1) {
			while(this.height== -1 || this.height>(2.51) || this.height==0) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Please enter a valid height: ");
				this.height=sc.nextDouble();
			}
		}
		else
			this.height=height;
	}
	//height get set done	
	public double getBmi() {
		return bmi;
	}
	public void setBmi() { //no parameters need.
	
		this.bmi =this.weight / (this.height * this.height); //bmi is calculated automatically.
	}
	//bmi get set done
	
	public String getBirthday() { //We get parsed sdf in set method. Get it as formatted.
		
		return birthday;
	}
	
	public int birthYear=0; //to calculate age
	public void setBirthday(String date) { //date set ettirirken formati oncesinde belirt, ona gore setlensin.
		try {
			
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			this.birthdate=sdf.parse(date);
			
			String s= date;
			String year="";
			
			for(int i=6 ; i<10 ; i++) { //To control the year interval, we get year part of date.
			
				year += s.charAt(i);
			}
			//Example: year=1996 
			
			int yearInt=Integer.parseInt(year); //parsed it to integer to control the interval.
			this.birthYear = yearInt;
			this.birthday=sdf.format(birthdate); //Stringe atandi
			this.setAge();

			
		}catch (Exception e) {
			this.birthday="Birthdate is not valid.";
		}
		
	}
	//birthdate get set done
	
	public int getAge() {  //Age'den once birthdate'i set etmeye dikkat!
		return age;
	}
	public void setAge() { //Hata age kisminda verilecek.
		
		Date current=new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		
		String currentString = sdf.format(current); //2018
		int currentYear = Integer.parseInt(currentString);
		
		this.age = currentYear - birthYear;
		if(this.age>90 || this.age<1) {
			this.birthday="Birthdate is not valid.";
			this.age=-1;
		}
	}	

	//age get set done
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {

		String pattern = "^[0]\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$" ; //Regex for phone numbers WITHOUT ZERO.
		
		if(phoneNo=="" || phoneNo==" " || !phoneNo.matches(pattern))  //Turns until the true number entered.
			this.phoneNo="Phone number is not valid.";
		
		else
		this.phoneNo=phoneNo; //after the controls, phone number is setted.
		
		/* --Regex Notes--
		 * 	Start with zero.
		 *  May start with an option "("
		 *  Followed by 3 digits
		 *  May have an optional ")"
		 *  May have an optional "-" after the first 3 digits or after optional ) character
		 *  Followed by 3 digits.
		 *  May have another optional "-" after numeric digits
		 *  ends with four digits
		 *  Example : 0(212)222-2222
		 * */
	}
	//phoneNo get set done.
	
	
	//DietList ozellikleri
	public String getdList() {

		return this.dList;
	}

	public void setdList(String dList) {
		if(dList== null || dList=="" || dList==" ")
			this.dList="List is empty.";
		else
			this.dList = dList;
	}
	//dlist get set done
	
	//Appointment ozellikleri
	public String getDateAppointment()
	{
		return this.dateAppointment;
	}

	public void setDateAppointment(String date) {
		
		try {
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			this.date = sdf.parse(date); // date stringe cevirdik
			this.dateAppointment=sdf.format(this.date);
			
		} catch (Exception e) {
			this.dateAppointment="No appointment date found for this patient.";
		}
		
	}
	//Date get set done
	
	public void setTimeAppointment(String time) {
		
		try {
				SimpleDateFormat sdf= new SimpleDateFormat("HH:mm");
				this.time=sdf.parse(time);
				this.timeAppointment=sdf.format(this.time);
		} catch (Exception e) {
				this.timeAppointment="No appointment time found for this patient.";
		}
	}
	
	public String getTimeAppointment() {
		
		return timeAppointment;
		
	}
	//Time get set done.

	
	public Patient(String pName, String pSurname, double weight, double height) { //Maybe not going to use constructor because of console control.	
		pId=uniqueId.incrementAndGet();	// Or we can set everything here
		this.setpName(pName);
		this.setpSurname(pSurname);
		this.setWeight(weight);
		this.setHeight(height);
		this.setBirthday("");
		this.setUsername(); //kontrol ekle
		this.setBmi(); //kontrol ekle
		this.setDateAppointment("");
		this.setTimeAppointment("");
		this.setdList("");
		this.setAge();
		this.setPhoneNo("");
	}	
	public Patient() { //default constructor
		pId=uniqueId.incrementAndGet();
		this.setpName("");
		this.setpSurname("");
		this.weight=-1; 
		this.height=-1; 
		this.setBirthday("");
		this.setUsername();
		this.setDateAppointment("");
		this.setTimeAppointment("");
		this.setdList("");
		this.setAge();
		this.setPhoneNo("");
	}
	
	public String toString() {

		String control="Username: "+ this.username +
				"\nName: "+ this.pName +
				"\nSurname: "+ this.pSurname +
				"\nPhone No: "+ this.phoneNo +
				"\nBirthdate: " + this.getBirthday() +
				"\nAppointment Date: " + this.getDateAppointment() +
				"\nAppointment Time: " + this.getTimeAppointment() +
				"\nDiet List: " + this.dList +
				"\nId: " + this.pId;;
		
		if(this.age!=-1) 
			control+="\nAge: "+ this.age;
		
		if(this.weight!=-1) 
			control+="\nWeight: " + this.weight;
			
		if(this.height!=-1) 
			control+= "\nHeight: " + this.height;
		
		if(this.bmi!=-1 || this.bmi!= 0.0)
			control+= "\nBmi: "+ this.bmi;
		
		return control;
	}
	
}
//Yapilacaklar: name surname kontrollerini ayarla(temelde olan butun ozellikleri scannerla aldirtmaya calis)