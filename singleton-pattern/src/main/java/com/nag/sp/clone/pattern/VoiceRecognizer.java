/*
 * in class is not clonable unless it is not implementing the cloneable interface
 */

package com.nag.sp.clone.pattern;

public class VoiceRecognizer extends Audit implements Cloneable{
	
  private static VoiceRecognizer instance;
  
  private VoiceRecognizer() {
	  
  }

  public static VoiceRecognizer getInstance() {
	if(instance== null) {
		synchronized (VoiceRecognizer.class) {
			if(instance== null) {
				instance = new VoiceRecognizer();
			}
		}
	}
	  
	  return instance;
  }
  
  public void recognize() throws CloneNotSupportedException {
	  System.out.println("voice recognzer :" + this.hashCode() + " is processing");
	  
	  VoiceRecognizer voiceRecognizer = (VoiceRecognizer) this.clone();
	  System.out.println("clone object :"+ this.hashCode() + " is come");
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return new CloneNotSupportedException();
  }
  
  
  
}
