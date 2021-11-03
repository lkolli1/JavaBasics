package inherit;

public class Test {

	public static void main(String[] args) {
			
		TouchScreenLaptop touchScreenLapTop=new HPNoteBook();

		touchScreenLapTop.scroll();
		touchScreenLapTop.click();
		
		
		TouchScreenLaptop touchScreenLapTop1=new DellNoteBook();
		
		touchScreenLapTop1.scroll();
		touchScreenLapTop1.click();
		
		//downCasting
		System.out.println(" Down Casting Need to done explicitly for \n Specific Features of child class");
		HPNoteBook hpNoteBook=(HPNoteBook) touchScreenLapTop;
		
		hpNoteBook.scroll();
		hpNoteBook.click();
		hpNoteBook.features();
		
		
	}

}
