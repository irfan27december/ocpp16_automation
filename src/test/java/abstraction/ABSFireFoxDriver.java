package abstraction;

import org.apache.commons.collections4.Get;

public class ABSFireFoxDriver extends WebDriver{

	@Override
	public void get(String url) {
		System.out.println("Open webpage");
		// actual code differs, in get method
	}
	
	public String getTitle(){
		return null;
		
	}
	
	public static void main(String args[]){
		ABSFireFoxDriver abs = new ABSFireFoxDriver();
		abs.get("");
	}
	
}