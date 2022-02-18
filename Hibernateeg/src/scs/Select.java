package scs;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;


public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from stu s1");
		List lst = q.list();
		Iterator it = lst.iterator();
		while(it.hasNext())
		{
			stu st = (stu)it.next();
			
			
			System.out.println(st.getRno()+" "+st.getSname());
			
		}
		s.close();

	}

}
