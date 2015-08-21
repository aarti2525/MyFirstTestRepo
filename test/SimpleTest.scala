

/**
 * @author aarti.chavan
 */
import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._
import play.Logger;
import play.api.test._
import play.api.test.Helpers._
@RunWith(classOf[JUnitRunner])
class SimpleTest  extends Specification {
 

  "The 'Hello world' string" should {
    "contain 11 characters" in {
    }
    "start with 'Hello'" in {
      "Hello world" must startWith("Hello")
    }
    "end with 'world'" in {
      "Hello world" must endWith("world")
    }
  }
  Logger.info("Hello world must have size(11)")
  
}