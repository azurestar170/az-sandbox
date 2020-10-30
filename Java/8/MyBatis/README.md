mybatis可以自动映射对象，需要有列名
先按ResultMap来映射，再自动映射
如果配置`map-underscore-to-camel-case: true`的话会自动转换下划线列名为Java驼峰式名称