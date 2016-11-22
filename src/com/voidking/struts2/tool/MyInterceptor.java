package com.voidking.struts2.tool;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.voidking.struts2.action.StrutsAction;

public class MyInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// 得到StrutsAction类对象
		StrutsAction action=(StrutsAction)arg0.getAction();
		// 如果Action类的name属性值为“hello”，则返回错误页面
		if(action.getName().equals("hello"))
		{
			return Action.ERROR;
		}
		return arg0.invoke();
	}

}
