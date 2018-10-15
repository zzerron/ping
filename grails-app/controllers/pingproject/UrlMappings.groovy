package pingproject

class UrlMappings {

    static mappings = {
        "/$controller/$id?(.$format)?" {
            controller = "ping"
            action = "index"
        }
        "/list"{
            controller = "ping"
            action = "list"
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
