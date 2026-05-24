package com.nag.sp.test;



import com.nag.sp.beans.Caller;
import com.nag.sp.beans.Messanger;

public class SinglePatternTest {
	
 public static void main(String[] args) {
	 Messanger messanger = new Messanger();
	 messanger.readMessage();
	 
	 Caller caller = new Caller();
	 caller.listen();
			 
 }
}
