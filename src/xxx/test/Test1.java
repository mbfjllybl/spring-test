package xxx.test;


import org.junit.Test;
import org.junit.jupiter.api.DynamicTest;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //单元框架测试版本
@ContextConfiguration("classpath:bean.xml") //加载配置文件
public class Test1 {
    @Autowired
    @Qualifier("user1")
    io.github.mbfjllybl.User user;

    @Test
    public void add() {
        System.out.println(user);
    }

}
