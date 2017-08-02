package fr.adaming.ManagedBean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import fr.adaming.entite.Categorie;
import fr.adaming.service.IGeneriqueService;

@ManagedBean(name = "categorieMB")
@RequestScoped
public class CategorieManagedBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Categorie categorie;
	private List<Categorie> lCategories;

	@ManagedProperty(value = "#{categorieServiceBean}")
	private IGeneriqueService<Categorie> categorieService;

	/**
	 * Constructeur vide
	 */
	public CategorieManagedBean() {
		this.categorie = new Categorie();
	}

	/*************************************************
	 * Setters et Getters
	 *************************************************/

	/**
	 * @param categorieService
	 *            the categorieService to set
	 */
	public void setCategorieService(IGeneriqueService<Categorie> categorieService) {
		this.categorieService = categorieService;
	}

	/**
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}

	/**
	 * @param categorie
	 *            the categorie to set
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	/**
	 * @return the lCategories
	 */
	public List<Categorie> getlCategories() {
		return lCategories;
	}

	/**
	 * @param lCategories
	 *            the lCategories to set
	 */
	public void setlCategories(List<Categorie> lCategories) {
		this.lCategories = lCategories;
	}

	/*************************************************
	 * Les méthodes services
	 *************************************************/

	public String ajouterCategorie() {
		categorieService.ajouter(categorie);
		// this.lCategories = categorieService.obtenirTous();
		return "ajout";

	}

}
