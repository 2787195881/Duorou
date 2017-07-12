package org.fkit.duorou.service.impl;

import java.util.List;

import org.fkit.duorou.domain.Goods;
import org.fkit.duorou.mapper.CartMapper;
import org.fkit.duorou.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("cartService")
public class CartServiceImpl implements CartService{
	@Autowired
	private CartMapper cartMapper;
	
	@Transactional(readOnly=true)
	@Override
	public List<Goods> showcart(String username) {
		return  cartMapper.mycart(username);
	}
	@Override
	public void deleteCart(String id,String username) {
		  cartMapper.deletemycart(id,username);
	}
}
