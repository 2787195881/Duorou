package org.fkit.duorou.service;

import java.util.List;

import org.fkit.duorou.domain.Goods;

public interface CartService {
List<Goods> showcart(String username);
void deleteCart(String id,String username);
}
