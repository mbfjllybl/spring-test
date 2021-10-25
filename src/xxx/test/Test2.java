package xxx.test;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:bean.xml") //加载配置文件
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class Test2 {
    @Autowired
    @Qualifier("user1")
    io.github.mbfjllybl.User user;

    @Test
    public void add() {
        System.out.println(user);
    }

}
