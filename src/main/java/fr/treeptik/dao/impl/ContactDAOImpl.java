package fr.treeptik.dao.impl;

import fr.treeptik.dao.ContactDAO;
import fr.treeptik.jpaUtil.JPAUtil;
import fr.treeptik.pojo.Contact;

public class ContactDAOImpl implements ContactDAO {

	@Override
	public Contact create(Contact contact) {
		JPAUtil.getEntityManager().persist(contact);
		return contact;
	}

	@Override
	public Contact update(Contact obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Contact obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Contact find(Integer id) {
		Contact contact = JPAUtil.getEntityManager().find(Contact.class, id);
		return contact;
	}

	

}
