job('amdef-file-service-document-client-release') {
    scm {
        git('git@github.com:HennepinCountyPublicDefender/amdef-file-service-document-client.git')
    },
  wrappers {
      mavenRelease {
          scmUserEnvVar('hennepinPdoBuilderRobot')
          scmPasswordEnvVar('MY_PASSWORD_ENV')
          releaseGoals('release:prepare release:perform')
          dryRunGoals('-DdryRun=true release:prepare')
          selectCustomScmCommentPrefix()
          selectAppendJenkinsUsername()
          selectScmCredentials()
          numberOfReleaseBuildsToKeep(5)
      }
  }
}
