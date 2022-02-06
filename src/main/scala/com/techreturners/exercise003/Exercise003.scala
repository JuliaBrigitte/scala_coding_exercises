package com.techreturners.exercise003
import scala.collection.mutable.ArrayBuffer


class Exercise003 {

  //  Pistachio: 0
  //  Raspberry Ripple: 1
  //  Vanilla: 2
  //  Mint Chocolate Chip: 3
  //  Chocolate: 4
  //  Mango Sorbet: 5

  var iceCreamFlavoursList: Map[String, Int] = Map("Pistachio"->0, "Raspberry Ripple"->1, "Vanilla"->2, "Mint Chocolate Chip"->3, "Chocolate"->4, "Mango Sorbet"->5).withDefaultValue(-1)

  def getIceCreamCode(iceCreamFlavour: String): Int =
  {
    iceCreamFlavoursList(iceCreamFlavour)
  }

  def iceCreamFlavours: Array[String] =
  {
    var flavours = ArrayBuffer[String]()
    iceCreamFlavoursList.foreach(flavour =>
    {
      flavours+=flavour._1
    }
    )
    flavours.toArray
  }

}
