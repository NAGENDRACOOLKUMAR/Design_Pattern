package com.nag.sp.test;

import com.nag.sp.synclazyinstantiation.pattern.VoiceRecognizer;
import com.nag.sp.synclazyinstantiation.runnable.CallerThread;
import com.nag.sp.synclazyinstantiation.runnable.MessangerThread;

public class MultiThreadSingletonPatternTest {
    public static void main(String[] args) {
	CallerThread callerThread = new CallerThread();
	MessangerThread messangerThread = new MessangerThread();
	
	Thread t1 = new Thread(callerThread);
	Thread t2 = new Thread(messangerThread);
	
	t1.start();
	t2.start();
	
    //new Thread(()->{VoiceRecognizer.getInstance().recognize();}).start();
	
	//new Thread(()->{VoiceRecognizer.getInstance().recognize();}).start();
	
    }
}
