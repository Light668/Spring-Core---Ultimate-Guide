package com.light.spring.core.postprocessor;

import javax.annotation.PostConstruct;

public class Action {

	private String actionId;
	private String actionType;

	public Action(String actionId, String actionType) {
		this.actionId = actionId;
		this.actionType = actionType;
	}

	public String getActionId() {
		return actionId;
	}

	public void setActionId(String actionId) {
		this.actionId = actionId;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	@PostConstruct
	public void init() {
		System.out.println("Action Id " + actionId + ", Action type: " + actionType);
	}

}
