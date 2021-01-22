package ltd.newbee.mall.service;

import ltd.newbee.mall.api.param.SaveCartItemParam;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
class NewBeeMallShoppingCartServiceTest {

    @Autowired
    private  NewBeeMallShoppingCartService cartService;

    @Test
    void saveNewBeeMallCartItem() {
        SaveCartItemParam  saveCartItemParam= new SaveCartItemParam();
        saveCartItemParam.setGoodsCount(1);
        saveCartItemParam.setGoodsId(10010L);
        cartService.saveNewBeeMallCartItem(saveCartItemParam,7L);
    }

    @Test
    void updateNewBeeMallCartItem() {
    }

    @Test
    void getNewBeeMallCartItemById() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void getMyShoppingCartItems() {
    }

    @Test
    void getCartItemsForSettle() {
    }

    @Test
    void testGetMyShoppingCartItems() {
    }
}