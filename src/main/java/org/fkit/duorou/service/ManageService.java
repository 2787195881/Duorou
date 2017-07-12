package org.fkit.duorou.service;

import java.util.List;

import org.fkit.duorou.domain.Goods;
import org.fkit.duorou.domain.Order;

public interface ManageService {
List<Goods> getAlltshirts();

List<Goods> getAlldress();

List<Goods> getAllpants();
void addNewitem(String goodsid,String dipect,Double price,Integer amount,String typeid, String image);
void deleteItem(String id);
Goods getThisitem(String id);
void updateitem(String goodsid,String dipect,Double price,Integer amount,String typeid,String image);

List<Order> getAllorders();
void deleteOrder(Integer id);

}
