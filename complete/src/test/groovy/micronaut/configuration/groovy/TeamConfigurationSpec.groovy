package micronaut.configuration.groovy

import io.micronaut.context.ApplicationContext
import spock.lang.Specification

class TeamConfigurationSpec extends Specification {

    void "test team configuration"() {
        given:
        ApplicationContext ctx = ApplicationContext.run(ApplicationContext, [
                "team.name": 'evolution',
                "team.color": 'green',
                "team.player-names": ['Nirav Assar', 'Lionel Messi']
        ])

        when:
        TeamConfiguration teamConfiguration = ctx.getBean(TeamConfiguration)

        then:
        teamConfiguration.name == "evolution"
        teamConfiguration.color == "green"
        teamConfiguration.playerNames[0] == "Nirav Assar"
        teamConfiguration.playerNames[1] == "Lionel Messi"
    }
}
