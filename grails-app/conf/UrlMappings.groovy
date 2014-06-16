class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: "elastic", parseRequest: true) {
            action = [GET: "hello"]
        }

        "/status"(controller: "elastic", parseRequest: true) {
            action = [GET: "status"]
        }




        "500"(view:'/error')
	}
}
