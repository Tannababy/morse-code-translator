import handlers.{InputHandler, OutputHandler}
import translators.Translator

import scala.annotation.tailrec

object Main {

  def main(args: Array[String]): Unit = {

    OutputHandler.printWelcomeMsg()
    selectTranslatorOptions()

  }

  @tailrec
  private def selectTranslatorOptions(): Unit = {
    
    OutputHandler.printMenu()

    val userChoice = InputHandler.getUserInput()

      userChoice match {
        case "1" => {
          OutputHandler.printPromptMsg("Enter text to translate to Morse:")
          val textToTranslate = InputHandler.getUpperCaseUserInput()
          val encodedText = Translator.convertTextToMorse(textToTranslate)
          OutputHandler.printResultMsg("Morse: ", encodedText)
          selectTranslatorOptions()
        }
        case "2" => {
          OutputHandler.printPromptMsg("Enter Morse code to translate to text (use spaces between letters, '/' for word breaks):")
          val textToTranslate = InputHandler.getUserInput()
          val decodedMorse = Translator.convertMorseToText(textToTranslate)
          OutputHandler.printResultMsg("Text: ", decodedMorse)
          selectTranslatorOptions()
        }
        case "exit" => OutputHandler.printPromptMsg("Exiting translator. Bye Bye!")
        case _ => OutputHandler.printPromptMsg("Invalid choice. Please enter '1', '2', or 'exit'.")
          selectTranslatorOptions()
      }


  }
}