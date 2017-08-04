package tr.org.kamp.linux.documentation;

public class Pdf extends Document {
	private int pageNumber;
	public Pdf(String author, String content, int pageNumber) {
		super(author, content);
		this.pageNumber = pageNumber;
		
	}

	public int getPageNumber() {
		return pageNumber;
	}

	@Override
	void printDocumentation() {
		// TODO Auto-generated method stub
		System.out.println("pdf dokümanı yazdırılıyor.");
	}

}
