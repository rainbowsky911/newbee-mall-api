package ltd.newbee.mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import ltd.newbee.mall.entity.Carousel;
import ltd.newbee.mall.service.NewBeeMallCarouselService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class NewBeeMallCarouselServiceImplTest {

    @Autowired
    private NewBeeMallCarouselService carouselService;

    /**
     * 轮播图查询
     */
    @Test
    void getCarouselsForIndex() {
        List<Carousel> carouselList = carouselService.list
                (new LambdaQueryWrapper<Carousel>()
                        .orderByDesc(Carousel::getCarouselRank));

        carouselList.stream().limit(5).forEach(e->{
            System.out.println(e);
        });


    }
}