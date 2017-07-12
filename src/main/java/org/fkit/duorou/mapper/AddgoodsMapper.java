package org.fkit.duorou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.duorou.domain.Goods;

public interface AddgoodsMapper {

	@Select("select * from tb_goods where typeid=#{id}")
	List<Goods> findTshirts(@Param("id") String id);
	
	@Select("select * from tb_goods where typeid=#{id}")
	List<Goods> findDress(@Param("id") String id);
	
	@Select("select * from tb_goods where typeid=#{id}")
	List<Goods> findPants(@Param("id") String id);
}
