package com.siyi.abstractfactory;

/**
 * 古代工厂
 */
public class AncientFactory extends AbstractFactory {
    @Override
    public Vehicle createVehicle() {
        return new Carriage();
    }

    @Override
    public Weapon createWeapon() {
        return new Arrow();
    }
}
