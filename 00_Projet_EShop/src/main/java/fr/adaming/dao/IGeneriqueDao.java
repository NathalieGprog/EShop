package fr.adaming.dao;

import java.util.Collection;

public interface IGeneriqueDao<T> {

	public boolean ajouter(T t);
	public T obtenirTous();
	public boolean modifier(T t);
	public boolean supprimer(T t);
	public Collection<T> obtenirUn(int id);
	
}
