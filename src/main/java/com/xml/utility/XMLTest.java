package com.xml.utility;

import java.io.StringReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XMLTest {

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		
		String requestXml = "<?xml version=\"1.0\"?><OtpResponse><Transaction><Pan>12</Pan><Proc_Code>123456</Proc_Code></Transaction></OtpResponse>";
		
		StringReader reader = new StringReader(requestXml);
		JAXBContext context = JAXBContext.newInstance(OtpResponse.class);
		Unmarshaller un = context.createUnmarshaller();
		
		OtpResponse otp = (OtpResponse)un.unmarshal(reader);
		System.out.println(otp.getTranscation().getPan());
		System.out.println(otp.getTranscation().getProc_Code());
		
		
		

	}

}
