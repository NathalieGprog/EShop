package fr.adaming.ManagedBean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import fr.adaming.entite.Produit;
import fr.adaming.service.IGeneriqueService;

@ManagedBean(name = "produitMB")
@RequestScoped
public class ProduitManagedBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Produit produit;
	private List<Produit> lProduits;

	@ManagedProperty(value = "#{produitServiceBean}")
	private IGeneriqueService<Produit> produitService;

	/**
	 * Constructeur vide
	 */
	public ProduitManagedBean() {
		this.produit = new Produit();
	}

	/*************************************************
	 * Setters et Getters
	 *************************************************/

	/**
	 * @param produitService
	 *            the produitService to set
	 */
	public void setProduitService(IGeneriqueService<Produit> produitService) {
		this.produitService = produitService;
	}

	/**
	 * @return the produit
	 */
	public Produit getProduit() {
		return produit;
	}

	/**
	 * @param produit
	 *            the produit to set
	 */
	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	/**
	 * @return the lProduits
	 */
	public List<Produit> getlProduits() {
		return lProduits;
	}

	/**
	 * @param lProduits
	 *            the lProduits to set
	 */
	public void setlProduits(List<Produit> lProduits) {
		this.lProduits = lProduits;
	}

	/*************************************************
	 * Les méthodes services
	 *************************************************/

	public String ajouterProduit() {
		produitService.ajouter(produit);
		// this.lProduits = produitService.obtenirTous();
		return "ajout";

	}

}
