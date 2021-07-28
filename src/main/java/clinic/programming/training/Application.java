package clinic.programming.training;

import org.apache.commons.lang3.StringUtils;

public class Application {
    
	public int countWords(String words) {
		if (words != null) {
		  String[] separateWords = StringUtils.split(words, ' ');
		  return separateWords.length;
		} else {
			return 0;
		}
		
	}
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
    }
}