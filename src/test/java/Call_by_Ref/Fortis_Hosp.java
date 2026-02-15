package Call_by_Ref;

public class Fortis_Hosp implements USA_Hosp {
	
	@Override 
	public void billing() {    // non static method
		
		System.out.println("Bill amount ");
	}
	
	public static String info (Fortis_Hosp fh, String doctor) { // static method 

		System.out.println("dislay info");
		return "name"+doctor  ;
	
	}
	
	public static void main(String[] args) {
		
		
		Fortis_Hosp fh = new Fortis_Hosp (); 
		fh.billing();
		
		String result =Fortis_Hosp.info(fh, "Pallavi patil ");
		System.out.println(result);
		
	}

}
