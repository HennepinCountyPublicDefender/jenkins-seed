job('amdef-file-service-boot') {
    scm {
        git('git@github.com:HennepinCountyPublicDefender/amdef-file-service-boot.git')
    }
    triggers {
        scm('H/05 * * * *')
    }
    steps {
        maven('-e clean test deploy')
    }
}
