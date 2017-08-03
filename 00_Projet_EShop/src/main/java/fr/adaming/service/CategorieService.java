package fr.adaming.service;

import java.util.List;

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
	public List<Categorie> obtenirTous() {
		return categorieDao.obtenirTous();
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
	public Categorie obtenirUn(int id) {
		// TODO Auto-generated method stub
		return null;
	}



	
	
}
