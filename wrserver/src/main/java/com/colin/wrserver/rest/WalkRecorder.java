package com.colin.wrserver.rest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.colin.wrserver.jpa.MarkerJPA;
import com.google.gson.Gson;


@Path("marker/1.0")
public class WalkRecorder {

	@PersistenceContext
    private EntityManager em;
	
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	@Path("save")
	public String save(MarkerJPA data) {
		if(data.getId() == 0L) {
			create(data);
		}
		else {
			update(data);
		}
		return new Gson().toJson(data);
	}

	private void update(MarkerJPA data) {
		// TODO Auto-generated method stub
	}

	private void create(MarkerJPA data) {
		em.getTransaction().begin();
		em.persist(data);
		em.getTransaction().commit();
	}
}
