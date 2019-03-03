package utilcalc

import scala.math.BigDecimal


object CalcDml{

  def CalcCv(tel: Int): Double = {

    val big1 = BigDecimal(tel)

    return big1.asInstanceOf[Double]

  }
}
