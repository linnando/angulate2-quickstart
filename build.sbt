
lazy val commonSettings = Seq(
  organization := "de.surfice",
  version := "0.1.0-RC1",
  scalaVersion := "2.11.11",
  scalacOptions ++= Seq("-deprecation","-unchecked","-feature","-Xlint"),
  resolvers += Resolver.sonatypeRepo("snapshots"),
  libraryDependencies ++= Seq(
  ),
  publish := {},
  publishLocal := {}
)

import org.scalajs.core.tools.io.{VirtualJSFile, FileVirtualJSFile}

lazy val root = project.in(file(".")).
  enablePlugins(Angulate2Plugin,LiteServerPlugin).
  settings(commonSettings: _*).
  settings( 
    name := "angulate2-quickstart",
    libraryDependencies ++= Seq(
    ),
    ngBootstrap := Some("quickstart.AppModule"),
    systemJSMappings in fastOptJS ++= Seq(
      "@angular/core"                     -> "npm:@angular/core/bundles/core.umd.js",
      "@angular/common"                   -> "npm:@angular/common/bundles/common.umd.js",
      "@angular/compiler"                 -> "npm:@angular/compiler/bundles/compiler.umd.js",
      "@angular/platform-browser"         -> "npm:@angular/platform-browser/bundles/platform-browser.umd.js",
      "@angular/platform-browser-dynamic" -> "npm:@angular/platform-browser-dynamic/bundles/platform-browser-dynamic.umd.js",
      "@angular/http"                     -> "npm:@angular/http/bundles/http.umd.js",
      "@angular/router"                   -> "npm:@angular/router/bundles/router.umd.js",
      "@angular/forms"                    -> "npm:@angular/forms/bundles/forms.umd.js",
      "@angular/upgrade"                  -> "npm:@angular/upgrade/bundles/upgrade.umd.js",
      "rxjs"                              -> "npm:rxjs"
    )
  )

