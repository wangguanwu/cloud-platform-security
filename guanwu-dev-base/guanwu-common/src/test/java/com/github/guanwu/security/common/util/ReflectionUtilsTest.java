package com.github.guanwu.security.common.util;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


/**
 * @author guanwu
 * @created on 2021-07-31 10:45:36
 **/
class ReflectionUtilsTest {

    static TestReqData testReqData;

    @BeforeAll
    static void setup() {
        testReqData = new TestReqData();
        testReqData.setShit("shit");
        testReqData.setName("guanwu");

    }

    @Test
    void invokeSetter() {
        ReflectionUtils.invokeSetter(testReqData, "name", "fuck");
        System.out.println(testReqData.getName());
    }

    @Test
    void invokeMethod() {
        ReflectionUtils.invokeMethod(testReqData, "sayHello",
                new Class[]{}, new Object[]{});

    }

    @Test
    void invokeMethodByName() {
        ReflectionUtils.invokeMethodByName(testReqData, "sayHi", new Object[]{});
    }

    @Test
    void convertReflectionExceptionToUnchecked() {
    }

    @Test
    void setFieldValue() {
    }

    @Test
    void getAccessibleField() {
    }

    @Test
    void getAccessibleMethod() {
    }

    @Test
    void getAccessibleMethodByName() {
    }

    @Test
    void makeAccessible() {
    }

    @Test
    void testMakeAccessible() {
    }
}