package org.fkit.duorou.service;

import java.util.List;

import org.fkit.duorou.domain.Goods;
import org.fkit.duorou.domain.Order;
import org.fkit.duorou.domain.User;

public interface InformationService {
	User myself(String username);
	List<Goods> showcollection(String username);
	List<Order> showorder(String username);
	void deletecollection(String username,String id);
}
