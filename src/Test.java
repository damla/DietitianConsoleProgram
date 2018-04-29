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
				"1 dilim tam Ã§avdar ekmeÄŸi\n"
				+ "2 parmak kadar az yaÄŸlÄ± dil peyniri\n"
				+ "5 adet zeytin\n" + 
				"Domates, yeÅŸil biber, maydanoz\n" + 
				"Å�ekersiz aÃ§Ä±k Ã§ay\n" + 
				"\nARA\n" + 
				"-------\n" +
				"2 tam ceviz\n" + 
				"\nÃ–Ä�LE\n" + 
				"-------\n" +
				"1 tabak zeytinyaÄŸlÄ± sebze\n" + 
				"1 kase cacÄ±k veya ayran\n" + 
				"Ã‡oban salata (1 tatlÄ± kaÅŸÄ±ÄŸÄ± zeytinyaÄŸÄ±)\n" + 
				"1 dilim Ã§avdar ekmeÄŸi\n" + 
				"\nARA\n" + 
				"-------\n" +
				"1 kÃ¼Ã§Ã¼k armut (bol tarÃ§Ä±nlÄ±)\n" + 
				"1 dilim az yaÄŸlÄ± beyaz peynir\n" + 
				"1 kepekli girsini\n" + 
				"\nAKÅ�AM\n" + 
				"-------\n" +
				"Izgara balÄ±k (180-200 gr.)\n" + 
				"4 adet buharda roka ve yeÅŸil salata\n" + 
				"(1 tatlÄ± kaÅŸÄ±ÄŸÄ± zeytinyaÄŸÄ± ile)\n" + 
				"\nARA\n" + 
				"-------\n" +
				"YarÄ±m muz\n" + 
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

		
// Appointment için sorgular oluşturulacak . Kontrol yapısı / Yeni tarih
	}
}
