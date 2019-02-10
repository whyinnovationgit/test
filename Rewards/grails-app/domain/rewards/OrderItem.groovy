package rewards

class OrderItem {

    Integer quantity
    Float total
    static belongsTo = [product:Product, order:OnlineOrder]


    static constraints = {
    }
}
