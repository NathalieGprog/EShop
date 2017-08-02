package fr.adaming.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.ProduitDaoImpl;
import fr.adaming.entite.Produit;

@Service("produitServiceBean")
@Transactional
public class ProduitService implements IGeneriqueService<Produit>{

	@Autowired
	private ProduitDaoImpl produitDao;
	/**
	 * @param produitDao the produitDao to set
	 */
	public void setProduitDao(ProduitDaoImpl produitDao) {
		this.produitDao = produitDao;
	}
	

	@Override
	public void ajouter(Produit produit) {
		produitDao.ajouter(produit);
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
