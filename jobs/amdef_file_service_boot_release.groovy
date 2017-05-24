mavenJob('amdef_file_service_boot_release') {
  wipeOutWorkspace()
  jdk('Java 8')
  scm {
      git('https://github.com/HennepinCountyPublicDefender/amdef-file-service-boot.git')
      branch('master')
      configure { node ->
        node / 'extensions' << 'hudson.plugins.git.extensions.impl.LocalBranch' {
         localBranch('master')
        }
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
