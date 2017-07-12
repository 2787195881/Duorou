package org.fkit.duorou.service.impl;

import java.util.List;

import org.fkit.duorou.domain.Goods;
import org.fkit.duorou.domain.Order;
import org.fkit.duorou.mapper.ManageMapper;
import org.fkit.duorou.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("manageService")
public class ManageServiceImpl implements ManageService{
	@Autowired
	private ManageMapper manageMapper;
	
	@Override
	public List<Goods>getAlltshirts() {
		
		return manageMapper.findAlltshirts();
}

	@Override
	public List<Goods>getAlldress() {
		
		return manageMapper.findAlldress();
}
	
	@Override
	public List<Goods>getAllpants() {
		
		return manageMapper.findAllpants();
}
	
	@Override
	public void addNewitem(String goodsid,String dipect,Double price,Integer amount,String typeid, String image) {
		
		 manageMapper.addThisitem(goodsid,dipect,price,amount,typeid,image);
}

	@Override
	public void deleteItem(String id) {
		
		 manageMapper.deleteThisitem(id);
}
	
	@Override
	public Goods getThisitem(String id) {
		
		return manageMapper.getThisitem(id);
}
	
	@Override
	public void updateitem(String goodsid,String dipect,Double price,Integer amount,String typeid, String image ){
		
		manageMapper.updateThisitem(goodsid,dipect,price,amount,typeid,image);
}
	
	@Override
	public List<Order>getAllorders() {
		
		return manageMapper.findAllorders();
}
 public void deleteOrder(Integer id){
	 manageMapper.delteThisorder(id);
 }
}
