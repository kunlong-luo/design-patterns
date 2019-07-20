package com.fant.simpleFactory;

import com.fant.bean.Computer;
import com.fant.enums.ComputerBrand;

public class Customer {

    public Computer buy(ComputerBrand brand) {
        return SimpleFactory.production(brand);
    }
}
