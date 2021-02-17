class Customer
class Contact(val id: Int, var email: String)
fun main()
{
    val customer = Customer()
    println(customer)

    val contact = Contact(1, "positoy@gmail.com")
    contact.email = "andy@gmail.com"
    println(contact.id)
    println(contact.email)
}

