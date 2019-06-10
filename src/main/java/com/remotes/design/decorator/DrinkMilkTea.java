package com.remotes.design.decorator;

/**
 * 定义一个顶层"喝奶茶"接口
 * @author yuan.chen
 * @email chen.yuan135@chinaredstar.com
 * @Date 2019-06-10
 */
public interface DrinkMilkTea {

    /**
     * 这杯奶茶花了多少钱
     * @return
     */
    public double totalPrice();

    /**
     * 这杯奶茶使用了什么材料
     * @return
     */
    public String useMaterial();
}