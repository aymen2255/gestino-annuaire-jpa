package fr.treeptik.serviceImpl;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Test;

import fr.treeptik.dao.TypeDAO;
import fr.treeptik.dao.impl.TypeDAOImpl;
import fr.treeptik.pojo.Type;
import fr.treeptik.service.ServiceFactory;
import fr.treeptik.service.TypeService;

public class TestTypeServiceImpl {
	@Test
	public void shouldSaveType(){
		
//		TypeDAO typeDAO = EasyMock.createMock(null);
//
//		Voiture voitureMock = new Voiture(12, "AUDI", "A4");
//		Voiture v = new Voiture(null, "AUDI", "A4");
//		
//		EasyMock.expect(voitureDAO.save(v)).andReturn(voitureMock);
//		EasyMock.replay(voitureDAO);
//		
//		VoitureService service = new VoitureService();
//		
//		setProperty("dao", voitureDAO, service);
//		
//		
//		v = service.save(v);
//		Assert.assertNotNull(v);
//		Assert.assertEquals(new Integer(12), v.getId());
		
		TypeDAO typeDAO = EasyMock.createMock(TypeDAO.class);
		Type typeMock = new Type(10, "pppp");
		Type type = new Type(null, "pppp");
		EasyMock.expect(typeDAO.create(type)).andReturn(typeMock);
		EasyMock.replay(typeDAO);
		//TypeService service = ServiceFactory.getTypeService();
		TypeServiceImpl service = new TypeServiceImpl();
		service.setDao(typeDAO);
		//setProperty("dao", typeDAO, service);
		
		type = service.create(type);
		Assert.assertNotNull(type);System.out.println(type.getId());
		assertEquals(new Integer(10), type.getId());
		//Assert.assertFalse(type.getId()==10);
		
		
		
	}
	private void setProperty(String propertyName, Object value, Object obj){
		try {
			Field fieldDAO = obj.getClass().getDeclaredField(propertyName);
			fieldDAO.setAccessible(true);
			fieldDAO.set(obj, value);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
