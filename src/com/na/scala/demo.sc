object demo {
  println("scala demo!")

  val cantChangeMe: String = "Immutable Value"
  var changeMe: String = "Mutable Stuff"

  // cantChangeMe = "try change" // ! error!!!
  changeMe = "changing"

  // scala can inferred types but it is statically typed language.
  // scala knows its types at compile time
  val youHaveToFindOutMyDataType = 200

  // functions


}

// Uniform Access Principle
// defining or using a function in scala is the same like defining or using a variable
// if we dont put a return data type, a default data type Unit will be implied
def saySomething(name: String) = {
  // interpolation
  print(s"Hello $name")
}
saySomething("Harris")

val superString =
  """ multiple line string,
      allow return, space, tab,
      and others...
  """
print(superString)

def saySomething2(name: String): Unit = {
  print(s"Hello $name")
}
saySomething2("Mari")

// dont have to use return keyword. assume last statement is the return value
def returnStringByDefault(): String = {
  "you will get me"
}
returnStringByDefault()

// functions support named parameters
// dont care order; just use names and mix them
def useNamedParameters(param1: String, param2: Int, param3: Double) = {
  println(s"param1: $param1, param2: $param2, param3: $param3")
}
useNamedParameters(param3 = 0.001, param1 = "demo", param2 = 99)

// classes & objects

object demo1 {
  val t800 = new Cyborg("Arnie", "T-800", "Skynet")
  t800.name = "Johnny"
  t800.say("hi")
}
// mannually define setter - very strange..
class Cyborg(var _name: String, val model: String, val manufacturer: String) {
  def say(word: String) = {
    println(s"Hasta la vista, $word")
  }

  def name = _name
  // no space around equal sign!
  def name_=(newName: String) {
    println(s"Now changing name to $newName")
    _name = newName
  }
}

// case classes
case class Android(name:String, model:String, manufacturer: String)

object demo2 {
  val C3PO = Android("C3PO", "Human-Like Android", "Anakin Skywalker")
  val manufacturer = C3PO.manufacturer
  print(s"my manufacturer is $manufacturer")
}

// traits - interfaces on steroids
// allow partial implementations, but not allowed to define constructors in traits

trait Robot {
  def say(word: String) = {
    println(s"I say: $word")
  }
}
case class Android2(name:String, model:String, manufacturer: String) extends Robot

object demo3 {
  val C3PO = Android2("C3PO", "Human-Like Android", "Anakin Skywalker")
  C3PO.say("I am an android")
  // pattern matching
  def displayRobotInfo(robot: Robot) = {
    robot match {
      case Android2(_,_,"Anakin Skywalker") => println("oh no! you belong to Darth Vader!")
      case _=> println("fall back")
    }
  }
  displayRobotInfo(C3PO)

}


// higher order functions
// map
object demo4 {
  val words = List("Lorem", "ipsum", "dolor", "sit", "amet")
  words.map(word => word.toUpperCase())
}























