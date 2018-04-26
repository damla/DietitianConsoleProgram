import java.sql.Date;

public class Appointment extends Patient
{
	
	private Date date; 
	private String time; 
	 public String getTime() {
		return time;
	}



	public Appointment(Date date) {
	        this.date = date;
	        this.time = time;
	    }

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	public void setTime(String time) {
		this.time = time;
		
	}

}
