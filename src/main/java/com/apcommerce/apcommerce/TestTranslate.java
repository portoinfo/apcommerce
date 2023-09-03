package com.apcommerce.apcommerce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
/*
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONObject;
*/
//import mb.core.ConnectionPool;

//import mb.data.Tag;
//import mb.news.Cache;

public class TestTranslate {
	
	public static String translate(String language, String text) {
		language = language.toLowerCase();
		if (language.length() != 5 || !language.substring(0, 3).equals("-")) {
			System.out.println("Language not formated!");
			return null;
		}
		String result = null;
	    String json = "";
	    try {
		    //Cache cac = new Cache("language" + language);
		    //if(cac.getCac_id() > 0)
		    //{
			//   json = cac.getCac_value();
			//   System.out.println("Using cached data for language: " + language);
			//} else {
/*	    	
				System.out.println("No cached data for language: " + language + " found, retrieving from API.");
				HttpClient client = HttpClients.custom().build();
				HttpUriRequest request = RequestBuilder.get()
						.setUri("https://app.mailingboss.com/js/" + language + ".json")
						//.setHeader("X-Requested-With", "XMLHttpRequest")
						.build();
				HttpResponse response = client.execute(request);
				BufferedReader br = new BufferedReader(
	                   new InputStreamReader((response.getEntity().getContent())));
			   	String output;
			   	
			   	while ((output = br.readLine()) != null) {
			   		json += output;
			   	}
			   	//cac.setCac_key("language" + language);
			   	//cac.setCac_value(json);
			   	//cac.cache();
			//}
		   	if(json != null && json.length() > 6)
		   	{
				//if(ConnectionPool.getDebug().equals("true"))
					System.out.println(json);
			   	JSONObject jso = new JSONObject(json);
			   	Map<String, Object> mpa = jso.toMap();
			   	Set< Map.Entry< String,Object> > st = mpa.entrySet();    
			    for (Map.Entry< String,Object> me:st) 
			    { 
			    	//if(me.getKey().equals("extra_tags") && me.getValue() != null && !me.getValue().equals("null"))
			    	//{
			    		JSONObject jsoe = (JSONObject) jso.get("extra_tags");
					   	Map<String, Object> mpae = jsoe.toMap();
					   	Set< Map.Entry< String,Object> > ste = mpae.entrySet();    
					    for (Map.Entry< String,Object> mee:ste) 
					    { 
				           System.out.println("Key: [" + mee.getKey() + "] - Value: [" + mee.getValue() + "]");
					    }
			    	//}
			        //else {
			    	//}
			    } 
		   	}
*/		   	
	   	//} catch (ClientProtocolException e) {
	   	//	e.printStackTrace();
	   	//} catch (IOException e) {
	   	//	e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
	   	}
			
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestTranslate tt = new TestTranslate();
		System.out.println("Traslation for Brazil: " + tt.translate("pt-br", "Brazil"));

	}

}
