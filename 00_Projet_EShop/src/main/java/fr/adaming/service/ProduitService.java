package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IGeneriqueDao;
import fr.adaming.dao.ProduitDaoImpl;
import fr.adaming.entite.Categorie;
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
	public void modifier(Produit produit) {
		produitDaoImpl.modifier(produit);
	}

	@Override
	public void supprimer(Produit produit) {
		produitDaoImpl.supprimer(produit);
	}

	@Override
	public Produit obtenirUn(int id) {
		return produitDaoImpl.obtenirUn(id);
	}


	@Override
	public List<Produit> obtenirTousProduitsParCategorie(Categorie t) {
		
		List<Produit> lProduits = (List<Produit>) produitDaoImpl.obtenirTous();
		
		for (Produit p : lProduits){
			System.out.println(p.getCategorie());
		}
		return null;
	}


	@Override
	public void ajouterProduitParCatégorie(Produit p, Categorie c) {
		// TODO Auto-generated method stub
		
	}


	

	
	
}
