package com.siyi.abstractfactory;

/**
 * 现代工厂
 */
public class ModernFactory extends AbstractFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Weapon createWeapon() {
        return new Pistol();
    }
}
