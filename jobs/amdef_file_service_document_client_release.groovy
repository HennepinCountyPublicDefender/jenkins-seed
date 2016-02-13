mavenJob('amdef_file_service_document_client_release') {
  scm {
      git('https://github.com/HennepinCountyPublicDefender/amdef-file-service-document-client.git')
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
