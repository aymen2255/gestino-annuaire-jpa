package fr.treeptik.runtime;

import java.util.ArrayList;
import java.util.List;

import fr.treeptik.pojo.Contact;
import fr.treeptik.pojo.Numero;
import fr.treeptik.pojo.Type;
import fr.treeptik.service.ServiceFactory;

public class Main {

	public static void main(String[] args) {
		Type type = new Type(null,"Mobile");
		ServiceFactory.getTypeService().create(type);
		//createContact();

	}
	public static void createContact(){
		
		List<Numero>numeros = new ArrayList<Numero>();
		List<Type> types = ServiceFactory.getTypeService().findAll();
		
		Numero n1 = new Numero();
		n1.setTel("111111");
		n1.setType(types.get(1));
		numeros.add(n1);
		
		Numero n2 = new Numero();
		n2.setTel("22222");
		n2.setType(types.get(2));
		numeros.add(n2);
		
		Contact contact = new Contact(null, "aaa", "aaa", numeros);
		ServiceFactory.getContactService().create(contact, numeros);
		
	}

}
