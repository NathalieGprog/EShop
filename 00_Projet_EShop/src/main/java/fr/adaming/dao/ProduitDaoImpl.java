package fr.adaming.dao;

import java.util.Collection;

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
	public Produit obtenirTous() {
		// TODO Auto-generated method stub
		return null;
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
	public Collection<Produit> obtenirUn(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
