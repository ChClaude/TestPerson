package testperson;

import java.util.Arrays;

/**
 * 
 * @author Claude C DE_TCHAMBILA
 *
 */

public class TestPerson {
	
	public static int initialise(Person []p, int size) {
        p[0] = new Person("Sisipho", "Mvimvi", "female", 160, 60.5f);
        p[1] = new Person("Sean", "Trainor", "male", 183, 80.0f);
        p[2] = new Person("Amy", "Johnston", "female", 200, 90.0f);
        p[3] = new Person("Amir", "Karbelkar", "male", 182, 72.0f);
        p[4] = new Person("Chris", "Mbuyi", "male", 195, 75.5f);
        size = 5;
        return size;
    }
    
    public static void main(String[] args) {
        Person[] p = new Person[5];
        int size = 0;
        
        // initializing the array
        size = initialise(p, size);
        
        // sorting the array
        sort(p);
        
        // displaying the array
        display(p);
        
    }
    
    public static void sort(Person[] p) {
    	Arrays.sort(p);
    }
    
    public static void display(Person[] p) {
    	for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
		}
    }


}
