package com.ealen.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyJob1  implements MyJobTeleplament {
    private static Logger logger = LoggerFactory.getLogger(MyJob1.class);
    public static void say() {
        logger.info("哇被触发了哈哈哈哈哈111");
    }
}
