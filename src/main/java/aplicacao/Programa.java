package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;


public class Programa {

	public static void main(String[] args) {
		
		Pessoa p4 = new Pessoa(null,"Rodrigo Oliveira", "rodrigo.olv.santos@gmail.com");
		Pessoa p5 = new Pessoa(null,"Naiara Alvez", "naai_alves@gmail.com");
		Pessoa p6 = new Pessoa(null,"Jose Donizeti", "donizeti@gmail.com");
			
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(p4);
		em.persist(p5);
		em.persist(p6);
		em.getTransaction().commit();
		System.out.println("Pronto");
		
		
	}

}
