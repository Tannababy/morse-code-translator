package translators


object Translator {


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
        if (charArr(i).equals(" ")) "/"
        else MorseCode.charToMorse(char)
      }
    }

    morseArr.mkString(" ")
  }

  def convertMorseToText(morse: String): String = {
    // ".... .." -> "...." ".."
    //first the method is passed the morse code as a String type
    // break the morse words/sentence into morse letters (.split(" ") bcz morse letters are separated by spaces)
    // .split method returns an array
    // loop through array of morse letters and change to text char and "/" to spaces
    // return text char arr as a string

    // split up morse words / letters by spaces to get morse letters
    val morseLettersArr = morse.split(" ")

    // new arr to store decoded morse letters
    val textArr = new Array[Char](morseLettersArr.length)

    for(i <- morseLettersArr.indices) {

      val morseLetter = morseLettersArr(i)

      textArr(i) = {
        if (morseLettersArr(i).equals("/")) ' '
        else MorseCode.morseToChar(morseLetter)
      }
    }

    textArr.mkString("").toLowerCase()

  }

}
