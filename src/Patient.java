import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Patient{
/* Sonradan eklenebilecekler:
 *weight,height icin kontrol.
*/
	private static AtomicInteger uniqueId=new AtomicInteger(); //for the delete of users, we can maybe use decrease property of AtomicInteger.
	private String pName;
	private String pSurname;
	private int pId;  //id will increase.
	private String username;
	private double weight;
	private double height;
	private double bmi;
	private Date birthdate=new Date();
	private int age;
	private String phoneNo;
	private DietList list;

	
	public String getpName() { //Name and surname must be set before username.
		return pName;
	}
	public void setpName(String pName) {
		Scanner sc=new Scanner(System.in);
		String pattern = "(?<=\\\\s|^)[a-zA-Z]*(?=[.,;:]?\\\\s|$)" ; //Regex for only alphabetical characters.
		
		while(pName=="" || !pName.matches(pattern)) {
			System.out.println("Please enter a valid name: ");
			pName=sc.nextLine();
		}
		this.pName = pName;
		
	}
	//pName get set done
	public String getpSurname() {
		return pSurname;
	}
	public void setpSurname(String pSurname) {
		Scanner sc=new Scanner(System.in);
		String pattern = "(?<=\\\\s|^)[a-zA-Z]*(?=[.,;:]?\\\\s|$)" ; //Regex for only alphabetical characters.
		
		while(pSurname=="" || !pSurname.matches(pattern)) {
			System.out.println("Please enter a valid surname: ");
			pSurname=sc.nextLine();
		}
		
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
		return this.getpName() + this.getpSurname() + this.getpId();
	}
	public void setUsername() { //no parameter need.
		this.username=this.getpName() + this.getpSurname() + this.getpId();
		
	}
	//username get set done
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		
		this.weight = weight;
	}
	//weight get set done
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	//height get set done	
	public double getBmi() {
		return this.weight / (this.height * this.height) ;
	}
	public void setBmi() { //no parameters need.
		
		this.bmi =this.weight / (this.height * this.height); //bmi is calculated automatically.
	}
	//bmi get set done
	public String getBirthdate() { //We get parsed sdf in set method. Get it as formatted.
		SimpleDateFormat sdf2=new SimpleDateFormat("dd/MM/yyyy");
		return sdf2.format(birthdate);
	}
	
	public int birthYear=0; //to calculate age
	public void setBirthdate(String date) { //date set ettirirken formati oncesinde belirt, ona gore setlensin.
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
			this.setAge();

		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	//birthdate get set done
	
	public int getAge() {  //Age'den once birthdate'i set etmeye dikkat!
		return age;
	}
	public void setAge() { //Hata age kisminda verilecek.
		
		Date current=new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy");
		
		String currentString= sdf.format(current); //2018
		int currentYear= Integer.parseInt(currentString);
		
		this.age=currentYear-birthYear;
		
		String newDate="";
		Scanner sc=new Scanner(System.in);
		while(this.age>90 || this.age<1) { 
			System.out.println("Please enter a valid date: ");
			newDate=sc.nextLine();
			this.setBirthdate(newDate);
		}
	}
	//age get set done
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		Scanner sc=new Scanner(System.in);
		String pattern = "^[0]\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$" ; //Regex for phone numbers WITHOUT ZERO.
		
		while(phoneNo=="" || phoneNo==" " || !phoneNo.matches(pattern)) { //Turns until the true number entered.
			System.out.println("Please enter a valid phone number: ");
			phoneNo=sc.nextLine();
		}
		
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
	
	public void setDietList(DietList list) {
		this.list=list;
		list.setpId(this.getpId());
		list.setBmi(this.getBmi());
		list.setpName(this.getpName());
		list.setpSurname(this.getpSurname());
		list.setAge(this.getAge());
	}
	
	public DietList getDietList() {
		return list;
	}
	
	
	public Patient() {
		pId=uniqueId.incrementAndGet();
		//default constructor
		
	}
	
	public Patient(String pName, String pSurname, double weight, double height) { //Maybe not going to use constructor because of console control.	
		pId=uniqueId.incrementAndGet();											// Or we can set everything here
		this.setpName(pName);
		this.setpSurname(pSurname);
		this.weight=weight;
		this.height=height;
	}	
}