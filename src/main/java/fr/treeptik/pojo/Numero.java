package fr.treeptik.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Numero {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String tel;
	@ManyToOne
	private Contact contact;
	@OneToOne
	private Type type;

	public Numero() {
		super();
	}

	public Numero(Integer id, String tel, Contact contact, Type type) {
		super();
		this.id = id;
		this.tel = tel;
		this.contact = contact;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
