package es.upm.griseprofundizacion2018.prof2018_CeliaCaroExam;

public class MyString 
{	
	private String string;
	
	public MyString(String my_string) {
		this.string = my_string;
	}
	
	// Access method
	public String getString() {
		return this.string;
	}
	
    public int compareTo(MyString anotherString) {
    	String second_string = anotherString.getString();
    	
    	if(this.string.length() != second_string.length()) {
    		return -1;
    	}
    	for(int i = 0; i < this.string.length(); i++) {
    		int value = this.string.charAt(i) - second_string.charAt(i);
    		if (value != 0) {
    			return -1;
    		}
    	}
		return 0;   	
    }
   
}
