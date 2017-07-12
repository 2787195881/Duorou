package org.fkit.duorou.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface BuyMapper {

	@Insert("insert into tb_order(image,goodsid,dipect,price,number,totalprice,username,address,phone)values(#{image},#{goodsid},#{dipect},#{price},#{number},#{totalprice},#{username},#{address},#{phone})")
	void insertOrder(@Param("image")String image,
				  @Param("goodsid") String goodsid,
				  @Param("dipect") String dipect,
				  @Param("price") Double price,
				  @Param("number") Integer number,
				  @Param("totalprice") Double totalprice,
				  @Param("username") String username,
				  @Param("address") String address,
				  @Param("phone") String phone);
}
