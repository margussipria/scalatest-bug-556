import org.scalatest.FunSuite

case class JsPath()

case class TestException(value: Seq[JsPath]) extends Throwable

class TestSpec extends FunSuite {
  test("1") {
    throw TestException(List(JsPath()))
  }
  test("2") {
    assert(true === true)
  }
}
