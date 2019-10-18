//tag::teamConfigClassNoBuilder[]
package micronaut.configuration.groovy

import io.micronaut.context.annotation.ConfigurationBuilder
import io.micronaut.context.annotation.ConfigurationProperties

@ConfigurationProperties("team")
class TeamConfiguration {
    String name
    String color
    List<String> playerNames
//end::teamConfigClassNoBuilder[]

    @ConfigurationBuilder(prefixes = "with", configurationPrefix = "team-admin")
    TeamAdmin.Builder builder = TeamAdmin.builder()
}
