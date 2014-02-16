package com.gtunes

class User {
    String login
    String password
    String firstName
    String lastName
    
    static hasMany=[purchasedSongs:Song]

    static constraints = {
    }
}
