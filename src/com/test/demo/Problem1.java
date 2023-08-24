package com.test.demo;

public class Problem1 {

    public static void main(String[] args) {
        Fruit f1 = new Apple();
        // 购买苹果10斤
        f1.setWeight(10);
        Fruit f2 = new Strawberry();
        // 购买草莓10斤
        f2.setWeight(10);
        if( calTotalPrice(f1, f2).doubleValue() == 210d) {
            System.out.println("测试通过");
        } else {
            System.out.println("测试不通过");
        }
    }

    public static Double calTotalPrice(Fruit f1, Fruit f2) {
        return f1.calTotalPrice() + f2.calTotalPrice();
    }
}
