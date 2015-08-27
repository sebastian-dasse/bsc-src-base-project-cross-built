package simple

import utest._

object SimpleTest extends TestSuite {
  val tests = TestSuite{
    'format{
      'nil - assert(Simple.formatTimes(Nil) == Nil)
      'timeZero - {
        val timestamps = Seq(0L, 1L << 32)
        val expected = Seq(
          "1970-01-01T00:00:00",
          "1970-02-19T17:02:47"
        )
        val formatted = Simple.formatTimes(timestamps)
        assert(formatted == expected)
      }
    }
    'zero{
      0.0
    }
    "a test with a string-based name returning something" - {
      List(1, 2, 3)
    }
  }
}
