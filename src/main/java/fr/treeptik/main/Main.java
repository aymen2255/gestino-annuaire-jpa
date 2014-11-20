package fr.treeptik.main;

import java.util.ArrayList;
import java.util.List;

import fr.treeptik.pojo.Contact;
import fr.treeptik.pojo.Numero;
import fr.treeptik.pojo.Type;
import fr.treeptik.service.ServiceFactory;


public class Main {

	public static void main(String[] args) {
	//addContact();
	findContactById(1);
		
	}
	public static void addContact(){
		List<Type> findAllType = ServiceFactory.getTypeService().findAll();
		Type type = findAllType.get(0);
		List<Numero> numeros = new ArrayList<Numero>();
		Numero numero1=new Numero();
		numero1.setTel("11111");
		numero1.setType(type);
		numeros.add(numero1);
		Contact contact = new Contact(null, "aaa", "aaaaaaa", numeros);
		ServiceFactory.getContactService().create(contact, numeros);
		
	}
	public static Contact findContactById(Integer id){
		Contact contact = ServiceFactory.getContactService().find(id);
		System.out.println(contact.getNom());
		List<Numero> contactNumeros = contact.getNumeros();
		for (Numero numero : contactNumeros) {
			System.out.println(numero.getType().getType() + ": " + numero.getTel());
			
		}
		return contact;
		
	}

}
