package ping

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class PingSpec extends Specification implements DomainUnitTest<Ping> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
