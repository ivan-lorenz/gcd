import org.scalatest.FlatSpec

class GCDTest extends FlatSpec {

  behavior of "GCD"

  it should "find gcd for a case" in {
    assert(GCD.gcd_euclid(1,5) == 1)
  }

  it should "find gcd for b case" in {
    assert(GCD.gcd_euclid(10,5) == 5)
  }

  it should "find gcd for c case" in {
    assert(GCD.gcd_euclid(931,314) == 1)
  }


}
