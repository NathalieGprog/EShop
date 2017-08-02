package fr.adaming.dao;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.entite.Categorie;

@Repository
public class CategorieDaoImpl implements IGeneriqueDao<Categorie> {

	@Autowired
	private SessionFactory sf ;
	/**
	 * @param sf the sf to set
	 */
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	
	@Override
	public void ajouter(Categorie categorie) {
		Session s = sf.getCurrentSession();
		s.save(categorie);
	}

	@Override
	public Categorie obtenirTous() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modifier(Categorie categorie) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean supprimer(Categorie categorie) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection<Categorie> obtenirUn(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
