package com.nag.fp.test;

import java.io.IOException;

import com.nag.fp.beans.JobManager;

public class FactoryPatternTest {
    public static void main(String[] args) throws IOException {
    	
    	JobManager jobManager = new JobManager();
    	jobManager.launch("sorting");
    }
	
}
