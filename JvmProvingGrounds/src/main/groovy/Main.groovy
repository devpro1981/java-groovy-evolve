import com.modern.CalculateNewTax
import com.modern.CalculateOldTax
import com.startup.Creature
import com.startup.Point

static void main(String[] args) {
  println "Hello world!"
  Point aPoint = new Point(5.0, 6.0)
  println(aPoint.toString())

  Creature dangerous = new Creature(45.0, 67.0)
  println(dangerous.toString())

  int earning = 500_000
  println("Taxed income = ${CalculateOldTax.getTaxedIncome(earning)}")
  double modifiedEarning = 1_000_000
  println("Enhanced taxed income = ${CalculateNewTax.taxRate(modifiedEarning)}")
}

static String generateLongString(int length) {
  StringBuilder sb = new StringBuilder(length)
  sb.toString()
}