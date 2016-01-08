job('hjip.sils.client') {
    scm {
        git('git@github.com:HennepinCountyPublicDefender/hjip.sils.client.git')
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {
        maven('-e clean test deploy')
    }
}
