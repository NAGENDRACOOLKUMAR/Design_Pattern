/*
 *  this is also has same problem as the eager instantation .
 */



package com.nag.sp.staticblock.pattern;

public class VoiceRecognizer {
	
	private static VoiceRecognizer instance;
	
	private static String sensitivityLevel;
	// like like high or noramal or high 
	
	 /*
	  * static block is loadded as the time of class loading in the jvm. 
	  */
	
	static {
		sensitivityLevel ="noraml";
		instance = new VoiceRecognizer();
	}
	
	private VoiceRecognizer() {
		
	}

	public static VoiceRecognizer getInstance() {
		return instance;
	}
	
	public void recognize() {
		System.out.println("voice recognizer "+ this.hashCode() + 
				"is recognized with senitivty level" + sensitivityLevel);
		
	}
	

}
