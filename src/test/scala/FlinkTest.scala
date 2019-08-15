import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment

object FlinkTest extends App {

  val env = StreamExecutionEnvironment.getExecutionEnvironment

  import org.apache.flink.streaming.api.scala._

  private var dataStream: DataStream[(Int, Int)] = env.fromElements(Tuple2(1, 2), Tuple2(3, 4))
  dataStream.print()

  env.execute()

}
