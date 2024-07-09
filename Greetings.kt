fun main(args: Array<String>) {
    /*val arrays = mutableListOf<Int>()
    val number = 0..23

    arrays.addAll(number)
    for (array in arrays){
        args[array] = array.toString()
    }

    val hora = args[5].toInt()
    if (hora < 12) println("Good Morning") else println("Good night")
    */

    //Add a argument by intellij
    if (args[0].toInt() < 12)  println("Good Morning") else println("Good night")
}