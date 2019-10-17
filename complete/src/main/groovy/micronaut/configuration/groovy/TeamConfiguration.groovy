package micronaut.configuration.groovy

import io.micronaut.context.annotation.ConfigurationProperties

@ConfigurationProperties("team")
class TeamConfiguration {
    String name
    String color
    List<String> playerNames
}
