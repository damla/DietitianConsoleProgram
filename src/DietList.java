
public class DietList extends Patient{

	private String dList;
	private int pId;
	private double bmi;
	private String pName;
	private String pSurname;
	private int age;
	
	public String getdList() {
		return dList;
	}

	public void setdList(String dList) {
		this.dList = dList;
	}

	
	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	
	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpSurname() {
		return pSurname;
	}

	public void setpSurname(String pSurname) {
		this.pSurname = pSurname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {

		return  "Name: "+this.getpName() + 
				"\nSurname: "+this.getpSurname() + 
				"\nAge: " + this.getAge() +
				"\nBmi: "+ this.getBmi() +
				"\nDiet List: " +this.dList;
	}
}
