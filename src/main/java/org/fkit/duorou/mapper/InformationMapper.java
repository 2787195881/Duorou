package org.fkit.duorou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.duorou.domain.Goods;
import org.fkit.duorou.domain.Order;
import org.fkit.duorou.domain.User;

public interface InformationMapper {
@Select("select * from tb_user where username=#{username}")
User myself(@Param ("username") String username);

@Select("select tb_goods.image,tb_goods.dipect,tb_goods.price,tb_collections.goodsid from tb_goods,tb_collections where username=#{username} and tb_collections.goodsid=tb_goods.goodsid")
List<Goods> getAllCollection(@Param ("username") String username);

@Select("select * from tb_order where username=#{username}")
List<Order> getAllOrder(@Param ("username") String username);

@Delete("delete from tb_collections where username=#{username} and goodsid=#{id}")
void deleteThisCollection(@Param ("username") String username,
		@Param ("id") String goodsid);
}
