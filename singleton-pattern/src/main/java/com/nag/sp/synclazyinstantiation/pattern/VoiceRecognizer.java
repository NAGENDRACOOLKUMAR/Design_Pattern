
/*
 * here java is multi threaded  so there is chance of create more then one object . so 
 *  here we have to use the synchronization keyword to prevent the more than two object.
 */



package com.nag.sp.synclazyinstantiation.pattern;

public class VoiceRecognizer {

	private static VoiceRecognizer instance;
	
	private VoiceRecognizer() {
		
	}
	
	/*
	 * don't let multiple thread to simultaneously create the object of the class. 
	 *  so we add the keyword synchronized.
	 */

	public synchronized static VoiceRecognizer getInstance() {
		if(instance == null) {
			try {
				Thread.sleep(50l);
			} catch (Exception e) {
				e.printStackTrace();
			}
			instance = new VoiceRecognizer();
		}
		return instance;
	}
	
	public void recognize() {
		System.out.println("voice recognizer "+ this.hashCode() +" is processing");
	}
	
}
