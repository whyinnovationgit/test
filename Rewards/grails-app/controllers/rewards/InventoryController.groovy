package rewards

class InventoryController {

    def index() {
        render "Hello World."
    }

    def edit(){
        def all = Product.list()
        def productName = "Breakfaste Blend"
        def sku = "bb01"
        [product:all]
    }

    def remove() {
        render "Yolo swag."
    }
}
