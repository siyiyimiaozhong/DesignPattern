package com.siyi.abstractfactory;

public class Main {
    public static void main(String[] args) {
        //创建具体工厂对象
        AbstractFactory modernFactory = new ModernFactory();
        AbstractFactory ancientFactory = new AncientFactory();
        //通过具体工厂创建具体产品
        Vehicle modernVehicle = modernFactory.createVehicle();
        Weapon modernWeapon = modernFactory.createWeapon();
        modernVehicle.go();
        modernWeapon.shoot();
        System.out.println("------------------");

        Vehicle ancientVehicle = ancientFactory.createVehicle();
        Weapon ancientWeapon = ancientFactory.createWeapon();
        ancientVehicle.go();
        ancientWeapon.shoot();
    }
}
