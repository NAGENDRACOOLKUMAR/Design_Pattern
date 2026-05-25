package com.nag.dp.ser.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.nag.dp.ser.beans.Account;

public class SerTest {
	private final static String Ser_File ="d:\\account.ser";
	
 public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	/* Account account = new Account();
	 account.setAccountNo(2454);
	 account.setAccountHolderName("sanjay");
	 account.setAccountType("saving");
	 account.setBalance(6000l);
	 serialize(account,Ser_File);
	
	 */
	 Account account =deserilize(Ser_File);
	  System.out.println(account);
	 
 }
 
   public static void serialize(Account account,String outFile )  {
	  try(  ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(outFile)));){
		  oos.writeObject(account);  
	  } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
   }
   
   public static Account deserilize(String inFile) throws ClassNotFoundException {
	   Account account = null;
	   try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(inFile)));){
		 account =   (Account) ois.readObject();
	   } catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	   return account;
   }
}
