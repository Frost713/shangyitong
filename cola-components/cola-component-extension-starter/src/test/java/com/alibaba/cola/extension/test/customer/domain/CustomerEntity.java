package com.alibaba.cola.extension.test.customer.domain;

import com.alibaba.cola.domain.Entity;
import com.alibaba.cola.extension.BizScenario;
import com.alibaba.cola.extension.ExtensionExecutor;
import com.alibaba.cola.extension.test.customer.domain.rule.CustomerRuleExtPt;
import com.alibaba.cola.extension.test.customer.infrastructure.CustomerRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Customer Entity
 * 客户实体
 * @author Frank Zhang
 * @date 2018-01-07 2:38 AM
 */
@Entity
@Data
public class CustomerEntity {
    //公司名称
    private String companyName;
    //来源
    private SourceType sourceType;
    //客户类型
    private CustomerType customerType;
    //业务场景
    private BizScenario bizScenario;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ExtensionExecutor extensionExecutor;

    public CustomerEntity() {

    }

    public void addNewCustomer() {
        //Add customer policy
        extensionExecutor.execute(CustomerRuleExtPt.class,this.getBizScenario(), extension -> extension.addCustomerCheck(this));

        //Persist customer
        customerRepository.persist(this);

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public SourceType getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}
