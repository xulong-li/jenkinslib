package org.devops

def Build(buildType,buildShell){
  def buildTools = ["maven":"M2","gradle":"GRADLE","npm":"NPM"]
  println("当前选择的构建类型为 ${buildType}")
  buildHome= tool buildTools[buildType]
  sh "${buildHome}/bin/${buildType}  ${buildShell}"
}
