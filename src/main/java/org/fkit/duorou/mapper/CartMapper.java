package org.fkit.duorou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.duorou.domain.Goods;

public interface CartMapper {
@Select ("select tb_goods.image ,tb_goods.price,tb_goods.dipect,tb_cart.amount,tb_cart.goodsid from tb_goods,tb_cart where tb_cart.username=#{username} and tb_cart.goodsid=tb_goods.goodsid")
 List<Goods> mycart(@Param("username") String username);

@Delete("delete from tb_cart where goodsid=#{id} and username=#{username}")
 void deletemycart(@Param("id") String goodsid,@Param("username") String username);
}
