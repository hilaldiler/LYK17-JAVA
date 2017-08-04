package tr.org.kamp.linux.documentation;

public class LibreOfficeCalc  extends Document{
	public LibreOfficeCalc(String author, String content) {
		super(author, content);
	}

	void printDocument() {
		System.out.println("LibreOfficeCalc dokümanı yazdırılıyor..");
		
	}
}

