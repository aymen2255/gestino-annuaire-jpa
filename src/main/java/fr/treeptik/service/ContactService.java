package fr.treeptik.service;

import java.util.List;

import fr.treeptik.pojo.Contact;
import fr.treeptik.pojo.Numero;

public interface ContactService extends GenericService<Contact, Integer>{
	Contact create(Contact contact, List<Numero> numeros);
}
