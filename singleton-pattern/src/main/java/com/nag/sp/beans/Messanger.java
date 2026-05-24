package com.nag.sp.beans;

import com.nag.sp.lazyinstantation.pattern.VoiceRecognizer;

public class Messanger {

	public void readMessage() {
		//VoiceRecognizer voiceRecognizer = new VoiceRecognizer();
		VoiceRecognizer voiceRecognizer = VoiceRecognizer.getInstance();
		voiceRecognizer.recognize(); 
	}
}
