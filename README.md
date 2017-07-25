# angulate2-quickstart
Quickstart template for [angulate2](https://github.com/jokade/angulate2).

## Getting Started

### Prerequisites
Node.js must be installed in addition to `sbt`.

### Create configuration files
`sbt> fastOptJS::systemJS`

`sbt> fastOptJS::liteServerWriteConfigFile`

### Compile project
`sbt> fastOptJS`

### Run application
Start the lite-server in the project root directory:
`$ node_modules/lite-server/bin/lite-server --config=target/scala-2.11/bs-config-fastopt.json`

then point your browser to
`http://localhost:3000/index-fastopt.html`
