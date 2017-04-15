
public class EngineeringBook extends Book
{
	private String category;

	public EngineeringBook(String category) {
		super();
		this.setCategory(category);
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}
