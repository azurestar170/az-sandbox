package name.az170.sandbox.mybatis.mapper;

import name.az170.sandbox.mybatis.model.TestTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface TestMapper {
//    @Select("select * from test_table")
    @Select("select key_column, test_column_aa, test_column_ab, test_column_ac from test_table")
    @ResultMap("BaseResultMap")
    public List<TestTable> selectToObject();

    @Select("select * from test_table")
    public List<TestTable> selectAllToObject();

    @Select("select * from test_table")
    @ResultMap("PartialResultMap")
    public List<TestTable> selectAllToObjectB();

    @Select("select * from test_table")
    public List<Map<String, Object>> selectToMap();

    @Select("select 1, 'Aa' as test_column_aa, 'Bb', 'Cc'")
    public List<TestTable> selectConstantsToObject();

    @Select("select 1, 'Aa', 'Bb', 'Cc'")
    public List<Map<String, Object>> selectConstantsToMap();
}
