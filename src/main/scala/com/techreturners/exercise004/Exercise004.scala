Skip to content
Search or jump to…
Pull requests
  Issues
Marketplace
Explore

@JuliaBrigitte
JuliaBrigitte
/
scala_coding_exercises
Public
forked from techreturners/scala_coding_exercises
Code
Pull requests
  Actions
Projects
Wiki
Security
Insights
Settings
scala_coding_exercises/src/main/scala/com/techreturners/exercise004/Exercise004.scala
@JuliaBrigitte
JuliaBrigitte different/shorter solutions and code style pdf applied
  Latest commit d3a670c 8 hours ago
History
2 contributors
@JuliaBrigitte@eggsy84
47 lines (38 sloc)  1.31 KB

package com.techreturners.exercise004

import java.time.{LocalDate, LocalDateTime, ZoneId}

class Exercise004(var dateTime: LocalDateTime)
{
  // Hint take a look at Scala auxiliary constructors
  // https://docs.scala-lang.org/overviews/scala-book/classes-aux-constructors.html
  // Try constructing a "LocalDateTime" from a "LocalDate"
  // You might need to default the time to be something like midnight

  //take now as input if no input parameter
  def this() =
  {
    this(LocalDateTime.now())
  }

  def convertLocalDateToLocalDateTime(dateInput: LocalDate): LocalDateTime =
  {
    var inputInstant=dateInput.atStartOfDay(ZoneId.systemDefault()).toInstant
    var inputLocalDateTime=LocalDateTime.ofInstant(inputInstant,ZoneId.systemDefault())
    return inputLocalDateTime
  }

  def this(dateInput: LocalDate) =
  {
    //convert LocalDate to LocalDateTime
    this(dateInput.atStartOfDay());
  }

  def getDateTimeWithGigaSecond: LocalDateTime =
  {
    dateTime.plusSeconds(1E9.toLong)
  }

}
