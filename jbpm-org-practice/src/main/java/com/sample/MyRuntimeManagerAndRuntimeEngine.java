package com.sample;

import java.io.File;

import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.manager.RuntimeEngine;
import org.kie.api.runtime.manager.RuntimeEnvironment;
import org.kie.api.runtime.manager.RuntimeEnvironmentBuilder;
import org.kie.api.runtime.manager.RuntimeManager;
import org.kie.api.runtime.manager.RuntimeManagerFactory;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.runtime.manager.context.EmptyContext;

public class MyRuntimeManagerAndRuntimeEngine {

	public static void main(String[] args) {
		

	     File file = new File("src/main/resources/com/sample/sample.bpmn");

		RuntimeEnvironment environment = RuntimeEnvironmentBuilder.Factory.get().newDefaultInMemoryBuilder().addAsset(ResourceFactory.newFileResource(file), ResourceType.BPMN2).get();
		
		RuntimeManager manager = RuntimeManagerFactory.Factory.get().newSingletonRuntimeManager(environment);
		
		RuntimeEngine engine = manager.getRuntimeEngine(EmptyContext.get());
		
		KieSession kieSession = engine.getKieSession();
		
		System.out.println("Inside MyRuntimeManagerAndRuntimeEngine");
		manager.disposeRuntimeEngine(engine);
	}

}
