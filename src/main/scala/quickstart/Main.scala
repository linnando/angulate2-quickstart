package quickstart

import angulate2.std._
import angulate2.platformBrowser.BrowserModule

@NgModule(
  imports = @@[BrowserModule],
  declarations = @@[AppComponent, TestComponent, TestWithConstructorComponent],
  bootstrap = @@[AppComponent]
)
@scalajs.js.annotation.JSExportTopLevel("AppModule")
class AppModule {

}

@Component(
  selector = "my-app",
  template = "<h1>Hello Angular!<h1>"
)
class AppComponent {

}
