package fr.adaming.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.entite.Categorie;
import fr.adaming.entite.Produit;

@Repository
public class ProduitDaoImpl implements IProduitDao {

	@Autowired
	private SessionFactory sf;

	/**
	 * @param sf
	 *            the sf to set
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
	public List<Produit> obtenirTous() {
		Session s = sf.getCurrentSession();
		String req = "FROM Produit";
		Query query = s.createQuery(req);
		@SuppressWarnings("unchecked")
		List<Produit> listeProduit = query.list();
		return listeProduit;
	}
	
	public Map<Produit,Categorie> obtenirCategorieDuProduit() {
		Session s = sf.getCurrentSession();
		String req = "FROM Produit";
		Query query = s.createQuery(req);
		List<Produit> listeProduits = query.list();
		
		Map<Produit,Categorie> listeProduit =new HashMap<Produit,Categorie>();

		//Iterator li = query.iterate();
		
         while (query.iterate().hasNext()) {
             Produit produit = new Produit();
             produit = (Produit) query.iterate();
             System.out.println(produit);
             Categorie categorie = produit.getCategorie();
             System.out.println(categorie);
             listeProduit.put(produit, categorie);
         }//end while 
 		return listeProduit;
	}

	@Override
	public void modifier(Produit produit) {
		Session s = sf.getCurrentSession();
		s.saveOrUpdate(produit);
	}

	@Override
	public void supprimer(Produit produit) {
		Session s =  sf.getCurrentSession();
		s.delete(produit);
	}

	@Override
	public Produit obtenirUn(int id) {
		Session s = sf.getCurrentSession();
		return (Produit) s.get(Produit.class, id);
	}

}
