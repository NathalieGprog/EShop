package fr.adaming.dao;

import java.util.Collection;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.entite.Client;

@Repository
public class ClientDaoImpl implements IGeneriqueDao<Client>{

	@Autowired
	private SessionFactory sf;
	/**
	 * @param sf the sf to set
	 */
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	@Override
	public void ajouter(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client obtenirTous() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modifier(Client client) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean supprimer(Client client) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection<Client> obtenirUn(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
