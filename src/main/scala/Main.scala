import handlers.{InputHandler, OutputHandler}
import translators.Translator

object Main {

  def main(args: Array[String]): Unit = {

    OutputHandler.printWelcomeMsg()

    var isTranslating = true
    while (isTranslating) {

      OutputHandler.printPromptMsg("Enter your choice")
      val userChoice = InputHandler.getUserInput()

      userChoice match {
        case "1" => {
          OutputHandler.printPromptMsg("Enter text to translate to Morse:")
          val textToTranslate = InputHandler.getUpperCaseUserInput()
          val encodedText = Translator.convertTextToMorse(textToTranslate)
          OutputHandler.printPromptMsg(s"Morse: $encodedText")
        }
        case "2" => {
          OutputHandler.printPromptMsg("Enter Morse code to translate to text (use spaces between letters, '/' for word breaks):")
          val textToTranslate = InputHandler.getUpperCaseUserInput()
          OutputHandler.printPromptMsg(s"Text: ")
        }
        case "exit" => {
          isTranslating = false
          OutputHandler.printPromptMsg("Exiting translator. Bye Bye!")
        }
        case _ => OutputHandler.printPromptMsg("Invalid choice. Please enter '1', '2', or 'exit'.")
      }
      OutputHandler.printPromptMsg("I'm going back into the while loop, try again")

    }


  }

}