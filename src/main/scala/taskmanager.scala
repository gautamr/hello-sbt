import java.time.LocalDate

/**
  * Created by gautamr on 4/28/2017.
  */
object TaskManager {
  def allTasksDueToday(tasks: List[Task]): List[Task] = tasks.filter(_.dueOn.isEqual(LocalDate.now))
}
