package org.fkit.duorou.service;

import java.util.List;

import org.fkit.duorou.domain.Goods;



public  interface AddgoodsService {

	 List<Goods>getAllTshirts(String id);
	 List<Goods>getAllDress(String id);
	 List<Goods>getAllPants(String id);
}
