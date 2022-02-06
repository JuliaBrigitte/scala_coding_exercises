package com.techreturners.exercise004

import java.time.{LocalDate, LocalDateTime, ZoneId}

class Exercise004(var dateTime: LocalDateTime)
{

  // Hint take a look at Scala auxiliary constructors
  // https://docs.scala-lang.org/overviews/scala-book/classes-aux-constructors.html
  // Try constructing a "LocalDateTime" from a "LocalDate"
  // You might need to default the time to be something like midnight

  def this() =
  {
    this(LocalDateTime.now())
  }

  def this(dateInput: LocalDate) =
  {
    //convert LocalDate to LocalDateTime
    //var inputInstant=dateInput.atStartOfDay(ZoneId.systemDefault()).toInstant
    //var inputLocalDateTime=LocalDateTime.ofInstant(inputInstant,ZoneId.systemDefault())
    this(LocalDateTime.ofInstant(dateInput.atStartOfDay(ZoneId.systemDefault()).toInstant,ZoneId.systemDefault()))
  }

  def getDateTimeWithGigaSecond: LocalDateTime =
    {
      dateTime.plusSeconds(1000000000)
    }


}
