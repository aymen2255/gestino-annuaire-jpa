package fr.treeptik.serviceImpl;

import java.util.List;

import fr.treeptik.dao.DAOFactory;
import fr.treeptik.dao.TypeDAO;
import fr.treeptik.jpaUtil.JPAUtil;
import fr.treeptik.pojo.Contact;
import fr.treeptik.pojo.Numero;
import fr.treeptik.service.ContactService;

public class ContactServiceImpl implements ContactService {

	
	@Override
	public Contact create(Contact contact) {
		return null;
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
		Contact contact = DAOFactory.getContactDAO().find(id);
		
		return contact;
	}

	@Override
	public Contact create(Contact contact, List<Numero> numeros) {
		JPAUtil.beginTX();
		DAOFactory.getContactDAO().create(contact);

		for (Numero numero : numeros) {
			numero.setContact(contact);
			DAOFactory.getNumeroDAO().create(numero);
		}

		JPAUtil.commitTX();
		return contact;
	}

}
