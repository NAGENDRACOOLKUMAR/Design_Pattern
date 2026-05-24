
/*
 * we are creating the object within the getInstance() method  so the object for this class
 * would we created only on demand . as the object instantion process is delayed until the 
 *  requested  it is called " lazy instantation".
 */




package com.nag.sp.lazyinstantation.pattern;

public class VoiceRecognizer {
	
	private static VoiceRecognizer instance;
	
	private VoiceRecognizer() {
		
	}

	public static VoiceRecognizer getInstance() {
		if(instance == null) {                   // create only when it has not instantated
			instance= new VoiceRecognizer();
		}
		return instance;
	}
	
	public void recognize() {
	  System.out.println("lazy voice recognizer :" + this.hashCode() + " is processing");
	}
	

}
