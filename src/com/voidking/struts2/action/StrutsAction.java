package com.voidking.struts2.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class StrutsAction extends ActionSupport{
	private String name;
	
	public String getName()
	{
		return name;		
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String execute() throws Exception
	{
		if(!name.equals("HelloWorld"))
		{
			Map request = (Map)ActionContext.getContext().get("request");
			request.put("name", getName());
			return "success";
		}else {
			return "error";
		}
	}
	
}
