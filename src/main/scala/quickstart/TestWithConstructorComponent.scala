package quickstart

import angulate2.std._

@Component(
  selector = "test-with-constructor",
  template = "",
  styles = @@@("")
)
class TestWithConstructorComponent(param: Int) extends AbstractTestWithConstructorComponent(param) {
}
