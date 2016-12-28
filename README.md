# jenkins-seed


### Example
```
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
```

### Links
* [jenkins DSL Docs](https://jenkinsci.github.io/job-dsl-plugin/#method/javaposse.jobdsl.dsl.jobs.MavenJob.jdk)
* [Test site](http://job-dsl.herokuapp.com/)
