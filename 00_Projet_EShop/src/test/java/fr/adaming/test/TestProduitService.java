package fr.adaming.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fr.adaming.dao.IGeneriqueDao;
import fr.adaming.entite.Categorie;
import fr.adaming.entite.Produit;
import fr.adaming.service.ICategorieService;
import fr.adaming.service.IProduitService;

public class TestProduitService {
	
	private IProduitService produitService;
	private IGeneriqueDao<Produit> pDao;
	private Produit produit1 ;
	private Produit produit2 ;
	private Produit produit3 ;
	private Produit produit4 ;
	private Produit produit5 ;
	private Produit produit6 ;
	private Produit produit7 ;
	private Produit produit8 ;
	private Produit produit9 ;
	private Produit produit10 ;
	private List<Produit> lProduits1;
	private List<Produit> lProduits2;
	private List<Produit> lProduits3;
	
	private ICategorieService categorieService;
	private IGeneriqueDao<Categorie> cDao;
	private Categorie categorie1 ;
	private Categorie categorie2 ;
	private Categorie categorie3 ;
	private Categorie categorie4 ;
	private Categorie categorie5 ;
	

	public void initObjet(){
		System.out.println("coucou");
		produit1 = new Produit("Io", "couleur souffre", 10000000, 1, false);
		produit2 = new Produit("Europe", "couleur souffre", 10000000, 1, false);
		produit3 = new Produit("Ganym�de", "couleur souffre", 10000000, 1, false);
		produit4 = new Produit("Callisto", "couleur souffre", 10000000, 1, false);
		produit5 = new Produit("Lune", "couleur argent�", 10000000, 1, false);
		produit6 = new Produit("Jupiter", "gazeuse", 100000000, 1, false);
		produit7 = new Produit("Mars", "couleur rouille", 500000000, 1, false);
		produit8 = new Produit("Saturne", "pourvu de magnifique anneaux", 40000000, 1, false);
		produit9 = new Produit("Soleil", "naine jaune", 1000000000, 1, false);
		produit10 = new Produit("Vega", "g�ante bleu", 2000000000, 1, false);
		
		categorie1 = new Categorie("Plan�te","Corps c�leste de taille moyenne");
		categorie2 = new Categorie("Satellite","Corps c�leste de petite taille");
		categorie3 = new Categorie("Etoile","Corps c�leste abritant des r�actions thermonucl�aires");
		
		lProduits1.add(produit1);
		lProduits1.add(produit2);
		lProduits1.add(produit3);
		lProduits1.add(produit4);
		lProduits1.add(produit5);
		
		lProduits2.add(produit6);
		lProduits2.add(produit7);
		lProduits2.add(produit8);
		
		lProduits3.add(produit9);
		lProduits3.add(produit10);
		
		categorie1.setlProduits(lProduits1);
		categorie2.setlProduits(lProduits2);
		categorie3.setlProduits(lProduits3);
		
		cDao.ajouter(categorie1);
		cDao.ajouter(categorie2);
		cDao.ajouter(categorie3);
		
		pDao.ajouter(produit1);
		pDao.ajouter(produit2);
		pDao.ajouter(produit3);
		pDao.ajouter(produit4);
		pDao.ajouter(produit5);
		pDao.ajouter(produit6);
		pDao.ajouter(produit7);
		pDao.ajouter(produit8);
		pDao.ajouter(produit9);
		pDao.ajouter(produit10);
	}
	
	@Test
	public void obtenirTousProduitsParCategorieTest(){
		Produit p1 = pDao.obtenirUn(1);
		assertEquals(produit1, p1);
		
	}
	
}
