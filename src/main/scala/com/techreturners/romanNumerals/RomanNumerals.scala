package com.techreturners.romanNumerals

import scala.collection.immutable.ListMap
//The symbols are I, V, X, L, C, D, and M, standing respectively for 1, 5, 10, 50, 100, 500, and 1,000.
class RomanNumerals
{
  //hashmap to map roman numerals to number and vice versa
  val romanNumeralsToNumbers: ListMap[String, Int] = ListMap("I"->1, "V"->5, "X"->10, "L"->50, "C"->100, "D"->500, "M"->1000)
  val romanNumeralsToNumbersShortcuts: ListMap[String, Int] = ListMap("IV"->4, "IX"->9, "XL"->40, "XC"->90, "CD"->400, "CM"->900)

  val numbersToRomanNumerals: ListMap[Int, String] = ListMap(1000->"M", 900->"CM", 500->"D", 400->"CD", 100->"C", 90->"XC", 50->"L", 40->"XL", 10->"X", 9->"IX", 5->"V", 4->"IV", 1->"I")

  def convertNumberToRomanNumeral(numberPar: Int):String =
  {
    var result=""
    var number=numberPar

    //edge cases
    if (numberPar > 3000)
    {
      result="please input a number up to 3000"
    }
    else if (numberPar == 0)
    {
      result="no valid input"
    }
    else if (numberPar < 0)
    {
      result="negative numbers are not supported"
    }
    else
    {
      for ((romanNumberValue, romanNumberString) <- numbersToRomanNumerals)
      {
        while ((number-romanNumberValue) > -1 )
        {
          result=result + romanNumberString
          number=number-romanNumberValue
        }
      }
    }
    //return the roman numeral
    result
  }

  def convertRomanNumeralToNumber(romanNumberPar: String):Int =
  {
    //check the string for the symbols and add the values up
    //first check for short cuts like IV
    var romanNumber=romanNumberPar
    var result = 0
    romanNumeralsToNumbersShortcuts.foreach
    {
      case (romanNumberString, romanNumberValue) =>
      {
        if (romanNumber.contains(romanNumberString))
        {
          //cut it out for the string and add to result
          val multiplyWith = romanNumber.sliding(romanNumberString.length).count(_ == romanNumberString)
          result = result + multiplyWith * romanNumberValue
          romanNumber = romanNumber.replace(romanNumberString, "")
          result = result + 0
        }
      }
    }
    //check for the single char symbols
    romanNumeralsToNumbers.foreach(romanNumberElement =>
    {
      if (romanNumber.contains(romanNumberElement._1))
      {
        //cut it out for the string and add to result
        val romanNumberString=romanNumberElement._1
        val multiplyWith=romanNumber.sliding(romanNumberString.length).count(_ == romanNumberString)
        val romanNumberValue=romanNumberElement._2
        result=result + multiplyWith * romanNumberValue
        romanNumber=romanNumber.replace(romanNumberString, "")
      }
    })
    //if there is anything but blanks left in romanNumber return 0
    romanNumber=romanNumber.replace(" ", "")
    if (0 != romanNumber.length)
    {
      result=0
    }
    //return result
    result
  }
}
