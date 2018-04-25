

public class Patient{
//date ve age sonra eklenecek.
	private String pName;
	private String pSurname;
	private int pId=0;  //id will increase.
	private String username;
	private double weight;
	private double height;
	private double bmi;
	
	public String getpName() {
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
	public void setpId() {	
		//If else part will be add after Linked list created.
		this.pId++;
	}
	//pId get set done
	public String getusername() {
		return this.getpName() + this.getpSurname() + this.getpId();
	}
	public void setusername() { //no parameter need.
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
	
	public Patient() {
		//default constructor
	}
	
	public Patient(String pName, String pSurname, double weight, double height) {
		
		this.pName=pName;
		this.pSurname=pSurname;
		this.weight=weight;
		this.height=height;
	}
}
