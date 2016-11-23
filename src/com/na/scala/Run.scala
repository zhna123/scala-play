/**
  * Created by nz026920 on 8/24/16.
  */
object Run {
  implicit class IntTimes(val x: Int) {
    def times [A](f: => A): Unit = {
      def loop(current: Int): Unit =
        if (current > 0) {
          f
          loop(current - 1)
        }
        loop(x)
    }
  }
}



