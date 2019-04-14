package utilcalc

import scala.math.BigDecimal


object CalcDml{

  def CalcCv(tel: Int) = {

    val big1 = BigDecimal(tel)

//    return big1.asInstanceOf[Double]
    big1.setScale(2, scala.math.BigDecimal.RoundingMode.HALF_UP)

//    val num3 = num3.setScale(4, scala.math.BigDecimal.RoundingMode.HALF_UP)

  }
}
