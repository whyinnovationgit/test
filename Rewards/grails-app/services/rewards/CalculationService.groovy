package rewards

import grails.gorm.transactions.Transactional

@Transactional
class CalculationService {

    def processCheckin(lookupInstance) {
        def customerInstance = Customer.findByPhone(lookupInstance.phone)
        if (customerInstance == null){
            customerInstance = lookupInstance
            customerInstance.firstName = "Customer"
        }
        def totalAwards = 0
        customerInstance.awards.each {
            totalAwards = totalAwards + it.points
        }
        customerInstance.totalPoints = totalAwards + 1
        def welcomeMessage = "Hey $customerInstance.firstName , you have $customerInstance.totalPoints points"
        customerInstance.save()

        return [customerInstance,welcomeMessage]


    }
}
