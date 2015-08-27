package simple

object Simple {
  def formatTimes(timestamps: Seq[Long]): Seq[String] = {
    timestamps.map(Platform.format).map(_.dropRight(5)) // works but IntelliJ does not understand

  }
}
