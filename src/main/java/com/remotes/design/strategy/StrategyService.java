package com.remotes.design.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * 测试类
 * @author yuan.chen
 * @email yuan.chen@ingeek.com
 * @company INGEEK
 * @Date 2019-05-14
 */
@Service
public class StrategyService {

    /**
     * 加载策略模式
     */
    @Autowired
    @Qualifier("buyers")
    private List<Buyer> buyers;
    Logger logger  = LoggerFactory.getLogger(StrategyService.class);

    public double strategy(String buyerType) {
        // 创建上下文
        Cashier cashier = null;
        // 选择并创建需要使用的策略对象
        Buyer strategy = null;
        for (Buyer buyer: buyers){
            if(buyer.getType().equals(buyerType)){
                strategy = buyer;
                break;
            }
        }
        cashier = new Cashier(strategy);
        // 计算价格
        BigDecimal quote = cashier.quote(new BigDecimal(300));
        logger.info("{}会员商品的最终价格为:{}", strategy.getType(), quote.doubleValue());
        return quote.doubleValue();
    }


    public double strategy2() {
        // 选择并创建需要使用的策略对象
        Buyer strategy = new VipBuyer();
        // 创建上下文
        Cashier cashier = new Cashier(strategy);
        // 计算价格
        BigDecimal quote = cashier.quote(new BigDecimal(300));
        logger.info("普通会员商品的最终价格为：{}", quote.doubleValue());

        strategy = new SuperVipBuyer();
        cashier = new Cashier(strategy);
        quote = cashier.quote(new BigDecimal(300));
        logger.info("超级会员商品的最终价格为：{}", quote.doubleValue());
        return quote.doubleValue();
    }
}
