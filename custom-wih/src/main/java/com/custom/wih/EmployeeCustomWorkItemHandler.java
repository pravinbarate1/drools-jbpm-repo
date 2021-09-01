package com.custom.wih;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

public class EmployeeCustomWorkItemHandler implements WorkItemHandler{

	public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {

		Employee empLocal = (Employee)workItem.getParameter("emp");
		
		empLocal.setEmpName("Updated Name Is : Pravin B");
		
		Map<String, Object> map = new HashMap<String, Object>();		
		map.put("emp", empLocal);
		
		manager.completeWorkItem(workItem.getId(), map);
		
	}

	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		// TODO Auto-generated method stub
		
	}
	
}
