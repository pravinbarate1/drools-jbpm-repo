package com.sample;

import java.io.File;

import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.logger.KieRuntimeLogger;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.process.ProcessInstance;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.utils.KieHelper;

public class ProcessExecutor {

	public static void main(String[] args) {

     KieHelper kieHelper = new KieHelper();
     
     
     File file = new File("src/main/resources/com/sample/sample.bpmn");
     
     KieBase kBase = kieHelper.addResource(ResourceFactory.newFileResource(file)).build();
     
     KieSession kieSession = kBase.newKieSession();
     
     KieRuntimeLogger logger = KieServices.Factory.get().getLoggers().newFileLogger(kieSession, "process-eventlistener-logs");
		
     ProcessInstance processInstance = kieSession.startProcess("com.sample.bpmn.hello");
     
     System.out.println("process started successfully");
     
     logger.close();
		
	}

}
