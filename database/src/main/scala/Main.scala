import cats.effect.IO
import doobie._

trait Repo {
  def test: Transactor.Aux[IO, Unit] = ???
}

