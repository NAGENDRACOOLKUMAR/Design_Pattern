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
