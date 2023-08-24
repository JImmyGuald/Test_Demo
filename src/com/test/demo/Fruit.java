package com.test.demo;

import java.math.BigDecimal;

/**
 * 水果
 */
public class Fruit {
    /**
     * 单价
     */
    private Double price;

    /**
     * 购买重量
     */
    private Integer weight;

    /**
     * 打折，默认不打折
     */
    private Double discount = 1d;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    /**
     * 计算总价格，四舍五入保留两位小数
     * @return
     */
    public Double calTotalPrice() {
        return new BigDecimal(this.price).multiply(new BigDecimal(this.weight)).multiply(new BigDecimal(this.discount)).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
