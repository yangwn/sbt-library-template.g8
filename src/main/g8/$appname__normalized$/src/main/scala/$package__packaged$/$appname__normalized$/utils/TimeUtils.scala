package $package$.$appname;format="word"$.utils

import java.time.format.DateTimeFormatter
import java.time.{LocalDate, LocalDateTime, LocalTime}

/**
  * 时间工具类
  *
  * @wunyang
  */
object TimeUtils {

  val dayFormat = DateTimeFormatter.ofPattern("ddMMyyyy")
  val hourFormat = DateTimeFormatter.ofPattern("hhmmss")
  val dateTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")

  def getCurrentDate() = {
    LocalDate.now().format(dayFormat)
  }

  def getCurrentHour() = {
    LocalTime.now().format(hourFormat)
  }

  def getCurrentDateTime() = {
    LocalDateTime.now().format(dateTimeFormat)
  }

}
