package test;


import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Cadastro;

public class TestCadastro {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cadastroDB");
		EntityManager em = factory.createEntityManager();
		
		Cadastro cadastro = new Cadastro();
		Date data = new Date();
		
		cadastro.setName("Breno");
		cadastro.setCpf("111.222.333-15");
		cadastro.setDataDeCadastro(data);
		
		em.getTransaction().begin();
		em.persist(cadastro);
		em.getTransaction().commit();
		em.close();
	}

}
