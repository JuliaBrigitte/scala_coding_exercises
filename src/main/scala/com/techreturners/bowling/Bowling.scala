package com.techreturners.bowling

import scala.util.Try

class Bowling
{
  def calculateScore(resultString: String):Number=
  {
    var result=0
    var countNextStroke=false
    var countNextTwoStrokes=false
    //Calculate Score from resultString
    //For only numbers or - in stroke just add and treat - as 0
    //split resultString by blanks into array and add stroke results
    var countTurns=0
    resultString.split(" ").foreach(turn =>
    {
      countTurns=countTurns+1
      turn.split("").foreach(stroke =>
      {
        if (countNextStroke)
        {
          if (Try(stroke.toInt).isSuccess)
          {
            result=result + stroke.toInt
          }
          else if ("/" == stroke)
          {
            result=result+10
          }
          //For strike X you need to add 10 and remember to add the score of the next two strokes to this
          else if ("X" == stroke)
          {
            result=result+10
          }
          countNextStroke=false
        }
        if (countNextTwoStrokes)
        {
          if (Try(stroke.toInt).isSuccess)
          {
            result=result + stroke.toInt
          }
          else if ("/" == stroke)
          {
            result=result+10
          }
          //For strike X you need to add 10 and remember to add the score of the next two strokes to this
          else if ("X" == stroke)
          {
            result=result+10
          }
          countNextStroke=true
          countNextTwoStrokes=false
        }
        //if stroke is number or - just add
        //we have 10 turns unless we have spares or strikes at the end
        if (11 > countTurns)
        {
          if (Try(stroke.toInt).isSuccess)
          {
            //add number only if the turn does not end with a spare
            if (!turn.contains("/"))
            {
              result=result + stroke.toInt
            }
          }
          else if ("-" == stroke)
          {
            //- is 0
          }
          //For spare / you need to add 10 and remember to add the score of the next stroke to this
          else if ("/" == stroke)
          {
            result=result+10
            countNextStroke=true
          }
          //For strike X you need to add 10 and remember to add the score of the next two strokes to this
          else if ("X" == stroke)
          {
            result=result+10
            countNextTwoStrokes=true
          }


        }
      })
    })

    result
  }
}
