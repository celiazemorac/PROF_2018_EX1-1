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
    	// nodo 1
    	if(this.string.length() != second_string.length()) {
    		// nodo 2
    		return -1;
    	}
    	// nodo 3
    	for(int i = 0; i < this.string.length(); i++) {
    		int value = this.string.charAt(i) - second_string.charAt(i);
    		// nodo 4
    		if (value != 0) {
    			// nodo 5
    			return -1;
    		}
    	}
    	// nodo 6
		return 0;   	
    }
   
}
