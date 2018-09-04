package com.eval.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eval.dao.CustomerDao;
import com.eval.entity.Customer;

@Transactional
@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@PersistenceContext
	private EntityManager em;
	
//	@Autowired
//	SessionFactory factory;
	
	@Override
	public List<Customer> addCustomer() {
		System.out.println("in dao impl");

		return em.createQuery("from Customer", Customer.class).getResultList();
		
		
		
				//return em.createQuery("from Customer", Customer.class).getResultList();
		//		return em.createNamedQuery(Customer.class.get);



//		Session session = factory.openSession();
//		//	Transaction tx = null;
//
//
//		String hql = "from Customer";
//		Query query = session.createSQLQuery(hql);
//		return query.list();



		//		SessionFactory factory = getSessionFactoryBuilder().build();  
		//        Session session = factory.openSession();  
		//        Transaction t = session.beginTransaction();  
		//          
		//         Employee e1=new Employee();    
		//            e1.setId(1);    
		//            e1.setFirstName("Gaurav");    
		//            e1.setLastName("Chawla");    
		//         
		//       session.save(e1);  
		//       t.commit();  
		//       System.out.println("successfully saved");    
		//        factory.close();  
		//        session.close();     





		//		System.out.println("in dao");
		//		
		//		if(customer != null){
		//			
		//			String hql = "SELECT * from Customer c";
		//			Query query = Session.cre
		//			//entityManager.persist(customer);
		//			return "Added Customer";
		//		}
		//		else{
		//			return "Customer not Added";
		//		}

	}

}
