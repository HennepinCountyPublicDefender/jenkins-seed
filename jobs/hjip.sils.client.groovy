job('hjip.sils.client') {
    scm {
        git('git@github.com:HennepinCountyPublicDefender/hjip.sils.client.git')
    }
    triggers {
        scm('H/05 * * * *')
    }
    steps {
        maven('-e clean test deploy')
    }
}
