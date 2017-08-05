package fr.adaming.service;

import java.util.Collection;

public interface IGeneriqueService<T> {

	public void ajouter(T t);
	public Collection<T> obtenirTous();
	public void modifier(T t);
	public void supprimer(T t);
	public T obtenirUn(int id);
	
}
