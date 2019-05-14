package com.remotes.design.strategy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan.chen
 * @email yuan.chen@ingeek.com
 * @company INGEEK
 * @Date 2019-05-14
 */
@Configuration
public class StrategyConfig {


    /**
     * 配置所有策略模式
     * @return
     */
    @Bean(name = "buyers")
    public List<Buyer> initBuyer(){
        List<Buyer> buyers = new ArrayList();
        Buyer buyer = new ParticularlyVipBuyer();
        buyers.add(buyer);
        buyer = new SuperVipBuyer();
        buyers.add(buyer);
        buyer = new VipBuyer();
        buyers.add(buyer);
        return buyers;
    }
}
