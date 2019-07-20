package com.fant.simpleFactory;

import com.fant.bean.Computer;
import com.fant.bean.Dell;
import com.fant.bean.Lenovo;
import com.fant.bean.MacBook;
import com.fant.enums.ComputerBrand;

import java.util.UUID;

/**
 * 简单工厂
 */
public class SimpleFactory {

    public static Computer production(ComputerBrand brand) {
        switch (brand) {
            case DELL:
                return new Dell(UUID.randomUUID().toString(),"戴尔","Dell",10);
            case MACBOOK:
                return new MacBook(UUID.randomUUID().toString(),"苹果","MacBook",5);
            case LENOVO:
                return new Lenovo(UUID.randomUUID().toString(),"联想","Lenovo",15);
            default:
                throw new IllegalStateException("品牌未上市: " + brand.name());
        }
    }
}
