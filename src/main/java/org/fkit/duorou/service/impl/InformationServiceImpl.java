package org.fkit.duorou.service.impl;

import java.util.List;

import org.fkit.duorou.domain.Goods;
import org.fkit.duorou.domain.Order;
import org.fkit.duorou.domain.User;
import org.fkit.duorou.mapper.InformationMapper;
import org.fkit.duorou.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("informationService")

public class InformationServiceImpl implements InformationService{
	
	
	@Autowired
	private InformationMapper informationMapper;
	
	@Transactional(readOnly=true)
	@Override
	public User myself(String username) {
		return  informationMapper.myself(username);
	}
	
	@Override
	public List<Goods>showcollection(String username) {
		return  informationMapper.getAllCollection(username);
	}
	
	@Override
	public List<Order>showorder(String username) {
		return  informationMapper.getAllOrder(username);
	}
	
	@Override
	public void deletecollection(String username,String id) {
		 informationMapper.deleteThisCollection(username,id);
	}
}
