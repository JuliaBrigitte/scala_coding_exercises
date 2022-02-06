package com.techreturners.exercise003

import org.scalatest.flatspec.AnyFlatSpec
import scala.util.Sorting.quickSort

class Exercise003Test extends AnyFlatSpec {

  val exercise003 = new Exercise003

//  Pistachio: 0
//  Raspberry Ripple: 1
//  Vanilla: 2
//  Mint Chocolate Chip: 3
//  Chocolate: 4
//  Mango Sorbet: 5

  "A mint ice cream" should "be correctly identified and the code returned" in {
    assert(exercise003.getIceCreamCode("Mint Chocolate Chip") == 3)
  }

  "A Mango Sorbet ice cream" should "be correctly identified and the code returned" in {
    assert(exercise003.getIceCreamCode("Mango Sorbet") == 5)
  }

  "A Sour Cream ice cream" should "be correctly identified as invalid with code -1" in {
    assert(exercise003.getIceCreamCode("Sour Cream") == -1)
  }

  "All available flavours" should "be correctly returned" in {

    val flavours = Array("Pistachio",
      "Raspberry Ripple",
      "Vanilla",
      "Mint Chocolate Chip",
      "Chocolate",
      "Mango Sorbet"
    )
    val testFlavours=exercise003.iceCreamFlavours
    //sameElements does not work if in different order
    //https://stackoverflow.com/questions/29008500/scala-sets-contain-the-same-elements-but-sameelements-returns-false
    quickSort(testFlavours)
    quickSort(flavours)
    assert(testFlavours sameElements flavours)
  }
}
