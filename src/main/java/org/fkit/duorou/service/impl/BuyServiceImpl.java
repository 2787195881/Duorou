package org.fkit.duorou.service.impl;

import org.fkit.duorou.mapper.BuyMapper;

import org.fkit.duorou.service.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("buyService")
public class BuyServiceImpl implements BuyService{
	@Autowired
	private BuyMapper buyMapper;
	
	@Override
	public void inOrder(String image,String goodsid,
			String dipect,	Double price,
			Integer number, Double totalprice,String username,
			String address,String phone) {
		 buyMapper.insertOrder(image,goodsid,dipect,price,number,totalprice,username,address,phone);
	}
	


}
