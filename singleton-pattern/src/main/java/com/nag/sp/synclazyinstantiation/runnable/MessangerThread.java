package com.nag.sp.synclazyinstantiation.runnable;

import com.nag.sp.doublecheck.pattern.VoiceRecognizer;

public class MessangerThread implements Runnable {

	@Override
	public void run() {
		
		VoiceRecognizer voiceRecognizer = VoiceRecognizer.getInstance();
		 voiceRecognizer.recognize();
		
	}

}
