package tr.org.kamp.linux.documentation;

public class Picture extends Document {

	public Picture(String author, String content) {
		super(author, content);
		// TODO Auto-generated constructor stub
	}

	@Override
	void printDocumentation() {
		System.out.println("Resim dokümanı yazdırılıyor..");
	}

	

}
