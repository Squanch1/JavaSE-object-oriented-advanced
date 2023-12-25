package com.itheima.polymorphism.test3;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    public void lookHome() {
        System.out.println("狗在看家");
    }

    //根据分装的原则,应该吧狗吃东西这个行为封装到狗这个类里面,因为该行为对应的数据属于该类
    @Override
    public void eat(String something) {
        System.out.printf("%d岁的%s颜色的狗前腿紧紧抱住%s猛吃", getAge(), getColor(), something);
        System.out.println();
    }
}
