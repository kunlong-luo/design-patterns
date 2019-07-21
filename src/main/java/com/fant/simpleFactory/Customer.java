package com.fant.simpleFactory;

import com.fant.bean.Computer;
import com.fant.enums.ComputerBrandEnum;
import com.fant.enums.ComputerTypeEnum;

public class Customer {

    public Computer buy(ComputerBrandEnum brand, ComputerTypeEnum type) {
        return SimpleFactory.production(brand, type);
    }
}
