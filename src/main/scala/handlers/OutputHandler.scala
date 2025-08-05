package handlers

object OutputHandler {

  def printWelcomeMsg(): Unit = {
    println("Welcome to the Morse code translator!")
  }
  
  def printMenu(): Unit = println("Enter: \n '1' for Text to Morse \n '2' for Morse to Text \n 'exit' to quit")
  
  def printPromptMsg(prompt: String): Unit = println(prompt)

  def printResultMsg(label: String, result: String): Unit = println(s"$label: $result")

}
