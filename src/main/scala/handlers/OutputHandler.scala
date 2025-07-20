package handlers

object OutputHandler extends App{

  def printWelcomeMsg() =
    println("Welcome to the Morse code translator!")
    println("Enter: \n '1' for Text to Morse \n '2' for Morse to Text \n 'exit' to quit")


  def printError(message: String)= println(s"ERROR: $message")

  def printResult(label: String, result: String) = println(s"$label: $result")

}
