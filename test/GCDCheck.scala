import org.scalacheck.{Gen, Properties}
import org.scalacheck.Prop.forAll
import org.scalacheck.Test.Parameters


object GCDCheck extends Properties("GCD"){

  val genNonNegativesInts: Gen[Int] = Gen.choose(1, 1000)
  val listOfNonNegatives: Gen[Array[Int]] =
    for {
      size <- Gen.choose(2,1000)
      elems <- Gen.containerOfN[Array, Int](size, genNonNegativesInts)
    } yield elems

  property("both solutions should be equivalent") =
    forAll(genNonNegativesInts, genNonNegativesInts){(a,b)  =>
      val assertion = GCD.gcd_naive(a,b) == GCD.gcd_euclid(a,b)
      if (!assertion) {
        System.out.println(" Error en: GCD(" + a + "," + b + ")")
      }
      assertion
    }

//  override def overrideParameters(p: Parameters): Parameters = p.withMinSuccessfulTests(10000)

}
