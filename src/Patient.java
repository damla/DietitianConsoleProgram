import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Patient{
//date ve age sonra eklenecek.
	private String pName;
	private String pSurname;
	private int pId=0;  //id will increase.
	private String username;
	private double weight;
	private double height;
	private double bmi;
	private Date birthdate=new Date();
	private int age;
	
	public String getpName() { //Name and surname must be set before username.
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	//pName get set done
	public String getpSurname() {
		return pSurname;
	}
	public void setpSurname(String pSurname) {
		this.pSurname = pSurname;
	}
	//pSurname get set done
	public int getpId() { 
		return pId;
	}
	public void setpId() {	 //Id usernameden once eklenmeli.
		//If else part will be add after Linked list created.
		this.pId++;
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
		
		String currentString= sdf.format(current);
		int currentYear= Integer.parseInt(currentString);
		
		this.age=currentYear-birthYear;
		
		String newDate="";
		Scanner sc=new Scanner(System.in);
		while(this.age>90 || this.age<1) { 
			System.out.println("Please enter a valid date:");
			newDate=sc.nextLine();
			this.setBirthdate(newDate);
		}
	}
	//age get set done
	public Patient() {
		//default constructor
	}
	
	public Patient(String pName, String pSurname, double weight, double height) { //Maybe not going to use constructor because of console control.	
		this.pName=pName;
		this.pSurname=pSurname;
		this.weight=weight;
		this.height=height;
	}
	
}