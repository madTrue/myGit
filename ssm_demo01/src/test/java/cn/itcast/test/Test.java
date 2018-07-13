package cn.itcast.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.dao.ItemDao;
import cn.itcast.domain.Item;
import cn.itcast.service.ItemService;
import cn.itcast.service.Impl.ItemServiceImpl;

public class Test {
	
public void TestDao(){
	ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	ItemDao id = ac.getBean(ItemDao.class);
	System.out.println(id.findItemById(2));
}
@org.junit.Test
public void TestService() {
	ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	ItemService bean = ac.getBean(ItemService.class);
	Item item = bean.findItemById(2);
	System.out.println(item);
}
}
