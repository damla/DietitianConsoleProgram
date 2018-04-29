import java.sql.Date;

public class Appointment extends Patient
{
	//Date ve Time oluþturuldu.
	private Date date; 
	private String time; 
	public String getTime() {
		return time;
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
