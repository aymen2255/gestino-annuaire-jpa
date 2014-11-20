package fr.treeptik.service;

import fr.treeptik.serviceImpl.ContactServiceImpl;
import fr.treeptik.serviceImpl.TypeServiceImpl;

public class ServiceFactory {
	
	public static TypeService getTypeService() {
		return new TypeServiceImpl();
	}
	public static ContactService getContactService() {
		return new ContactServiceImpl();
	}
	
}
