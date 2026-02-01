package Basics

class Laptop{
    def brand
    def price
    def year

    static main(args){

        Laptop laptop=new Laptop()
        laptop.brand= "Apple"
        laptop.price=120000
        laptop.year=2025
        println("**************************************************")
        laptop.login()
        laptop.logout()
        println("Basics.Laptop brand is: "+laptop.brand)
        println("Basics.Laptop price is: "+laptop.price)
        println("Basics.Laptop year is: "+laptop.year)

    }
    def login(){
        println("System is loggin in")
    }
    def logout(){
        println("System is loggin out")
    }
}