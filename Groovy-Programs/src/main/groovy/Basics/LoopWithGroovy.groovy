/*
Print numbers from 1 to 10 using:
for
while
 */

package Basics

class LoopWithGroovy {
    static main(args){
        //for loop
        println(" ************** For Loop *********************")
        for(def i=1; i<=10; i++){
            println(i)
        }
        //While loop
        def j=1
        println(" ************** While Loop *********************")
        while(j<=10){
            println(j)
            j++
        }
    }

}
