import scala.io.StdIn

object Main {

  def main(args: Array[String]): Unit = {
    println("Welcome to the Morse code translator!")
    println("Enter: \n '1' for Text to Morse \n '2' for Morse to Text \n 'exit' to quit")

    var isTranslating = true
    while (isTranslating) {

      val input = StdIn.readLine().trim.toLowerCase

      input match {
        case "1" => {
          println("Enter text to translate to Morse:")
          val textToTranslate = StdIn.readLine()
          println(s"Morse: ")
        }
        case "2" => {
          println("Enter Morse code to translate to text (use spaces between letters, '/' for word breaks):")
          val textToTranslate = StdIn.readLine()
          println(s"Text: ")
        }
        case "exit" => {
          isTranslating = false
          println("Exiting translator. Bye Bye!")
        }
        case _ => println("Invalid choice. Please enter '1', '2', or 'exit'.")
      }
      println()

    }


  }

}