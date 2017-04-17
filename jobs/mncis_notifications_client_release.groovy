mavenJob('mncis_notifications_client_build_release') {
  jdk('Java 8')
  scm {
      git('https://github.com/HennepinCountyPublicDefender/mncis-notifications-client.git','*/master')
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
