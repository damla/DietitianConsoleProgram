public class Patient {
//date ve age sonra eklenecek.
	private String pName;
	private String pSurname;
	private int pId;
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
	public void setpId(int pId) {
		this.pId = pId;
	}
	//pId get set done
	public String getusername() {
		return this.getpName() + this.getpSurname() + this.getpId();
	}
	public void setusername() {
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
	public void setBmi() { //parameters need to calculate bmi.
		
		this.bmi =this.weight / (this.height * this.height); //bmi is calculated automatically.
	}
	//bmi get set done
	
	public Patient() {
		//default constructor
	}
	
	public Patient(String pName, String pSurname, int pId, double weight, double height) {
		
		this.pName=pName;
		this.pSurname=pSurname;
		this.pId=pId;
		this.weight=weight;
		this.height=height;
	}
	
	
}
