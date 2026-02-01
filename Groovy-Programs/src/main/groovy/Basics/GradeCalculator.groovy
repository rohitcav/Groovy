/*
Grade Calculator
Input marks (0–100)
Print grade:
A (90+)
B (75–89)
C (50–74)
Fail (<50)
Use if / else.
 */

package Basics

class GradeCalculator {
    static main(args){
        def marks = 75;
        if(marks<50){
            println("Fail")
        }
        else if (marks>=50 && marks <= 74){
            println("Grade C")
        }
        else if (marks>=75 && marks <= 89){
            println("Grade B")
        }
        else if (marks >= 90){
            println("Grade A")
        }
        else println("Invalid Number")
    }
}
