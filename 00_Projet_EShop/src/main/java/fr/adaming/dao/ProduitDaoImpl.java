package fr.adaming.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.entite.Produit;

@Repository
public class ProduitDaoImpl implements IGeneriqueDao<Produit> {

	@Autowired
	private SessionFactory sf ;
	/**
	 * @param sf the sf to set
	 */
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	
	@Override
	public void ajouter(Produit produit) {
		Session s = sf.getCurrentSession();
		s.save(produit);
	}
	
	@Override
	public List<Produit> obtenirTous() {
		Session s = sf.getCurrentSession();
		String req = "FROM Produit"; 
		Query query = s.createQuery(req);
		@SuppressWarnings("unchecked")
		List<Produit> listeProduit = query.list();
		return listeProduit;
	}
	
	@Override
	public void modifier(Produit produit) {
		Session s = sf.getCurrentSession();
		s.saveOrUpdate(produit);
	}

	@Override
	public void supprimer(Produit produit) {
		Session s =  sf.getCurrentSession();
		s.delete(produit);
	}

	@Override
	public Produit obtenirUn(int id) {
		Session s = sf.getCurrentSession();
		return (Produit) s.get(Produit.class, id);
	}



}
