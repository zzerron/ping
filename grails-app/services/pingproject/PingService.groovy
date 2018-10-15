package pingproject

import grails.gorm.services.Service
import ping.Ping

@Service(Ping)
interface PingService {

    Ping get(Serializable id)

    List<Ping> list(Map args)

    Long count()

    void delete(Serializable id)

    Ping save(Ping ping)
}
