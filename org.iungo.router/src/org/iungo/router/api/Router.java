package org.iungo.router.api;

import org.iungo.id.api.ID;
import org.iungo.message.api.ReceiveMessage;

public interface Router {

	void add(ID id, ReceiveMessage receiveMessage);
	
	void remove(ID id, ReceiveMessage receiveMessage);
	
	ReceiveMessage route(ID id);
}
