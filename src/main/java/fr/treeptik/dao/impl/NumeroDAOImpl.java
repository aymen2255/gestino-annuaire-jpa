package fr.treeptik.dao.impl;

import fr.treeptik.dao.NumeroDAO;
import fr.treeptik.jpaUtil.JPAUtil;
import fr.treeptik.pojo.Numero;

public class NumeroDAOImpl implements NumeroDAO{

	@Override
	public Numero create(Numero numero) {
		JPAUtil.getEntityManager().persist(numero);
		return null;
	}

	@Override
	public Numero update(Numero obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Numero obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Numero find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
