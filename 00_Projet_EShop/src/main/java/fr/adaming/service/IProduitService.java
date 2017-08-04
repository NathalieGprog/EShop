package fr.adaming.service;

import java.util.Collection;

import fr.adaming.entite.Produit;

public interface IProduitService extends IGeneriqueService<Produit> {
	public void ajouter(Produit t);
	public Collection<Produit> obtenirTous();
	public boolean modifier(Produit t);
	public boolean supprimer(Produit t);
	public Produit obtenirUn(int id);
}
