package com.telecom;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException
    {
        System.out.println( "Hello World!" );
        Tomcat tomcat = new Tomcat();


        // ⭐ VERY IMPORTANT — create the connector
        tomcat.getConnector(); 
    
        Context context = tomcat.addContext("", null); //arguments project name and directory

        Tomcat.addServlet(context, "HelloServlet", new HelloServlet());
        
        context.addServletMappingDecoded("/hello", "HelloServlet");
       
    
        tomcat.start();

        ///keep server running
        // tomcat.getServer().await(); 
    }
}
