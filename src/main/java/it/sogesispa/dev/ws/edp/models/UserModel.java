package it.sogesispa.dev.ws.edp.models;

import it.sogesispa.dev.ws.edp.entities.User;

public class UserModel 
{
	private long count;
	private Iterable<User> user;
	
	public UserModel(long count, Iterable<User> user)
	{
		this.count = count;
		this.user = user;
	}
	
	public long getCount() {
		return count;
	}
	public void setCount(long l) {
		count = l;
	}
	public Iterable<User> getUser() {
		return user;
	}
	public void setUser(Iterable<User> user) {
		this.user = user;
	}
	
	
}
