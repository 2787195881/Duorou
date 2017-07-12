package org.fkit.duorou.service;

import java.util.List;

import org.fkit.duorou.domain.Collection;
import org.fkit.duorou.domain.Goods;
import org.fkit.duorou.domain.Remark;

public interface AddshopService {
	List<Remark> getAllAboutThisgoods( String id);
	Goods goods(String id);
	Collection collection(String id,String username);
	void inRemark(String username,String id,String conmment);
	void inCollect(String id,String username);
	Goods checkcart(String id,String username);
	void inCart(String goodsid,Integer amount,String username);
//	void updateCart(String goodsid,Integer amount);
}
