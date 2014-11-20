package fr.treeptik.dao;

public interface GenericDAO <T, PK>{
	T create(T obj);
	T update(T obj);
	void delete(T obj);
	T find(PK id);
}
