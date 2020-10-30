package name.az170.sandbox.mybatis;

import name.az170.sandbox.mybatis.mapper.TestMapper;
import name.az170.sandbox.mybatis.model.TestTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TestController {
    @Autowired
    private TestMapper testMapper;

    @RequestMapping("/")
    public String index() {
        List<TestTable> objList = testMapper.selectToObject();
        List<Map<String, Object>> mapList = testMapper.selectToMap();
        List<TestTable> list = testMapper.selectAllToObject();
        List<TestTable> listB = testMapper.selectAllToObjectB();

        List<TestTable> list2 = testMapper.selectConstantsToObject();
        List<Map<String, Object>> mapList2 = testMapper.selectConstantsToMap();

        return list.toString();
    }
}
