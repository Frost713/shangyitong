package com.alibaba.cola.extension.test.customer.domain.rule;

import com.alibaba.cola.extension.ExtensionPointI;
import com.alibaba.cola.extension.test.customer.domain.CustomerEntity;

/**
 * CustomerRuleExtPt
 *  客户规则扩展点
 * @author Frank Zhang
 * @date 2018-01-07 12:03 PM
 */
public interface CustomerRuleExtPt extends ExtensionPointI {

    //Different business check for different biz
    //不同的业务检查不同的场景
    public boolean addCustomerCheck(CustomerEntity customerEntity);

    //Different upgrade policy for different biz
    //不同场景有不同的升级策略
    default public void customerUpgradePolicy(CustomerEntity customerEntity){
        //Nothing special
    }
}
