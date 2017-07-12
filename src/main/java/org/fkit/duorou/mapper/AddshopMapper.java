package org.fkit.duorou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.duorou.domain.Collection;
import org.fkit.duorou.domain.Goods;
import org.fkit.duorou.domain.Remark;

public interface AddshopMapper {
	
	@Select("select * from tb_goods where goodsid=#{id}")
	Goods goods(@Param("id") String goodsid);
	
	@Select("select * from tb_remarks where goodsid=#{id}")
	List<Remark> findAllAboutThisgoods(@Param("id") String goodsid);
	
	@Select("select * from tb_collections where goodsid=#{id} and username=#{username}")
	Collection collection(@Param("id") String goodsid,@Param("username") String username);
	
	@Insert("insert into tb_remarks(username,goodsid,comment) values(#{username},#{id},#{comment})")
	void insertRemark(@Param("username")String username,
				  @Param("id") String goodsid,
				  @Param("comment") String comment);
	
	@Insert("insert into tb_collections(username,goodsid)values(#{username},#{id})")
	void insertCollect( @Param("username") String username,
				  @Param("id") String goodsid);
	
	@Select("select * from tb_cart where goodsid=#{id} and username=#{username}")
	Goods checkcartid(@Param("id") String goodsid,@Param("username") String username);
	
	@Insert("insert into tb_cart(goodsid,amount,username)values(#{goodsid},#{amount},#{username})")
	void insertCart( @Param("goodsid") String goodsid,				
					@Param("amount") Integer amount,
				@Param("username") String username);

//	@Update(" update tb_cart set amount=#{amount} where goodsid=#{goodsid}")
//	void updateCart(
//			@Param("goodsid") String goodsid,				
//			@Param("amount") Integer amount);
//			

}
