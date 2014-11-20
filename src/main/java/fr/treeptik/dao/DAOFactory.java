package fr.treeptik.dao;

import fr.treeptik.dao.impl.ContactDAOImpl;
import fr.treeptik.dao.impl.NumeroDAOImpl;
import fr.treeptik.dao.impl.TypeDAOImpl;

public class DAOFactory {
	
	public static TypeDAO getTypeDAO() {
		return new TypeDAOImpl();
	}
	
	public static NumeroDAO getNumeroDAO() {
		return new NumeroDAOImpl();
	}
	
	public static ContactDAO getContactDAO() {
		return new ContactDAOImpl();
	}
}
