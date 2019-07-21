package com.fant.simpleFactory;

import com.fant.bean.Computer;
import com.fant.bean.DesktopComputer;
import com.fant.bean.NoteBookComputer;
import com.fant.enums.ComputerBrandEnum;
import com.fant.enums.ComputerTypeEnum;

import java.util.UUID;

/**
 * 简单工厂
 */
public class SimpleFactory {

    public static Computer production(ComputerBrandEnum brand, ComputerTypeEnum type) {
        switch (type) {
            case NOTEBOOK:
                return getNoteBookComputer(brand, type);
            case DESKTOP:
                return getDesktopComputer(brand, type);
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }

    private static Computer getDesktopComputer(ComputerBrandEnum brand, ComputerTypeEnum type) {
        return new DesktopComputer(getId(), brand.name().toLowerCase(), type.name().toLowerCase(), brand.name().toLowerCase(), 10);
    }

    private static Computer getNoteBookComputer(ComputerBrandEnum brand, ComputerTypeEnum type) {

        return new NoteBookComputer(getId(), brand.name().toLowerCase(), type.name().toLowerCase(), brand.name().toLowerCase(), 10);
    }

    private static String getId() {
        return UUID.randomUUID().toString();
    }
}
