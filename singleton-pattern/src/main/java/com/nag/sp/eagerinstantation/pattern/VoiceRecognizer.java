/*
 * 
 * 
 *  By default when we  create a class in java is act as singleton, we need to write a code in 
 *   a way to make the class as singleton.
 *   
 *   how to make class a singleton? 
 *   #1 . by default any classes in our application can create a object of class. if we want 
 *    any class to be singleton for e.g...let say VoiceRecognizer  then stop all classes of our 
 *    application allowing them to create a object.  so we can achieve the class as singleton.
 *    
 *    how  to stop the other class to create a object? 
 *    make the default constructor as private , so that no other class can access its constructor
 *     so we stop other class to  create a  object . 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */





package com.nag.sp.eagerinstantation.pattern;
//public class VoiceRecongnizer {
//	private VoiceRecongnizer() {}
//	
//	/*
//	 * here we make a constructor as private is does't mean the it is a singleton class. 
//	 * 
//	 *   we are making a class as singleton by 
//	 *   1.Eager instantation machenism
//	 * 
//	 */
//	
//
//}

public class VoiceRecognizer {
	
/*
 * Static variable  are class level variable and only one memory are  allocated , and are
 * initialize only once during at the time of class loading .only one object  of the class
 *  would be created hence we can distribute the same object to all classes in the application.
 *  
 *  
 *   we call it eager instanstation because object is created before the use of the object.
 *   it means it got created at the time of class loading .
 */
	
	
	private static VoiceRecognizer instance = new VoiceRecognizer();
	
	private VoiceRecognizer() {}

	public static  VoiceRecognizer getInstance() {  // here we are using the getter method, and making it staic.
		return instance;                             // other class can access by get method.
	}

	
	public void recognize() {
		System.out.println("recognizer agent :"+ this.hashCode()+ " "+"is  processing");
	}

}






