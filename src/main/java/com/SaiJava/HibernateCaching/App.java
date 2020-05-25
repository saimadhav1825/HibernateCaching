package com.SaiJava.HibernateCaching;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;


public class App 
{
    public static void main( String[] args )
    {
    	Alien a=null;
    	
    	Configuration cfg=new Configuration().configure().addAnnotatedClass(Alien.class);
    	org.hibernate.service.ServiceRegistry rg=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry(); 
    	SessionFactory sf=cfg.buildSessionFactory(rg);
    	Session session=sf.openSession();
    	org.hibernate.Transaction tx=session.beginTransaction();
    	        //  a=(Alien)session.get(Alien.class, 101);
    	          tx.commit();
    	          session.close();
    	          Session session2=sf.openSession();
    	          org.hibernate.Transaction tx1=session2.beginTransaction();
    	          //a=(Alien)session.get(Alien.class, 101);
    	          tx1.commit();
    	          session2.close();
    	     
    	         // Using Query to fetch data
    	          //Session session=sf.openSession();
    	      //	org.hibernate.Transaction tx=session.beginTransaction();
    	                     // Query q1=  session.createQuery("select *from Alien where aid>101");
    	                       //         q1.setCacheable(true);
    	                        //          a=(Alien)q1.uniqueResult();
    	                          //        tx.commit();
    	                            //      session.close();
    	          
    	          
    	          
    }
}
