package micronaut.configuration.groovy


import groovy.transform.CompileStatic
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@CompileStatic
@Controller("/my")
class MyController {

    TeamConfiguration teamConfiguration

    MyController(TeamConfiguration teamConfiguration1) {
        this.teamConfiguration = teamConfiguration1
    }

    @Get("/team")
    HttpResponse<TeamConfiguration> team() {
        return HttpResponse.ok(this.teamConfiguration)
    }
}
