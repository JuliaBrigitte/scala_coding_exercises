package com.techreturners.exercise002

import org.scalatest.flatspec.AnyFlatSpec

class Exercise002Test extends AnyFlatSpec {

  val exercise002 = new Exercise002
  var paul=Person("Paul", "Winter", "Manchester", 7)
  var paul1=Person("Paul1", "Winter", "Manchester", 15)
  var paul2=Person("Paul2", "Winter", "Manchester", 16)
  var sheila=Person("Sheila", "Clark", "Manchester", 55)
  var heather=Person("Heather", "Smith", "London", 19)
  var pedro=Person("Pedro", "Johnston", "Bristol", 88)
  "A person" should "be correctly identified as being from Manchester" in {
    //val person = Person("Peter", "Smith", "Manchester", 23)
    assert(exercise002.isFromManchester(paul))
    assert(exercise002.isFromManchester(sheila))
  }

  it should "be correctly identified as residing in somewhere other than Manchester" in {
    //val person = Person("Susan", "Farmer", "Leeds", 23)
    assert(!exercise002.isFromManchester(pedro))
    assert(!exercise002.isFromManchester(heather))
  }

  "A person" should "be correctly identified as being able to watch an over 18 film" in {
    //val person = Person("Peter", "Smith", "Manchester", 23)
    assert(exercise002.canWatchFilm(sheila,18))
    assert(exercise002.canWatchFilm(heather,18))
    assert(exercise002.canWatchFilm(pedro,18))
  }

  it should "be correctly rejected from watching an over 16 film" in {
    //val person = Person("Peter", "Smith", "Manchester", 15)

    assert(!exercise002.canWatchFilm(paul,16))
    assert(!exercise002.canWatchFilm(paul1,16))
    assert(!exercise002.canWatchFilm(paul2,16))
  }

}
