package autohandel

import org.grails.datastore.gorm.GormEntity

class Car implements GormEntity<Car>{

    String brand;
    String model;
    String productionYear
    Double engineCapacity
    String fuelType
    String color
    Integer horsepower
    Integer mileage
    String transmission
    Double price

    static hasMany = ["faults": Fault]

    static constraints = {
        brand blank: false
        model blank: false
        productionYear blank: false, size: 0..4
        engineCapacity blank: false, size: 0..5
        fuelType blank: false
        color blank: false
        horsepower blank: false, size: 0..4
        mileage blank: false
        transmission blank: false
        price blank: false
    }
}
