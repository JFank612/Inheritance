fun main() {
    do{

        println("1. Residential")
        println("2. Commercial")
        println("3. Done")
        print("Enter your selection:")
        val userInput = readLine()!!.toInt()

        if (userInput == 1)
        {
            println("\nResidential")
            print("Enter your name: ")
            val rName = readLine()!!.toString()
            print("Enter your phone number: ")
            val rPhone = readLine()!!.toString()
            print("Enter your address: ")
            val rAddress = readLine()!!.toString()
            print("Enter your square feet: ")
            val rSquareFeet = readLine()!!.toDouble()
            print("Enter 1 if you are a senior citizen or 0 to continue:")
            val rAnswer = readLine()!!.toInt()
            var rSenior = false

            if(rAnswer == 1)
            {
                rSenior = true
            }

            val customer1 = Residential(rName, rPhone,
                rAddress, rSquareFeet,rSenior)

            println("\n")
            customer1.showInfo()
            customer1.charges()
            println("\n")

        }
        else if ( userInput == 2)
        {
            println("\nCommercial")
            print("Enter your property name: ")
            val cProperty = readLine()!!.toString()
            print("Enter your name: ")
            val cName = readLine()!!.toString()
            print("Enter your phone number: ")
            val cPhone = readLine()!!.toString()
            print("Enter your address: ")
            val cAddress = readLine()!!.toString()
            print("Enter your square feet: ")
            val cSquareFeet = readLine()!!.toDouble()
            print("Enter 1 for multiple properties or 0 to continue:")
            val cAnswer = readLine()!!.toInt()
            var cMultiProperty = false

            if(cAnswer == 1)
            {
                cMultiProperty = true
            }

            val customer1 = Commercial(cName, cPhone,
                cAddress, cSquareFeet,
                cProperty, cMultiProperty)

            println("\n")
            customer1.showInfo()
            customer1.charges()
            println("\n")
        }
        else if(userInput == 3)
            println("Your order has been placed.")
        else
            println("Invalid Input")
    }
    while(userInput!=3)
}