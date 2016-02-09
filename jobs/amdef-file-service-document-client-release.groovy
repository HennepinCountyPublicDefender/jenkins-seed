job('amdef-file-service-document-client-release') {
  scm {
      git('git@github.com:HennepinCountyPublicDefender/amdef-file-service-document-client.git')
  }
  wrappers {
      mavenRelease {
          releaseGoals('release:prepare release:perform')
          dryRunGoals('-DdryRun=true release:prepare')
          selectScmCredentials()
          numberOfReleaseBuildsToKeep(5)
      }
  }
}
