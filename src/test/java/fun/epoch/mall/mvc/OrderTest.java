package fun.epoch.mall.mvc;

import fun.epoch.mall.mvc.common.CustomMvcTest;
import org.junit.Before;

import static fun.epoch.mall.common.Constant.AccountRole.CONSUMER;
import static fun.epoch.mall.mvc.common.Keys.MockSqls.COMMON_SQLS;
import static fun.epoch.mall.mvc.common.Keys.MockSqls.ORDER_SQLS;
import static fun.epoch.mall.mvc.common.Keys.Tables.*;
import static fun.epoch.mall.mvc.common.Keys.UserKeys.userId;

public class OrderTest extends CustomMvcTest {
    @Before
    public void setup() {
        this.init().session(userId, CONSUMER)
                .database(COMMON_SQLS, ORDER_SQLS)
                .launchTable(order, order_item, cart_item, product, shipping);
    }
}
