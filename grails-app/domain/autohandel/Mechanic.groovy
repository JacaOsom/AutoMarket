package autohandel

import org.grails.datastore.gorm.GormEntity

class Mechanic implements GormEntity<Mechanic>{

    String name
    String lastName
    String address


    static hasMany = ["faults": Fault]

    static constraints = {
        name blank: false
        lastName blank: false
        address blank: false
    }
}
