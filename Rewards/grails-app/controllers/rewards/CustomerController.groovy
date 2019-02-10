package rewards

class CustomerController {
    static scaffold = Customer

    def calculationService

    def checkin(){

    }

    def customerLookup(Customer lookupInstance){
        def (customerInstance,welcomeMessage)= calculationService.processCheckin(lookupInstance)
        render(view: "checkin", model: [customerInstance: customerInstance, welcomeMessage: welcomeMessage])

    }
    //def index() { }

}
