package org.fkit.duorou.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.duorou.domain.Manager;
import org.fkit.duorou.domain.User;

public interface UserMapper {

	@Insert("insert into tb_user(username,password,email,phone) values(#{username},#{password},#{email},#{phone})")
	void insertUser(@Param("username")String username,
				  @Param("password") String password,
				  @Param("email") String email,
				  @Param("phone") String phone);
	@Select("select* from tb_user where username=#{username} and password=#{password}")
	User findUsernameAndPasd(@Param("username")String username,@Param("password")String password);
	
	@Select("select* from tb_manager where mgname=#{username} and mgpassword=#{password}")
	Manager findManager(@Param("username")String mgname,@Param("password")String mgpassword);
	@Update("update tb_user set password=#{newpwd} where username=#{username}")
	void alterpwd(@Param("newpwd")String password, @Param("username") String username);

}
