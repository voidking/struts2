package com.voidking.struts2.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class Upload2Action extends ActionSupport{
	private List<File> upload2;
	private List<String> upload2FileName;
	
	
	
	public List<File> getUpload2() {
		return upload2;
	}



	public void setUpload2(List<File> upload2) {
		this.upload2 = upload2;
	}


	public List<String> getUpload2FileName() {
		return upload2FileName;
	}



	public void setUpload2FileName(List<String> upload2FileName) {
		this.upload2FileName = upload2FileName;
	}



	public String execute() throws Exception{
		
		if(upload2!=null || upload2FileName!=null)
		{
			for(int i=0;i<upload2.size();i++)
			{
				InputStream is = new FileInputStream(upload2.get(i));
				OutputStream os=new FileOutputStream("d:\\upload\\"+getUpload2FileName().get(i));
				byte buffer[] = new byte[1024];
				int count=0;
				while((count=is.read(buffer))>0)
				{
					os.write(buffer,0,count);
				}
				os.close();
				is.close();
				
				return SUCCESS;
			}
		}
		
		return ERROR;
	}
	
}
