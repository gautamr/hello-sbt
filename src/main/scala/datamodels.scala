/**
  * Created by gautamr on 4/28/2017.
  */
import java.time.LocalDate

case class Task(title: String, dueOn: LocalDate, tags: Seq[String] = Seq(), finished: Boolean = false)
