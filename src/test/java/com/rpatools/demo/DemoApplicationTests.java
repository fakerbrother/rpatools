package com.rpatools.demo;

import com.rpatools.demo.entity.Tool;
import com.rpatools.demo.mapper.ToolMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private ToolMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<Tool> userList = userMapper.selectList(null);
        Assertions.assertEquals(1, userList.size());
        userList.forEach(System.out::println);
    }

}
