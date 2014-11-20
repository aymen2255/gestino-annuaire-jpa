package fr.treeptik.serviceImpl;

import java.util.List;

import fr.treeptik.dao.DAOFactory;
import fr.treeptik.dao.TypeDAO;
import fr.treeptik.jpaUtil.JPAUtil;
import fr.treeptik.pojo.Type;
import fr.treeptik.service.TypeService;

public class TypeServiceImpl implements TypeService{
	private TypeDAO dao;
	
	

	public void setDao(TypeDAO dao) {
		this.dao = dao;
	}

	@Override
	public Type create(Type type) {
		JPAUtil.beginTX();
		dao.create(type);
		JPAUtil.commitTX();
		return type;
	}

	@Override
	public Type update(Type obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Type obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Type find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Type> findAll() {
		List<Type> allType = DAOFactory.getTypeDAO().findAll();
		return allType;
	}

}
