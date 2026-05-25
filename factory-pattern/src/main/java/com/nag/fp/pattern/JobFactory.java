
/*
 *  why we use factory  let suppose i have  Connection con = new OracleConncection(), if we want to change 
 *   the connection from oracle to mysql .so in this we have to change lot of code . so instead of writing 
 *    tightly coupling we can write  like it a loose coupling  like 
 *    Connection con = DriverManager.getConnection(url,username, password)  so using factory we can easily 
 *    write it . no need to write to change the lot of code here. only the code in factory class change.
 *    
 *    
 *    without using the concrete class name of another class we can get the object of another class using 
 *    the factory, so that our class is loosely coupled from the classname of another class.
 *    
 *  
 *   
 * 
 */




package com.nag.fp.pattern;

import java.io.IOException;
import java.util.Properties;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

import com.nag.fp.beans.Job;
import com.nag.fp.beans.JobConfig;

public class JobFactory {

	public static Job newJob(String algorithm) throws IOException {
		
		   String jobConfigFile = null;
		   JobConfig jobConfig = null;
		   Properties props = null;
		   Job job = null;
		
		  /* jobConfigFile = algorithm +"-job-config.properties";
		   
		   props = new Properties();
		   
		   props.load(JobFactory.class.getClassLoader().getResourceAsStream(jobConfigFile));
		  */
		   jobConfigFile = algorithm +"-job-config.json";
		   
		    
		      JsonReader jsonReader = Json.createReader(JobFactory.class.getClassLoader()
		          .getResourceAsStream(jobConfigFile));
		          
		          JsonObject  jsonObjet = jsonReader.readObject();
		    
		   
		      jobConfig = new JobConfig();
		  /*  jobConfig.setExtensionType(props.getProperty("extensionType"));
		      jobConfig.setThreads(Integer.parseInt(props.getProperty("threads")));
		      jobConfig.setBatchSize(Integer.parseInt(props.getProperty("batchSize")));
		  */
		   
		    jobConfig.setExtensionType(jsonObjet.getString("extensionType"));
		    jobConfig.setThreads(jsonObjet.getInt("threads"));
		    jobConfig.setBatchSize(jsonObjet.getInt("batchSize"));
		   
		      job = new Job(jobConfig, algorithm);
		      
		      return job;
		   
	}
}
