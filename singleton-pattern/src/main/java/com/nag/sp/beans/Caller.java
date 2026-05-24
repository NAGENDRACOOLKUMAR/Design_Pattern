package com.nag.sp.beans;

import com.nag.sp.lazyinstantation.pattern.VoiceRecognizer;

public class Caller {

	 public void listen() {
		 //VoiceRecognizer voiceRecognizer = new VoiceRecognizer();
		 VoiceRecognizer voiceRecognizer = VoiceRecognizer.getInstance();
		 voiceRecognizer.recognize();
	 }
}
