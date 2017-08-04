package fr.adaming.service;

import java.util.Collection;

import fr.adaming.entite.Categorie;

public interface ICategorieService extends IGeneriqueService<Categorie> {
	public void ajouter(Categorie t);

	public Collection<Categorie> obtenirTous();

	public boolean modifier(Categorie t);

	public boolean supprimer(Categorie t);

	public Categorie obtenirUn(int id);
}
