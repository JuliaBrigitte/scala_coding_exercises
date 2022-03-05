package com.techreturners.romanNumerals

import org.scalatest.flatspec.AnyFlatSpec

class RomanNumeralsTest extends AnyFlatSpec {

  val romanNumerals = new RomanNumerals

//    1	I
  "A number of value 1" should "be converted to the roman numeral I" in {
    assert(romanNumerals.convertNumberToRomanNumeral(1) == "I")
  }
  "The roman numeral I" should "be converted to 1" in {
    assert(romanNumerals.convertRomanNumeralToNumber("I") == 1)
  }
//    2	II
  "A number of value 2" should "be converted to the roman numeral II" in {
    assert(romanNumerals.convertNumberToRomanNumeral(2) == "II")
  }
  "The roman numeral II" should "be converted to 2" in {
    assert(romanNumerals.convertRomanNumeralToNumber("II") == 2)
  }
//    3	III
  "A number of value 3" should "be converted to the roman numeral III" in {
    assert(romanNumerals.convertNumberToRomanNumeral(3) == "III")
  }
  "The roman numeral III" should "be converted to 3" in {
    assert(romanNumerals.convertRomanNumeralToNumber("III") == 3)
  }
//    4	IV
  "A number of value 4" should "be converted to the roman numeral IV" in {
    assert(romanNumerals.convertNumberToRomanNumeral(4) == "IV")
  }
  "The roman numeral IV" should "be converted to 4" in {
    assert(romanNumerals.convertRomanNumeralToNumber("IV") == 4)
  }
//    5	V
  "A number of value 5" should "be converted to the roman numeral V" in {
    assert(romanNumerals.convertNumberToRomanNumeral(5) == "V")
  }
  "The roman numeral V" should "be converted to 5" in {
    assert(romanNumerals.convertRomanNumeralToNumber("V") == 5)
  }
//    6	VI
  "A number of value 6" should "be converted to the roman numeral VI" in {
    assert(romanNumerals.convertNumberToRomanNumeral(6) == "VI")
  }
  "The roman numeral VI" should "be converted to 6" in {
    assert(romanNumerals.convertRomanNumeralToNumber("VI") == 6)
  }
//    7	VII
  "A number of value 7" should "be converted to the roman numeral VII" in {
    assert(romanNumerals.convertNumberToRomanNumeral(7) == "VII")
  }
  "The roman numeral VII" should "be converted to 7" in {
    assert(romanNumerals.convertRomanNumeralToNumber("VII") == 7)
  }
//    8	VIII
  "A number of value 8" should "be converted to the roman numeral VIII" in {
    assert(romanNumerals.convertNumberToRomanNumeral(8) == "VIII")
  }
  "The roman numeral VIII" should "be converted to 8" in {
    assert(romanNumerals.convertRomanNumeralToNumber("VIII") == 8)
  }
//    9	IX
  "A number of value 9" should "be converted to the roman numeral IX" in {
    assert(romanNumerals.convertNumberToRomanNumeral(9) == "IX")
  }
  "The roman numeral IX" should "be converted to 9" in {
    assert(romanNumerals.convertRomanNumeralToNumber("IX") == 9)
  }
//    10	X
  "A number of value 10" should "be converted to the roman numeral X" in {
    assert(romanNumerals.convertNumberToRomanNumeral(10) == "X")
  }
  "The roman numeral X" should "be converted to 10" in {
    assert(romanNumerals.convertRomanNumeralToNumber("X") == 10)
  }
//    11	XI
  "A number of value 11" should "be converted to the roman numeral XI" in {
    assert(romanNumerals.convertNumberToRomanNumeral(11) == "XI")
  }
  "The roman numeral XI" should "be converted to 11" in {
    assert(romanNumerals.convertRomanNumeralToNumber("XI") == 11)
  }
//    12	XII
  "A number of value 12" should "be converted to the roman numeral XII" in {
    assert(romanNumerals.convertNumberToRomanNumeral(12) == "XII")
  }
  "The roman numeral XII" should "be converted to 12" in {
    assert(romanNumerals.convertRomanNumeralToNumber("XII") == 12)
  }
//    13	XIII
  "A number of value 13" should "be converted to the roman numeral XIII" in {
    assert(romanNumerals.convertNumberToRomanNumeral(13) == "XIII")
  }
  "The roman numeral XIII" should "be converted to 13" in {
    assert(romanNumerals.convertRomanNumeralToNumber("XIII") == 13)
  }
//    14	XIV
  "A number of value 14" should "be converted to the roman numeral XIV" in {
    assert(romanNumerals.convertNumberToRomanNumeral(14) == "XIV")
  }
  "The roman numeral XIV" should "be converted to 14" in {
    assert(romanNumerals.convertRomanNumeralToNumber("XIV") == 14)
  }
//    15	XV
  "A number of value 15" should "be converted to the roman numeral XV" in {
    assert(romanNumerals.convertNumberToRomanNumeral(15) == "XV")
  }
  "The roman numeral XV" should "be converted to 15" in {
    assert(romanNumerals.convertRomanNumeralToNumber("XV") == 15)
  }
//    16	XVI
  "A number of value 16" should "be converted to the roman numeral XVI" in {
    assert(romanNumerals.convertNumberToRomanNumeral(16) == "XVI")
  }
  "The roman numeral XVI" should "be converted to 16" in {
    assert(romanNumerals.convertRomanNumeralToNumber("XVI") == 16)
  }
//    17	XVII
  "A number of value 17" should "be converted to the roman numeral XVII" in {
    assert(romanNumerals.convertNumberToRomanNumeral(17) == "XVII")
  }
  "The roman numeral XVII" should "be converted to 17" in {
    assert(romanNumerals.convertRomanNumeralToNumber("XVII") == 17)
  }
//    18	XVIII
  "A number of value 18" should "be converted to the roman numeral XVIII" in {
    assert(romanNumerals.convertNumberToRomanNumeral(18) == "XVIII")
  }
  "The roman numeral XVIII" should "be converted to 18" in {
    assert(romanNumerals.convertRomanNumeralToNumber("XVIII") == 18)
  }
//    19	XIX
  "A number of value 19" should "be converted to the roman numeral XIX" in {
    assert(romanNumerals.convertNumberToRomanNumeral(19) == "XIX")
  }
  "The roman numeral XIX" should "be converted to 19" in {
    assert(romanNumerals.convertRomanNumeralToNumber("XIX") == 19)
  }
//    20	XX
  "A number of value 20" should "be converted to the roman numeral XX" in {
    assert(romanNumerals.convertNumberToRomanNumeral(20) == "XX")
  }
  "The roman numeral XX" should "be converted to 20" in {
    assert(romanNumerals.convertRomanNumeralToNumber("XX") == 20)
  }
//    21	XXI
  "A number of value 21" should "be converted to the roman numeral XXI" in {
    assert(romanNumerals.convertNumberToRomanNumeral(21) == "XXI")
  }
  "The roman numeral XXI" should "be converted to 21" in {
    assert(romanNumerals.convertRomanNumeralToNumber("XXI") == 21)
  }
//    22	XXII
  "A number of value 22" should "be converted to the roman numeral XXII" in {
    assert(romanNumerals.convertNumberToRomanNumeral(22) == "XXII")
  }
  "The roman numeral XXII" should "be converted to 22" in {
    assert(romanNumerals.convertRomanNumeralToNumber("XXII") == 22)
  }
//    23	XXIII
  "A number of value 23" should "be converted to the roman numeral XXIII" in {
    assert(romanNumerals.convertNumberToRomanNumeral(23) == "XXIII")
  }
  "The roman numeral XXIII" should "be converted to 23" in {
    assert(romanNumerals.convertRomanNumeralToNumber("XXIII") == 23)
  }
//    24	XXIV
  "A number of value 24" should "be converted to the roman numeral XXIV" in {
    assert(romanNumerals.convertNumberToRomanNumeral(24) == "XXIV")
  }
  "The roman numeral XXIV" should "be converted to 24" in {
    assert(romanNumerals.convertRomanNumeralToNumber("XXIV") == 24)
  }
//    30	XXX
  "A number of value 30" should "be converted to the roman numeral XXX" in {
    assert(romanNumerals.convertNumberToRomanNumeral(30) == "XXX")
  }
  "The roman numeral XXX" should "be converted to 30" in {
    assert(romanNumerals.convertRomanNumeralToNumber("XXX") == 30)
  }
//    40	XL
  "A number of value 40" should "be converted to the roman numeral XL" in {
    assert(romanNumerals.convertNumberToRomanNumeral(40) == "XL")
  }
  "The roman numeral XL" should "be converted to 40" in {
    assert(romanNumerals.convertRomanNumeralToNumber("XL") == 40)
  }
//    50	L
  "A number of value 50" should "be converted to the roman numeral L" in {
    assert(romanNumerals.convertNumberToRomanNumeral(50) == "L")
  }
  "The roman numeral L" should "be converted to 50" in {
    assert(romanNumerals.convertRomanNumeralToNumber("L") == 50)
  }
//    60	LX
  "A number of value 60" should "be converted to the roman numeral LX" in {
    assert(romanNumerals.convertNumberToRomanNumeral(60) == "LX")
  }
  "The roman numeral LX" should "be converted to 60" in {
    assert(romanNumerals.convertRomanNumeralToNumber("LX") == 60)
  }
//    70	LXX
  "A number of value 70" should "be converted to the roman numeral LXX" in {
    assert(romanNumerals.convertNumberToRomanNumeral(70) == "LXX")
  }
  "The roman numeral LXX" should "be converted to 70" in {
    assert(romanNumerals.convertRomanNumeralToNumber("LXX") == 70)
  }
//    80	LXXX
  "A number of value 80" should "be converted to the roman numeral LXXX" in {
    assert(romanNumerals.convertNumberToRomanNumeral(80) == "LXXX")
  }
  "The roman numeral LXXX" should "be converted to 80" in {
    assert(romanNumerals.convertRomanNumeralToNumber("LXXX") == 80)
  }
//    90	XC
  "A number of value 90" should "be converted to the roman numeral XC" in {
    assert(romanNumerals.convertNumberToRomanNumeral(90) == "XC")
  }
  "The roman numeral XC" should "be converted to 90" in {
    assert(romanNumerals.convertRomanNumeralToNumber("XC") == 90)
  }
//    100	C
  "A number of value 100" should "be converted to the roman numeral C" in {
    assert(romanNumerals.convertNumberToRomanNumeral(100) == "C")
  }
  "The roman numeral C" should "be converted to 100" in {
    assert(romanNumerals.convertRomanNumeralToNumber("C") == 100)
  }
//    101	CI
  "A number of value 101" should "be converted to the roman numeral CI" in {
    assert(romanNumerals.convertNumberToRomanNumeral(101) == "CI")
  }
  "The roman numeral CI" should "be converted to 101" in {
    assert(romanNumerals.convertRomanNumeralToNumber("CI") == 101)
  }
//    102	CII
  "A number of value 1102" should "be converted to the roman numeral CII" in {
    assert(romanNumerals.convertNumberToRomanNumeral(102) == "CII")
  }
  "The roman numeral CII" should "be converted to 102" in {
    assert(romanNumerals.convertRomanNumeralToNumber("CII") == 102)
  }
//    200	CC
  "A number of value 200" should "be converted to the roman numeral CC" in {
    assert(romanNumerals.convertNumberToRomanNumeral(200) == "CC")
  }
  "The roman numeral CC" should "be converted to 200" in {
    assert(romanNumerals.convertRomanNumeralToNumber("CC") == 200)
  }
//    300	CCC
  "A number of value 300" should "be converted to the roman numeral CCC" in {
    assert(romanNumerals.convertNumberToRomanNumeral(300) == "CCC")
  }
  "The roman numeral CCC" should "be converted to 300" in {
    assert(romanNumerals.convertRomanNumeralToNumber("CCC") == 300)
  }
//    400	CD
  "A number of value 400" should "be converted to the roman numeral CD" in {
    assert(romanNumerals.convertNumberToRomanNumeral(400) == "CD")
  }
  "The roman numeral CD" should "be converted to 400" in {
    assert(romanNumerals.convertRomanNumeralToNumber("CD") == 400)
  }
//    500	D
  "A number of value 500" should "be converted to the roman numeral D" in {
    assert(romanNumerals.convertNumberToRomanNumeral(500) == "D")
  }
  "The roman numeral D" should "be converted to 500" in {
    assert(romanNumerals.convertRomanNumeralToNumber("D") == 500)
  }
//    600	DC
  "A number of value 600" should "be converted to the roman numeral DC" in {
    assert(romanNumerals.convertNumberToRomanNumeral(600) == "DC")
  }
  "The roman numeral DC" should "be converted to 600" in {
    assert(romanNumerals.convertRomanNumeralToNumber("DC") == 600)
  }
//    700	DCC
  "A number of value 700" should "be converted to the roman numeral DCC" in {
    assert(romanNumerals.convertNumberToRomanNumeral(700) == "DCC")
  }
  "The roman numeral DCC" should "be converted to 700" in {
    assert(romanNumerals.convertRomanNumeralToNumber("DCC") == 700)
  }
//    800	DCCC
  "A number of value 800" should "be converted to the roman numeral DCCC" in {
    assert(romanNumerals.convertNumberToRomanNumeral(800) == "DCCC")
  }
  "The roman numeral DCCC" should "be converted to 800" in {
    assert(romanNumerals.convertRomanNumeralToNumber("DCCC") == 800)
  }
//    900	CM
  "A number of value 900" should "be converted to the roman numeral CM" in {
    assert(romanNumerals.convertNumberToRomanNumeral(900) == "CM")
  }
  "The roman numeral CM" should "be converted to 900" in {
    assert(romanNumerals.convertRomanNumeralToNumber("CM") == 900)
  }
//    1000	M
  "A number of value 1000" should "be converted to the roman numeral M" in {
    assert(romanNumerals.convertNumberToRomanNumeral(1000) == "M")
  }
  "The roman numeral M" should "be converted to 1000" in {
    assert(romanNumerals.convertRomanNumeralToNumber("M") == 1000)
  }
//    1001	MI
  "A number of value 1001" should "be converted to the roman numeral MI" in {
    assert(romanNumerals.convertNumberToRomanNumeral(1001) == "MI")
  }
  "The roman numeral MI" should "be converted to 1001" in {
    assert(romanNumerals.convertRomanNumeralToNumber("MI") == 1001)
  }
//    1002	MII
  "A number of value 1002" should "be converted to the roman numeral MII" in {
    assert(romanNumerals.convertNumberToRomanNumeral(1002) == "MII")
  }
  "The roman numeral MII" should "be converted to 1002" in {
    assert(romanNumerals.convertRomanNumeralToNumber("MII") == 1002)
  }
//    1003	MIII
  "A number of value 1003" should "be converted to the roman numeral MIII" in {
    assert(romanNumerals.convertNumberToRomanNumeral(1003) == "MIII")
  }
  "The roman numeral MIII" should "be converted to 1003" in {
    assert(romanNumerals.convertRomanNumeralToNumber("MIII") == 1003)
  }
//    1900	MCM
  "A number of value 1900" should "be converted to the roman numeral MCM" in {
    assert(romanNumerals.convertNumberToRomanNumeral(1900) == "MCM")
  }
  "The roman numeral MCM" should "be converted to 1900" in {
    assert(romanNumerals.convertRomanNumeralToNumber("MCM") == 1900)
  }
//    2000	MM
  "A number of value 2000" should "be converted to the roman numeral MM" in {
    assert(romanNumerals.convertNumberToRomanNumeral(2000) == "MM")
  }
  "The roman numeral MM" should "be converted to 2000" in {
    assert(romanNumerals.convertRomanNumeralToNumber("MM") == 2000)
  }
//    2001	MMI
  "A number of value 2001" should "be converted to the roman numeral MMI" in {
    assert(romanNumerals.convertNumberToRomanNumeral(2001) == "MMI")
  }
  "The roman numeral MMI" should "be converted to 2001" in {
    assert(romanNumerals.convertRomanNumeralToNumber("MMI") == 2001)
  }
//    2002	MMII
  "A number of value 2002" should "be converted to the roman numeral MMII" in {
    assert(romanNumerals.convertNumberToRomanNumeral(2002) == "MMII")
  }
  "The roman numeral MMII" should "be converted to 2002" in {
    assert(romanNumerals.convertRomanNumeralToNumber("MMII") == 2002)
  }
//    2100	MMC
  "A number of value 2100" should "be converted to the roman numeral MMC" in {
    assert(romanNumerals.convertNumberToRomanNumeral(2100) == "MMC")
  }
  "The roman numeral MMC" should "be converted to 2100" in {
    assert(romanNumerals.convertRomanNumeralToNumber("MMC") == 2100)
  }
//    3000	MMM
  "A number of value 3000" should "be converted to the roman numeral MMM" in {
    assert(romanNumerals.convertNumberToRomanNumeral(3000) == "MMM")
  }
  "The roman numeral MMM" should "be converted to 3000" in {
    assert(romanNumerals.convertRomanNumeralToNumber("MMM") == 3000)
  }

  //edge cases

  "A number of 0" should "returns no valid input" in {
    assert(romanNumerals.convertNumberToRomanNumeral(0) == "no valid input")
  }
  "A number larger than 3000" should "returns please input a number up to 3000" in {
    assert(romanNumerals.convertNumberToRomanNumeral(4000) == "please input a number up to 3000")
  }
  "A number smaller than 0" should "returns negative numbers are not supported" in {
    assert(romanNumerals.convertNumberToRomanNumeral(-7) == "negative numbers are not supported")
  }
  "AIII" should "return 0" in {
    assert(romanNumerals.convertRomanNumeralToNumber("AIII") == 0)
  }
  "CJF" should "return 0" in {
    assert(romanNumerals.convertRomanNumeralToNumber("CJF") == 0)
  }
  "IJK" should "return 0" in {
    assert(romanNumerals.convertRomanNumeralToNumber("IJK") == 0)
  }
//


}
