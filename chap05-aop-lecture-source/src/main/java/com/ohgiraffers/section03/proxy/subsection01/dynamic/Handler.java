package com.ohgiraffers.section03.proxy.subsection01.dynamic;

import com.ohgiraffers.section03.proxy.common.Student;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Handler implements InvocationHandler {

    private final Student student;

    public Handler(Student student) {
        this.student = student;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("======= 공부가 너무 하고 싶습니다. =========");

        method.invoke(student, args);

        System.out.println(method);
        for(Object arg : args) {
            System.out.println("전달된 인자 : " + args);
        }

        System.out.println("====== 공부를 마치고 수면학습을 시작합니다. ======");

        return proxy;
    }
}
