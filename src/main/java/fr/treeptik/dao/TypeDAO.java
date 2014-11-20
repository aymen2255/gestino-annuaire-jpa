package fr.treeptik.dao;

import java.util.List;

import fr.treeptik.pojo.Type;

public interface TypeDAO extends GenericDAO<Type, Integer>{
	List<Type> findAll();
   
}
