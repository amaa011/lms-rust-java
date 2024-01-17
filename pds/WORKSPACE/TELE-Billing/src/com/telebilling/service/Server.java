package com.telebilling.service;
 
import javax.xml.ws.Endpoint;
 
public class Server 
{ 
	public static void main(String []args)
	{
	  Endpoint.publish("http://localhost:9898/TELEWebService", new TELEWebService());
	  System.out.println("TELE-Web service is ready");
	  
	}
}
