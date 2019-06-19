package grails400rc2

import grails.events.annotation.gorm.Listener
import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.grails.datastore.mapping.engine.event.SaveOrUpdateEvent
import org.grails.orm.hibernate.cfg.HibernateMappingContext

import javax.annotation.PostConstruct

@Transactional
@CompileStatic
@Slf4j
class PersonService {

    HibernateMappingContext grailsDomainClassMappingContext

    @PostConstruct
    def init() {
        log.debug "init()"
        log.debug "grailsDomainClassMappingContext: ${grailsDomainClassMappingContext}"
    }

    @Listener(Head)
    def headMethod(SaveOrUpdateEvent event) {
        1
    }

    @Listener(Nose)
    def noseMethod(SaveOrUpdateEvent event) {
        1
    }
}
