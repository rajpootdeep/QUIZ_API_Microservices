package feed.bihar.exceptions.bene;

public class NoSuchBeneExist extends RuntimeException {

	private String Message;
	
	public NoSuchBeneExist() {
		
	}

	public NoSuchBeneExist(String message) {
		super(message);
		Message = message;
	}
	
	
	
}
