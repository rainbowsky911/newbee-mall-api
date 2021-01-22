package ltd.newbee.mall.config;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
//@EnableTransactionManagement
@MapperScan({"ltd.newbee.mall.dao"})
public class MyBatisConfig {
   /* @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setCountSqlParser(new JsqlParserCountOptimize(true));
        return paginationInterceptor;
    }*/
}
