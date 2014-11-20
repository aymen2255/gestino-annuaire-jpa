package fr.treeptik.service;

public interface GenericService  <T, PK>{
	T create(T obj);
	T update(T obj);
	void delete(T obj);
	T find(PK id);
	//T findAll();
}
