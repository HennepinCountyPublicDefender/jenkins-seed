mavenJob('amdef-file-service-document-client-release') {
  jdk('Java 8')
  scm {
      git('https://github.com/HennepinCountyPublicDefender/amdef-file-service-document-client.git','*/master')
  }
  wrappers {
      mavenRelease {
          releaseGoals('release:prepare release:perform')
          dryRunGoals('-DdryRun=true release:prepare')
          selectScmCredentials(false)
          numberOfReleaseBuildsToKeep(5)
      }
  }
}
