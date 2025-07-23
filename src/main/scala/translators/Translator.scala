package translators


object Translator {

  private val MorseCharSeparator = " "
  private val MorseWordSeparator = "/"

  def convertTextToMorse(text: String): String = {

    // "HI YOU"
    // break up string into char
    //    MorseCode.charToMorse(text.charAt(0)) to always only get 1st char of string
    // "HI"
    val charArr = text.toCharArray()

    val morseArr = new Array[String](charArr.length)

    for(i <- charArr.indices) {
      val char = charArr(i)
      morseArr(i) = {
        if (charArr(i).equals(MorseCharSeparator)) MorseWordSeparator
        else MorseCode.charToMorse(char)
      }
    }
    
    morseArr.mkString(MorseCharSeparator)
  }




//  def helperFunction(str: String): String = {
//
//  }



  // Function to split a sentence into a list of word
  def convertSentenceToWords(sentence: String): List[String] = {

    sentence.split(" ").filterNot(_.isEmpty).toList
  }

  def morseSentenceToWords(str: String): List[String] = {
    str.split(s" $MorseWordSeparator ").toList // Splits by " / "
  }

//  def decodeMorseWord(morseWord: String): Either[String, String] = {
//
//  }
//
//  def morseToText(morse: String): Either[String, String] = {
//
//  }
}
