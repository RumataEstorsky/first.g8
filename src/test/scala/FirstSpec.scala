import org.specs2.mutable.Specification

class FirstSpec extends Specification {

  "Specification" should {

    "be sure that 1 + 1 == 2" in {
      (1 + 1) must_== 2
    }

  }
}