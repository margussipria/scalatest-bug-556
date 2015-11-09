import org.scalatest.FunSuite
import play.api.libs.json._

class TestSpec extends FunSuite {
  test("1") {
    JsObject(Seq.empty).as[JsArray]
  }
}
