package fr.treeptik.dao.impl;

import org.junit.Assert;
import org.junit.Test;

import fr.treeptik.dao.DAOFactory;
import fr.treeptik.dao.TypeDAO;
import fr.treeptik.jpaUtil.JPAUtil;
import fr.treeptik.pojo.Type;

public class TestTypeDAOImpl {

	//@Test
	public void shouldSaveType() {

		TypeDAO typeDAO = DAOFactory.getTypeDAO();
		Type type = new Type(null, "llll");
		try {
			JPAUtil.beginTX();
			type = typeDAO.create(type);
			JPAUtil.commitTX();
			Assert.assertNotNull(type);
			Assert.assertNotNull(type.getId());

		} catch (Exception e) {
			Assert.fail("type vide!");
			e.printStackTrace();
		}
	}

	@Test
	public void shouldSaveNullType() {

		TypeDAO typeDAO = DAOFactory.getTypeDAO();
		Type type = new Type(null, "");
		try {
			JPAUtil.beginTX();
			type = typeDAO.create(type);
			JPAUtil.commitTX();
			Assert.assertNull(type.getId());
			Assert.assertEquals("", type.getType());
			

		} catch (Exception e) {
			//Assert.fail("type vide!");
			e.printStackTrace();
		}
	}
}
