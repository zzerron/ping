package pingproject

import javafx.scene.input.DataFormat
import ping.Ping

import java.text.SimpleDateFormat

class PingController {
    PingService pingService
    def index() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd   hh:mm:ss")
        String date = dateFormat.format(new Date())
        String requestType = request.getMethod()
        String[] urlrequest = request.getRequestURI().split("ping/")
        String someTestData = "/"
        if (urlrequest.length == 2) {
            someTestData = urlrequest[1]
        }
        String ipClient = request.getRemoteAddr()

        def ping = new Ping(createDate: date, requestType: requestType, someTestData: someTestData, ipClient: ipClient)
        pingService.save(ping)

        response.setStatus(201)
        [count: pingService.count()]
    }

    def show(Long id) {
        respond Ping.get(id)
    }

    def list = {
         [pingList: pingService.list()]
    }
}
