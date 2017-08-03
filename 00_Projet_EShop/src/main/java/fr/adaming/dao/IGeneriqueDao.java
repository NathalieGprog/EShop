package fr.adaming.dao;

import java.util.Collection;

public interface IGeneriqueDao<T> {

	public void ajouter(T t);
	public Collection<T> obtenirTous();
	public boolean modifier(T t);
	public boolean supprimer(T t);
	public T obtenirUn(int id);
	
}
