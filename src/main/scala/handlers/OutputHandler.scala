package handlers

object OutputHandler {

  def printWelcomeMsg() = {
    println("Welcome to the Morse code translator!")
    println("Enter: \n '1' for Text to Morse \n '2' for Morse to Text \n 'exit' to quit")
  }

  def printPromptMsg(prompt: String) = println(prompt)

  def printErrorMsg(message: String)= println(s"ERROR: $message")

  def printResultMsg(label: String, result: String) = println(s"$label: $result")

}
