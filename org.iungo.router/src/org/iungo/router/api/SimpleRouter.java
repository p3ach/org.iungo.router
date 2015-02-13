package org.iungo.router.api;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.iungo.id.api.ID;
import org.iungo.message.api.ReceiveMessage;

public class SimpleRouter implements Router {

	private final ConcurrentMap<ID, ReceiveMessage> routes = new ConcurrentHashMap<>();
	
	@Override
	public synchronized void add(final ID id, final ReceiveMessage receiveMessage) {
		routes.put(id, receiveMessage);
	}

	@Override
	public synchronized void remove(final ID id, final ReceiveMessage receiveMessage) {
		routes.remove(id);
	}

	@Override
	public ReceiveMessage route(final ID id) {
		return routes.get(id);
	}

}
