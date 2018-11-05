package com.xml.utility;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="OtpResponse")
public class OtpResponse {
	
	private Transaction transcation;

	@XmlElement(name="Transaction")
	public Transaction getTranscation() {
		return transcation;
	}

	public void setTranscation(Transaction transcation) {
		this.transcation = transcation;
	}
	
	

}
