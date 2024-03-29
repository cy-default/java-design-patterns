package com.remotes.design.strategy;

import com.remotes.design.constant.Constants;

import java.math.BigDecimal;

/**
 * 具体策略类
 *
 * 专属会员
 * @author yuan.chen
 * @email yuan.chen@ingeek.com
 * @company INGEEK
 * @Date 2019-05-13
 */
public class ParticularlyVipBuyer implements Buyer {

    private final BigDecimal discountPrice = new BigDecimal(30);
    private final BigDecimal discount = new BigDecimal(0.7);

    @Override
    public String getType() {
        return Constants.Strategy.ParticularlyVipBuyer.getCode();
    }

    /**
     * 专属会员订单价格>30, 7折优惠
     * @param orderPrice 订单价格
     * @return
     */
    @Override
    public BigDecimal calPrice(BigDecimal orderPrice) {
        if(orderPrice.compareTo(discountPrice)>0){
            return orderPrice.multiply(discount);
        }
        return orderPrice;
    }
}
