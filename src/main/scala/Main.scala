import akka.actor.ActorSystem
import com.typesafe.scalalogging.LazyLogging
import slick.jdbc.PostgresProfile.api._

object Main extends App with LazyLogging {
    implicit val system = ActorSystem("$name$")
    implicit val ec = system.dispatcher

    val db = Database.forConfig("db")
    db.run(sql"SELECT COUNT(*) FROM a".as[Int]).map(println)

    logger.info("Hello")
}

