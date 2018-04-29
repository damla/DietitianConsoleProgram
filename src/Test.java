import java.util.Scanner;

public class Test{
// for dongusuyle giris yaptiririz. treeye eklemek icin id kullanacagimizi ele alirsak kullanicilara atanan en son id numarasini kayit ettirerek ordan eklemeye devam etmesini saglaya_
// biliriz.
	public static void main(String[]args) {
		//1st patient
		Patient d=new Patient("damla","koksal",51,1.61);
		
		d.setBirthdate("10/10/1996"); 
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
		a.setdList("\nSABAH\n" +
				"-------\n" +
				"1 dilim tam çavdar ekmeği\n"
				+ "2 parmak kadar az yağlı dil peyniri\n"
				+ "5 adet zeytin\n" + 
				"Domates, yeşil biber, maydanoz\n" + 
				"Şekersiz açık çay\n" + 
				"\nARA\n" + 
				"-------\n" +
				"2 tam ceviz\n" + 
				"\nÖĞLE\n" + 
				"-------\n" +
				"1 tabak zeytinyağlı sebze\n" + 
				"1 kase cacık veya ayran\n" + 
				"Çoban salata (1 tatlı kaşığı zeytinyağı)\n" + 
				"1 dilim çavdar ekmeği\n" + 
				"\nARA\n" + 
				"-------\n" +
				"1 küçük armut (bol tarçınlı)\n" + 
				"1 dilim az yağlı beyaz peynir\n" + 
				"1 kepekli girsini\n" + 
				"\nAKŞAM\n" + 
				"-------\n" +
				"Izgara balık (180-200 gr.)\n" + 
				"4 adet buharda roka ve yeşil salata\n" + 
				"(1 tatlı kaşığı zeytinyağı ile)\n" + 
				"\nARA\n" + 
				"-------\n" +
				"Yarım muz\n" + 
				"10 taze badem");
		a.setBmi();
		d.setDietList(a);
		System.out.println(d.getDietList());
		//Diet object test ended here.
		
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

	}
}
