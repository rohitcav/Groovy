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
        println("Laptop brand is: "+laptop.brand)
        println("Laptop price is: "+laptop.price)
        println("Laptop year is: "+laptop.year)

    }
    def login(){
        println("System is loggin in")
    }
    def logout(){
        println("System is loggin out")
    }
}