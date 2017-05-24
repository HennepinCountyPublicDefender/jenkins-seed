mavenJob('amdef_file_service_boot_release') {
  jdk('Java 8')
  scm {
      git {
            remote {
                    name('origin')
                    url('https://github.com/HennepinCountyPublicDefender/amdef-file-service-boot.git')
                    }
            branch('master')
            extensions {
                    wipeOutWorkspace()
                    localBranch('master')
                    }
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
