package abstraction;

public abstract class WebDriver {
	// public- access modifier
	// void- return type
	// get - method name
	public abstract void get(String url);
	public String getTitle() {
		System.out.println("Webpage title");
		// actual code differs, in getTite method
		return "title";
	}
}
