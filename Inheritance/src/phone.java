
public class phone{
	
	public phone(String yourName) {
		System.out.println("phon is created By "+yourName+"...\n");
		
	}
	public String name;
	private int butonCount;
	private String ScreenDetais;

	
	
	

	public String getName() {
		return name;
	}





	public int getButonCount() {
		return butonCount;
	}





	public String getScreenDetais() {
		return ScreenDetais;
	}





	public void setButonCount(int butonCount) {
		this.butonCount = butonCount;
	}





	public void setScreenDetais(String screenDetais) {
		ScreenDetais = screenDetais;
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		phone p = new phone("Ali");
		
		Nokia1 n = new Nokia1();
		Nokia2 n2 = new Nokia2();
		Lg l = new Lg();
		
		
		

	}

}
