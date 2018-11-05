package com.xml.utility;

import javax.xml.bind.annotation.XmlElement;

public class Transaction {
	
	@XmlElement
	private String Pan;
	@XmlElement
	private String Proc_Code;
	
	
	public String getPan() {
		return Pan;
	}
	public void setPan(String pan) {
		Pan = pan;
	}
	
	
	public String getProc_Code() {
		return Proc_Code;
	}
	public void setProc_Code(String proc_Code) {
		Proc_Code = proc_Code;
	}
	
	
	

	
	
	

}
