package fr.adaming.service;

import java.util.Collection;

public interface IGeneriqueService<T> {

	public void ajouter(T t);
	public Collection<T> obtenirTous();
	public boolean modifier(T t);
	public boolean supprimer(T t);
	public T obtenirUn(int id);
	
}
