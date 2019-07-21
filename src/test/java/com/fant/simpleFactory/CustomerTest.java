package com.fant.simpleFactory;

import com.fant.BaseTest;
import com.fant.bean.Computer;
import com.fant.enums.ComputerBrandEnum;
import com.fant.enums.ComputerTypeEnum;

public class CustomerTest extends BaseTest {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Computer buy = customer.buy(ComputerBrandEnum.DELL, ComputerTypeEnum.NOTEBOOK);
        System.out.println(buy.toString());
    }
}