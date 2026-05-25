package com.nag.fp.beans;

import java.io.IOException;

import com.nag.fp.pattern.JobFactory;

public class JobManager {

	public void launch ( String algorithm) throws IOException {
		
		Job job = null;
		
		job = JobFactory.newJob(algorithm);
		
		int jobStatus=job.execute();
		
		System.out.println("job status :" +jobStatus);
	}
}
