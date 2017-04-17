job('mncis_notifications_client_build') {
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
