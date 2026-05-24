
/*
 *  this is blocking is happen at class level, so no two thered are simultaneously enter at class level. 
 *   this is the best option for the synchronization. 
 *   
 *   previously we are doing the block at the method leval,which is not good . because no two thread can 
 *    enter at method level only.  
 */


package com.nag.sp.doublecheck.pattern;

public class VoiceRecognizer {

	private static VoiceRecognizer instance;
	
	private VoiceRecognizer() {
		
	}

	public static VoiceRecognizer getInstance() {
		if(instance == null) {
			System.out.println("lock the class");
			synchronized (VoiceRecognizer.class) {
				if(instance == null) {   // here we are doing double check before the locking
					instance = new VoiceRecognizer();
				}
			}
			System.out.println("lock is released");
		}
		
		return instance;
	}
	
	public void recognize() {
		System.out.println("voice double check :"+ this.hashCode() +" is processing");
	}
}
