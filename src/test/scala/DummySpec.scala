import org.specs2.mutable.Specification

class DummySpec extends Specification {

  "Dummy" should {

    "be sure that 1 + 1 == 2" in {
      (1 + 1) must_== 2
    }

  }
}