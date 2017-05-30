/**
 * Copyright: Copyright (c)2016
 * Company: 易宝支付(YeePay)
 */
package com.check.auth.g3.core.checkauth.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 类名称: SpringUtils <br>
 * 类描述: <br>
 *
 * @author suicheng.si
 * @version 1.0.0
 * @since 16/5/23 下午6:30
 */

@Component
public class SpringUtils implements ApplicationContextAware, Serializable {

        private static final long serialVersionUID = 3256424826451289619L;

        private static ApplicationContext applicationContext;

        public static ApplicationContext getApplicationContext() {
            if (applicationContext == null) {
                throw new IllegalStateException("applicationContext");
            }
            return applicationContext;
        }

        public void setApplicationContext(ApplicationContext applicationContext)
                throws BeansException {
            SpringUtils.applicationContext = applicationContext;
        }

        public static Object getBean(String beanName) throws BeansException{
           return  applicationContext.getBean(beanName);
        }

}