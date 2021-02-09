package com.siyi.prototypepattern;

//具体原型类
public class Realizetype implements Cloneable {
    Location location;

    Realizetype(Location location) {
        this.location = location;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Realizetype realizetype = (Realizetype)super.clone();
        realizetype.location = (Location)location.clone();
        return realizetype;
    }
}

class Location implements Cloneable {
    StringBuilder street;
    int roomNo;

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", roomNo=" + roomNo +
                '}';
    }

    public Location(StringBuilder street, int roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
