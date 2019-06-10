package com.wangjing.test;

import com.wangjing.test.dao.IUserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class TestApplicationTests {

    @Autowired
    @Qualifier("userDao2")
    private IUserDao userDao;

    @Test
    public void contextLoads() {
        userDao.hello();
    }

}
