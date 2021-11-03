package com.emc.managers;

import com.emc.entities.Event;

public class EventManageImpl implements EventManager {

	@Override
	public Event create(int id) {
		 
		return new Event(id,"Mac Book Launch","New Generation of Mac Books Launch");
	}

}
