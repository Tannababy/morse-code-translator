package handlers

import scala.io.StdIn


object InputHandler {

  def getUserInput(): String = StdIn.readLine().trim
  
  def getUpperCaseUserInput(): String = getUserInput().toUpperCase
}
