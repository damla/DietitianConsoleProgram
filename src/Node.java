import java.util.Date;

public class Node extends Patient{
	//this code is taken from our teacher's codes to implement our project.
	//We did not started to work on doubly linked list yet.
		private Node next, prev;
		private DietList dietList= new DietList();
		private Appointment appointment=new Appointment();
		private Patient patient=new Patient();
	   
		/* Constructor */
	    public Node() //yeni node eklersek null gelir, daha sonra setlenebilir
	    {

	        next = null;
	        prev = null;
	        
	    }
	  
	    /* Constructor */
	    public Node(String name,String surname, double weight,double height, String birthdate, String phoneNo, String date, String time, String dList, Node n, Node p)
	    {
	    		//Node olusturdugumuzda patient aliyoruz, diet listesi aliyoruz, appointment aliyoruz
	    		//next ve previous nodelar aliniyor.
	    	   	//id kisi yaratildiginda zaten atanmis oluyor.
	    		
	    		//appointment setleri
	    	   	this.appointment.setDate(date);
	    	   	this.appointment.setTime(time);
	    	   	
	    	   	//dietlist setleri
	    	   	this.dietList.setdList(dList);

	    	   	//patient setleri
	    		this.patient.setpName(name);
	    		this.patient.setpSurname(surname);
	    		this.patient.setWeight(weight);
	    		this.patient.setHeight(height);
	    		this.patient.setBirthdate(birthdate);
	    		this.patient.setBmi();
	    		this.patient.setUsername();
	    		this.patient.setPhoneNo(phoneNo);
	    		this.patient.setAppointment(this.appointment);
	    		this.patient.setDietList(dietList);
	    		
	        next = n;
	        prev = p;
	    }
	    
	    //getters and setters
	    /* Function to set link to next node */
	    public void setLinkNext(Node n)
	    {
	        next = n;
	    }
	    /* Function to set link to previous node */
	    public void setLinkPrev(Node p)
	    {
	        prev = p;
	    }    
	    /* Function to get link to next node */
	    public Node getLinkNext()
	    {
	        return next;
	    }
	    /* Function to get link to previous node */
	    public Node getLinkPrev()
	    {
	        return prev;
	    }
	  
}
