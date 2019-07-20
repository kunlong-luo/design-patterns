package com.fant.simpleFactory;

import com.fant.BaseTest;
import com.fant.bean.Computer;
import com.fant.enums.ComputerBrand;

public class CustomerTest extends BaseTest {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Computer buy = customer.buy(ComputerBrand.DELL);
        System.out.println(buy.toString());
    }
}