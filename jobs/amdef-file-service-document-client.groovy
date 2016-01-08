job('amdef-file-service-document-client') {
    scm {
        git('git@github.com:HennepinCountyPublicDefender/amdef-file-service-document-client.git')
    }
    triggers {
        scm('H/05 * * * *')
    }
    steps {
        maven('-e clean test deploy')
    }
}
