package fr.adaming.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.CategorieDaoImpl;
import fr.adaming.entite.Categorie;

@Service("categorieServiceBean")
@Transactional
public class CategorieService implements IGeneriqueService<Categorie>{

	@Autowired
	private CategorieDaoImpl categorieDao;
	/**
	 * @param categorieDao the categorieDao to set
	 */
	public void setCategorieDao(CategorieDaoImpl categorieDao) {
		this.categorieDao = categorieDao;
	}
	

	@Override
	public void ajouter(Categorie categorie) {
		categorieDao.ajouter(categorie);
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
