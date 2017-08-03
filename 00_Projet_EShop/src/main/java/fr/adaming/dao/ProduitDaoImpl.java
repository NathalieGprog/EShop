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
		List<Produit> listeProduit = query.list();
		return listeProduit;
	}
	
	@Override
	public boolean modifier(Produit produit) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean supprimer(Produit produit) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Produit obtenirUn(int id) {
		// TODO Auto-generated method stub
		return null;
	}



}
