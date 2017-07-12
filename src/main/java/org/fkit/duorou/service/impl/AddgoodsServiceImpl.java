package org.fkit.duorou.service.impl;

import java.util.List;

import org.fkit.duorou.domain.Goods;
import org.fkit.duorou.mapper.AddgoodsMapper;
import org.fkit.duorou.service.AddgoodsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("addgoodsService")
public class AddgoodsServiceImpl implements AddgoodsService{

	@Autowired
	private AddgoodsMapper addgoodsMapper;
	
	@Override
	public List<Goods>getAllTshirts(String id) {
		// TODO Auto-generated method stub
		return addgoodsMapper.findTshirts(id);

}
	@Override
	public List<Goods>getAllDress(String id) {
		// TODO Auto-generated method stub
		return addgoodsMapper.findDress(id);

}
	@Override
	public List<Goods>getAllPants(String id) {
		// TODO Auto-generated method stub
		return addgoodsMapper.findPants(id);

}
}