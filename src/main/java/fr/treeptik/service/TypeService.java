package fr.treeptik.service;

import java.util.List;

import fr.treeptik.pojo.Type;

public interface TypeService extends GenericService<Type, Integer> {
	List<Type> findAll();
}
