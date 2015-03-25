package com.colin.wrserver.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


//Not required for full EE containers
public class ApplicationService {

	public static final String JTA_PU_NAME = "wrTablesJTA";

	public static EntityManagerFactory emf = null;
	public static EntityManager em = null;
	
	static {
		emf = Persistence.createEntityManagerFactory(JTA_PU_NAME);
		em = emf.createEntityManager();
	}
}
