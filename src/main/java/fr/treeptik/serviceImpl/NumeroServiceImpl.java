package fr.treeptik.serviceImpl;

import fr.treeptik.dao.DAOFactory;
import fr.treeptik.jpaUtil.JPAUtil;
import fr.treeptik.pojo.Numero;
import fr.treeptik.pojo.Type;
import fr.treeptik.service.NumeroService;

public class NumeroServiceImpl implements NumeroService{

	@Override
	public Numero create(Numero numero, Type type) {
		JPAUtil.beginTX();
		DAOFactory.getNumeroDAO().create(numero);
		numero.setType(type);
		JPAUtil.commitTX();
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

	@Override
	public Numero create(Numero obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
