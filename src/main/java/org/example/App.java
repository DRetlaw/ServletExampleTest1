package org.example;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException {

        System.out.println( "Hello World!" );
        Tomcat server=new Tomcat();

        Context cntxt= server.addContext("",null);
        Tomcat.addServlet(cntxt,"FirstServlet",new HelloServlet());
        cntxt.addServletMappingDecoded("/hello","FirstServlet");

        server.start();
        server.getServer().await();
    }
}
