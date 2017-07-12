package org.fkit.duorou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.duorou.domain.Goods;
import org.fkit.duorou.domain.Order;

public interface ManageMapper {

	
	@Select("select * from tb_goods where typeid='001'")
	List<Goods> findAlltshirts();
	
	@Select("select * from tb_goods where typeid='002'")
	List<Goods> findAlldress();
	
	@Select("select * from tb_goods where typeid='003'")
	List<Goods> findAllpants();
	
	@Insert("insert into tb_goods(goodsid,dipect,price,amount,typeid,image)values(#{goodsid},#{dipect},#{price},#{amount},#{typeid},#{image})")
	void addThisitem(@Param("goodsid") String goodsid,
			@Param("dipect") String dipect,
			@Param("price") Double price,
			@Param("amount") Integer amount,
			@Param("typeid") String typeid,
			@Param("image") String image);
	
	
	@Delete("delete from tb_goods where goodsid=#{id}")
	 void deleteThisitem(@Param("id") String goodsid);
	
	@Select("select * from tb_goods where goodsid=#{id}")
	Goods getThisitem(@Param("id") String goodsid);


	@Update("update tb_goods set dipect=#{dipect},price=#{price},amount=#{amount},typeid=#{typeid},image=#{image} where goodsid=#{goodsid}")
	void updateThisitem(@Param("goodsid") String goodsid,
			@Param("dipect") String dipect,
			@Param("price") Double price,
			@Param("amount") Integer amount,
			@Param("typeid") String typeid,
			@Param("image") String image);

	@Select("select * from tb_order")
	List<Order> findAllorders();

	@Delete("delete from tb_order where orderid=#{id}")
	void delteThisorder(@Param("id") Integer orderid);
}
