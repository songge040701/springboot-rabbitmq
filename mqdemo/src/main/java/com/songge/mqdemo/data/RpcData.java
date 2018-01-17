package com.songge.mqdemo.data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author songge
 *
 */
public class RpcData implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	
	
	int id;
	String name;
	Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
