package fr.adaming.service;

import java.util.Collection;
import java.util.List;

import fr.adaming.entite.Categorie;

public interface ICategorieService extends IGeneriqueService<Categorie> {
	public void ajouter(Categorie t);

	public Collection<Categorie> obtenirTous();

	public void modifier(Categorie t);

	public void supprimer(Categorie t);

	public Categorie obtenirUn(int id);


}
