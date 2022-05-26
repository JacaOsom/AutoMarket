package autohandel

import grails.gorm.transactions.Transactional

class BootStrap {

    def init = { servletContext ->
        addFirstUser()
        addNewUser()
    }
    def destroy = {
    }

    @Transactional
    void addFirstUser() {
        Person jacek = Person.findByUsername("jacek")
        if (jacek == null) {
            new Person(username: "jacek", password: "test").save(flush: true, failOnError: true)
        }

        Role admin = Role.findByAuthority("ROLE_ADMIN")
        if (admin == null) {
            admin = new Role(authority: "ROLE_ADMIN").save(flush: true, failOnError: true)
            new PersonRole(person: jacek, role: admin).save(flush: true, failOnError: true)
        }
    }

    @Transactional
    void addNewUser() {
        Person bartek = Person.findByUsername("bartek")
        if (bartek == null) {
            new Person(username: "bartek", password: "bartek123").save(flush: true, failOnError: true)
        }

        Role user = Role.findByAuthority("ROLE_USER")
        if (user == null) {
            user = new Role(authority: "ROLE_USER").save(flush: true, failOnError: true)
            new PersonRole(person: bartek, role: user).save(flush: true, failOnError: true)
        }

    }
}