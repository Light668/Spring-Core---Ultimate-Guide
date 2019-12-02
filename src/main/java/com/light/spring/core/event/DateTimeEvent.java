package com.light.spring.core.event;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationEvent;

public class DateTimeEvent extends ApplicationEvent  {
	
	private Date dateTime;
	
	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public DateTimeEvent(Object source) {
		super(source);
		this.dateTime = Calendar.getInstance().getTime();
	}

}
