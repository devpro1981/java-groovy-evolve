import com.startup.Creature
import com.startup.Point

static void main(String[] args) {
  println "Hello world!"
  Point aPoint = new Point(5.0, 6.0)
  println(aPoint.toString())

  Creature dangerous = new Creature(45.0, 67.0)
  println(dangerous.toString())
}