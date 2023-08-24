package com.test.demo;

/**
 * 优惠券
 */
public class Coupon {
    /**
     * 门槛
     */
    private Double threshold;
    /**
     * 优惠金额
     */
    private Double preference;

    public Double getThreshold() {
        return threshold;
    }

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    public Double getPreference() {
        return preference;
    }

    public void setPreference(Double preference) {
        this.preference = preference;
    }
}
