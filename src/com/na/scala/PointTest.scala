/**
  * Created by nz026920 on 8/24/16.
  */

// class name works as a constructor
class Point(val xc: Int, val yc: Int) {

  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
    println("Point x location: " + x)
    println("Point y location: " + y)
  }
}

// extends (allow extends only 1 class)
class Location(override val xc: Int, override val yc: Int, val zc: Int) extends Point(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int): Unit = {
    x = x + dx
    y = y + dy
    z = z + dz
    println("Point x location: " + x)
    println("Point y location: " + y)
    println("Point z location: " + z)
  }
}

// singleton object, no static members in scala
object PointTest {
  def main(args: Array[String]) {
    val pt = new Location(10, 20, 30);
    pt.move(10, 10, 10);
  }
}
