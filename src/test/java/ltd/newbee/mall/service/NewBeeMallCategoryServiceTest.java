package ltd.newbee.mall.service;

import ltd.newbee.mall.api.vo.NewBeeMallIndexCategoryVO;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 分类测试
 */
@SpringBootTest
@RunWith(SpringRunner.class)
class NewBeeMallCategoryServiceTest {


    @Autowired
    private NewBeeMallCategoryService currArticleService;

    @Test
    void getCategoriesForIndex() {
        List<NewBeeMallIndexCategoryVO> forIndex = currArticleService.getCategoriesForIndex();
    }
}