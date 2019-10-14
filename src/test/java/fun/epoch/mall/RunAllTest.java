package fun.epoch.mall;

import fun.epoch.mall.controller.manage.ManageCategoryControllerTest;
import fun.epoch.mall.controller.manage.ManageProductControllerTest;
import fun.epoch.mall.controller.manage.ManageUserControllerTest;
import fun.epoch.mall.controller.portal.ProductControllerTest;
import fun.epoch.mall.controller.portal.UserControllerTest;
import fun.epoch.mall.service.CategoryServiceTest;
import fun.epoch.mall.service.ProductServiceTest;
import fun.epoch.mall.service.UserServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        UserControllerTest.class,
        ManageUserControllerTest.class,
        UserServiceTest.class,
        ManageCategoryControllerTest.class,
        CategoryServiceTest.class,
        ProductControllerTest.class,
        ManageProductControllerTest.class,
        ProductServiceTest.class
})
public class RunAllTest {
}
