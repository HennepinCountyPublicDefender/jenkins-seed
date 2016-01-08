# jenkins-seed



job('amdef-file-service-document-client') {
    scm {
        git('git@github.com:HennepinCountyPublicDefender/amdef-file-service-document-client.git')
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {
        maven('-e clean test deploy')
    }
}
