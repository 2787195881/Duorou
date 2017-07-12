package org.fkit.duorou.service.impl;

import java.util.List;

import org.fkit.duorou.domain.Collection;
import org.fkit.duorou.domain.Goods;
import org.fkit.duorou.domain.Remark;
import org.fkit.duorou.mapper.AddshopMapper;
import org.fkit.duorou.service.AddshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("addshopService")

public class AddshopServiceImpl implements AddshopService{
	@Autowired
	private AddshopMapper addshopMapper;
	
	@Transactional(readOnly=true)
	@Override
	public List<Remark>getAllAboutThisgoods(String id) {
		return  addshopMapper.findAllAboutThisgoods(id);
	}
	@Override
	public Goods goods(String id) {
		return  addshopMapper.goods(id);
	}
	@Override
	public void inRemark(String username ,String id ,String conmment) {
	  addshopMapper.insertRemark(username,id,conmment);
	}
	@Override
	public Collection collection(String id,String username) {
		 return addshopMapper.collection(id,username);
	}
	@Override
	public void inCollect(String id ,String username) {
	  addshopMapper.insertCollect(id,username);
	}
	
	@Override
	public Goods checkcart(String id,String username) {
	  return addshopMapper.checkcartid(id,username);
	}
	
	@Override
	public void inCart(String goodsid ,Integer amount,String username) {
	  addshopMapper.insertCart(goodsid,amount,username);
	}
	
//	@Override
//	public void updateCart(String goodsid ,Integer amount) {
//	  addshopMapper.updateCart(goodsid,amount);
//	}
}
