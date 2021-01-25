package ltd.newbee.mall.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import ltd.newbee.mall.api.vo.NewBeeMallUserAddressVO;
import ltd.newbee.mall.entity.MallUserAddress;
import ltd.newbee.mall.util.BeanUtil;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class NewBeeMallUserAddressServiceTest {

    @Autowired
    private NewBeeMallUserAddressService addressService;

    /**
     * 获取默认收货地址
     */
    @Test
    void getMyDefaultAddressByUserId() {

        List<MallUserAddress> list = addressService.list(new LambdaQueryWrapper<MallUserAddress>()
                .eq(MallUserAddress::getUserId, 7L)
                .eq(MallUserAddress::getDefaultFlag, 1)
                .last("limit  " + 1));
        Assert.assertNull(list);
    }


    /**
     * 测试对象复制
     */
    @Test
    public void test_copyUserAddress() {
        MallUserAddress mallUserAddressById = addressService.getMallUserAddressById(1L);
        NewBeeMallUserAddressVO newBeeMallUserAddressVO = new NewBeeMallUserAddressVO();
        BeanUtil.copyProperties(mallUserAddressById, newBeeMallUserAddressVO);
        Assert.assertNull(newBeeMallUserAddressVO);
    }
}