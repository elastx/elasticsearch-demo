package elastdemo

import grails.converters.JSON
import groovyx.net.http.*
import static groovyx.net.http.ContentType.JSON
import groovyx.net.http.RESTClient
import static groovyx.net.http.ContentType.*



class ElasticController {

    def hello() {
        def result = [result:"Hello world3"]
        render result as JSON
    }

    def status() {
        def r = new RESTClient( 'http://localhost:9200' )
        def result = r.get(path:'/_cluster/health').data
        render result as JSON
    }
}