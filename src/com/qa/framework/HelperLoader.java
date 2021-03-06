package com.qa.framework;


import com.library.common.ClassHelper;
import com.qa.framework.ioc.IocContainer;
import com.qa.framework.ioc.IocHelper;

/**
 * 加载相应的 Helper 类
 */
public final class HelperLoader {

    /**
     * Init.
     */
    public static void init() {
        // 定义需要加载的 Helper 类
        Class<?>[] classList = {
                IocContainer.class,
                IocHelper.class,
        };
        // 按照顺序加载类
        for (Class<?> cls : classList) {
            ClassHelper.loadClass(cls.getName());
        }
    }
}
