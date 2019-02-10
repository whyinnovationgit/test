package rewards

class Customer {
    String firstName
    String lastName
    Long phone
    String email
    Integer totalPoints
    static hasMany = [awards:Award, orders:OnlineOrder]

    static constraints = {
        firstName()
        lastName()
        email(email:true)
        phone(nullable: true)
        totalPoints(nullable: true)

    }
}
