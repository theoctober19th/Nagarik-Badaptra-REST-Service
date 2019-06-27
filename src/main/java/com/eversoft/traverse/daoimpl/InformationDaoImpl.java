package com.eversoft.traverse.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eversoft.traverse.dao.InformationDao;
import com.eversoft.traverse.model.Information;
import com.eversoft.traverse.model.Office;
import com.eversoft.traverse.utility.HibernateUtil;

@Repository
public class InformationDaoImpl implements InformationDao {

	@Override
	public List<Information> getAllInformation(int id) {
		try
	    {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  
			  String hql = "FROM Information information WHERE information.officeId = " + id;
			  Query query = session.createQuery(hql);
			  List<Information> list = query.list();
			  System.out.println("Get ALl Information Called");
			  transaction.commit();
			  session.close();
	         return list;
	    } catch (Exception e) {
	        return new ArrayList<Information>();
	    }
	}
	
	@Override
	public Office getOfficeInfo(int id) {
		try
	    {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  Office office = (Office)session.get(Office.class, id);
			  System.out.println("Get Office Information Called");
			  transaction.commit();
			  session.close();
	         return office;
	    } catch (Exception e) {
	        return new Office();
	    }
	}

	@Override
	public List<Office> getAllOffice() {
		try
	    {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  
			  String hql = "FROM Office office";
			  Query query = session.createQuery(hql);
			  List<Office> list = query.list();
			  System.out.println("Get ALl Office Called");
			  transaction.commit();
			  session.close();
	         return list;
	    } catch (Exception e) {
	        return new ArrayList<Office>();
	    }
	}


}
