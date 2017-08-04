package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IGeneriqueDao;
import fr.adaming.dao.ProduitDaoImpl;
import fr.adaming.entite.Produit;

@Service("produitServiceBean")
@Transactional
public class ProduitService implements IProduitService {

	@Autowired
	private IGeneriqueDao<Produit> produitDaoImpl;
	/**
	 * @param produitDao the produitDao to set
	 */
	public void setProduitDao(ProduitDaoImpl produitDao) {
		this.produitDaoImpl = produitDao;
	}
	

	@Override
	public void ajouter(Produit produit) {
		produitDaoImpl.ajouter(produit);
	}

	@Override
	public List<Produit> obtenirTous() {
		return (List<Produit>) produitDaoImpl.obtenirTous();
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
