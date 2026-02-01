package Basics
/*
Given a name, print:
Uppercase
Lowercase
Length
Reverse

 */

class StringMagic {
    def name="Rohit Kumar"
    static main(args){
        StringMagic stringMagic = new StringMagic()
        println("Name with Upper Case is : "+ stringMagic.name.toUpperCase());
        println("Length of the Name is : "+ stringMagic.name.length());
        println("Reverse of the Name is : "+ stringMagic.name.reverse());
    }
}
