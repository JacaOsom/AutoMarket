package autohandel

import org.grails.datastore.gorm.GormEntity

class Fault implements GormEntity<Fault>{

    String description
    Double valueFault
    Date date
    Car car
    Boolean fixed
    Mechanic mechanic

//    static whichMechanic = ["mechanic":Mechanic]
//    static whichCar = ["car":Car]

    static constraints = {
        description blank: false
        valueFault blank: false
        date blank: false
        car blank: false
        mechanic blank: true, nullable: true
        fixed blank: false
    }
}
