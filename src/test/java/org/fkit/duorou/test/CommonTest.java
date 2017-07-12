package org.fkit.duorou.test;

import org.fkit.duorou.controller.AddgoodsController;
import org.fkit.duorou.controller.UserController;
import org.fkit.duorou.domain.User;
import org.fkit.duorou.mapper.UserMapper;
import org.fkit.duorou.service.AddgoodsService;
import org.fkit.duorou.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.ModelAndViewAssert;
import org.springframework.web.servlet.ModelAndView;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@WebAppConfiguration
//@Transactional(transactionManager="transactionManager")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextHierarchy({
	@ContextConfiguration(locations={"classpath*:applicationContext.xml"}),
	@ContextConfiguration(locations={"classpath*:springmvc-config.xml"})
})
public class CommonTest {
@Autowired
private UserService userService;
//@Autowired
//private UserController userController;
	//private AddgoodsController addgoodsController;
@Test
public void testUser(){
	  //userService.login("1", "123456");
      //User user=userMapper.findUsernameAndPasd("1", "123456") ;
      System.out.println(userService);

    
	
}

}
