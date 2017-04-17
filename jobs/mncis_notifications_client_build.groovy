job('mncis_notifications_client_build') {
    publishers {
        archiveJunit('**/target/surefire-reports/*.xml')
    }
    jdk('Java 8')
    scm {
        git('git@github.com:HennepinCountyPublicDefender/mncis-notifications-client.git')
    }
    triggers {
        scm('H/05 * * * *')
    }
    steps {
        maven('-e clean test deploy')
    }
}
