package dictionaryPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DictionaryPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String, String> englSpanDict = new HashMap<String, String>();
		
		//put in dictionary
		englSpanDict.put("Monday", "Lunes");
		englSpanDict.put("Tuesday", "Martes");
		englSpanDict.put("Wednesday", "Miercoles");
		englSpanDict.put("Thursday", "Jueves");
		englSpanDict.put("Friday", "Viernnes");
		
		//retrieve from dict
		System.out.println(englSpanDict.get("Monday"));
		System.out.println(englSpanDict.get("Tuesday"));
		System.out.println(englSpanDict.get("Wednesday"));
		System.out.println(englSpanDict.get("Thursday"));
		System.out.println(englSpanDict.get("Friday"));
		
		//print all keys
		System.out.println(englSpanDict.keySet());
		
		//print out all values
		System.out.println(englSpanDict.values());
		
		//print size
		System.out.println(englSpanDict.size());
		
		//Map<String, String> phoneBook = {("frank", "4015881695");
		
				
		// Declare a String to String map
		Map<String, String> myMap; 

		// Initialize it as a new String to String HashMap
		myMap = new HashMap<String, String>();  

		// Change myMap to be a new (completely different) String to String LinkedHashMap instead
		myMap = new LinkedHashMap<String, String>(); 		
		

	}

}
