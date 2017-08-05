package fr.adaming.dao;

import java.util.Collection;

public interface IGeneriqueDao<T> {

	public void ajouter(T t);
	public Collection<T> obtenirTous();
	public void modifier(T t);
	public void supprimer(int id);
	public T obtenirUn(int id);
	
}
