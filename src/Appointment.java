import java.util.Date;

import java.text.SimpleDateFormat;

public class Appointment extends Patient
{
	//Date ve Time olusturuldu.
	
	private Date date =new Date(); 
	private Date time=new Date(); 


	public String getDate()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(date);
	}

	public void setDate(String date) {
		try {
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			this.date = sdf.parse(date); // date stringe �evirdik
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void setTime(String time) {
		
		try {
		  SimpleDateFormat sdfDate = new SimpleDateFormat("HH:mm");
		  
		  this.time=sdfDate.parse(time);
		  
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String getTime() {
		SimpleDateFormat sdfDate = new SimpleDateFormat("HH:mm");
		return sdfDate.format(time);
	}
	
	public String toString() {

		return  "Name: "+this.getpName() + 
				"\nSurname: "+this.getpSurname() + 
				"\nDate: " + this.getDate() +
				"\nTime: "+ this.getTime() +
				"\nID List: " + this.getpId();
	}
}
