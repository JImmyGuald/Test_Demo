package com.test.demo;

public class Problem4 {
    public static void main(String[] args) {
        Fruit f1 = new Apple();
        // 购买苹果10斤
        f1.setWeight(10);
        Fruit f2 = new Strawberry();
        // 购买草莓10斤
        f2.setWeight(10);
        Fruit f3 = new Mango();
        // 购买芒果10斤，打八折
        f3.setWeight(10);
        f3.setDiscount(0.8);
        // 购物满 100 减 10 块
        Coupon cp = new Coupon();
        cp.setThreshold(100d);
        cp.setPreference(10d);
        if(calTotalPrice(f1, f2, f3, cp).doubleValue() == 360d) {
            System.out.println("测试通过");
        } else {
            System.out.println("测试不通过");
        }
    }

    public static Double calTotalPrice(Fruit f1, Fruit f2, Fruit f3, Coupon cp) {
        Double totalPrice = f1.calTotalPrice() + f2.calTotalPrice() + f3.calTotalPrice();
        // 优惠券判断
        if (cp != null) {
            if (totalPrice > cp.getThreshold()) {
                totalPrice -= cp.getPreference();
            }
        }
        return totalPrice;
    }
}
