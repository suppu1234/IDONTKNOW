package com.qa.client;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class Rest {
	
	//GET
	
	public void get(String url) throws ClientProtocolException, IOException
	{
		CloseableHttpClient httpClient = HttpClients.createDefault();//it will create default client
		HttpGet httpget=new HttpGet(url);
		// this will create connection with this particular url
		CloseableHttpResponse execute = httpClient.execute(httpget);
		//how we click on send, like that hit that url
		//status body everything available here
		//we have to fetch couple of things from here
		
		int statusCode = execute.getStatusLine().getStatusCode();
		System.out.println("status code +" +statusCode);
		
		
		String response=EntityUtils.toString(execute.getEntity(), "UTF-8");
		
		JSONObject responsejsot=new JSONObject(response);
		
		System.out.println("response jason"+ responsejsot);
		
	}

}
