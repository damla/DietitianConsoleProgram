import java.util.Scanner;

public class Test{
// for dongusuyle giris yaptiririz. treeye eklemek icin id kullanacagimizi ele alirsak kullanicilara atanan en 
//son id numarasini kayit ettirerek ordan eklemeye devam etmesini saglayabiliriz.
	
	public static void main(String[]args) {
		//1st patient
		Patient d=new Patient("damla","koksal",51,1.61);
		
		d.setBirthdate("10/10/1900"); 
		d.setBmi();
		d.setUsername();
		d.setPhoneNo("0(212)222-2222");
		System.out.println("Username: "+ d.getUsername() +
						   "\nName: "+ d.getpName() +
						   "\nSurname: "+ d.getpSurname() +
						   "\nPhone No: "+ d.getPhoneNo() +
						   "\nBirthdate: " + d.getBirthdate() +
						   "\nAge: " + d.getAge() +
						   "\nWeight: " + d.getWeight() +
						   "\nHeight: " + d.getHeight() +
						   "\nBmi: " + d.getBmi() +
						   "\nId: " + d.getpId());
		
		System.out.println();
		Patient o=new Patient("Yaprak", "Koksal", 54, 1.62);
		//2nd patient
		
		o.setBirthdate("10/10/2001");
		o.setBmi();
		o.setUsername();
		System.out.println("Username: "+ o.getUsername() +
				   "\nName: "+ o.getpName() +
				   "\nSurname: "+ o.getpSurname() +
				   "\nBirthdate: " + o.getBirthdate() +
				   "\nAge: " + o.getAge() +
				   "\nWeight: " + o.getWeight() +
				   "\nHeight: " + o.getHeight() +
				   "\nBmi: " + o.getBmi() +
				   "\nId: " + o.getpId()); 
		//patient object test ended here.
		System.out.println("------------------------- ");
		DietList a=new DietList();
		a.setdList("");
		a.setBmi();
		d.setDietList(a);
		System.out.println(d.getDietList());

		
		//Diet object test ended here.
		
		
		
		Appointment b=new Appointment();
		b.setDate("30/04/2018");
		b.setTime("22:50");
		d.setDateTime(b);
		System.out.println("--------------------------");
		System.out.println(d.getDateTime());
		   
		//regex test
		/*Scanner sc= new Scanner(System.in);
		System.out.println("isim Gir");
		String name=sc.nextLine();
		String pattern = "(?<=\\s|^)[a-zA-Z]*(?=[.,;:]?\\s|$)"; //Regex for phone numbers WITHOUT ZERO.
		if(name=="" || name==" " || !name.matches(pattern))
			System.out.println("problem var");
		else
			System.out.println("problem yok");
		*/	


		
// Appointment için sorgular oluşturulacak . Kontrol yapısı / Yeni tarih

	}
}
