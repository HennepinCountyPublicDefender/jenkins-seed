job('amdef_file_service_document_client') {
    scm {
        git('git@github.com:HennepinCountyPublicDefender/amdef-file-service-document-client.git')
    }
    triggers {
        scm('H/05 * * * *')
    }
    steps {
        maven('_e clean test deploy')
    }
}
