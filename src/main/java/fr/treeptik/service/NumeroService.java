package fr.treeptik.service;

import fr.treeptik.pojo.Numero;
import fr.treeptik.pojo.Type;

public interface NumeroService extends GenericService<Numero, Integer>{
	Numero create(Numero numeo, Type type);
}
