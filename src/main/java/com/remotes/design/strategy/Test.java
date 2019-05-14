package com.remotes.design.strategy;

import java.math.BigDecimal;

/**
 * 测试类
 * @author yuan.chen
 * @email yuan.chen@ingeek.com
 * @company INGEEK
 * @Date 2019-05-14
 */
public class Test {

    public static void main(String[] args) {

        // 选择并创建需要使用的策略对象
        Buyer strategy = new VipBuyer();
        // 创建上下文
        Cashier cashier = new Cashier(strategy);
        // 计算价格
        BigDecimal quote = cashier.quote(new BigDecimal(300));
        System.out.println("普通会员商品的最终价格为：" + quote.doubleValue());

        strategy = new SuperVipBuyer();
        cashier = new Cashier(strategy);
        quote = cashier.quote(new BigDecimal(300));
        System.out.println("超级会员商品的最终价格为：" + quote.doubleValue());

    }
}
