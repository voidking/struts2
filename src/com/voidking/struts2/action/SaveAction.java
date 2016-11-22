package com.voidking.struts2.action;

import com.opensymphony.xwork2.ActionSupport;
import com.voidking.struts2.db.DBConn;
import com.voidking.struts2.model.Xsb;

public class SaveAction extends ActionSupport{
	private Xsb xs;
	public Xsb getXs() {
		return xs;
	}
	public void setXs(Xsb xs) {
		this.xs=xs;
	}
	public String execute() throws Exception {
		DBConn db=new DBConn();
		Xsb stu=new Xsb();
		stu.setXh(xs.getXh());
		stu.setXm(xs.getXm());
		stu.setXb(xs.isXb());
		stu.setZy_id(xs.getZy_id());
		stu.setCssj(xs.getCssj());
		stu.setBz(xs.getBz());
		if(db.save(stu)){
			return SUCCESS;
		}else
			return ERROR;
	}
}

