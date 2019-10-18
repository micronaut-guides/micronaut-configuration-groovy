package micronaut.configuration.groovy

class TeamAdmin {

    String manager, coach, president

    // should use the builder pattern to create the object
    private TeamAdmin() {
    }

    static Builder builder() {
        return new Builder()
    }

    static class Builder { // <1>
        String manager
        String coach
        String president

        // <2>
        Builder withManager(String manager) {
            this.manager = manager
            this
        }

        Builder withCoach(String coach) {
            this.coach = coach
            this
        }

        Builder withPresident(String president) {
            this.president = president
            this
        }

        TeamAdmin build() { // <3>
            TeamAdmin teamAdmin = new TeamAdmin()
            teamAdmin.manager = this.manager
            teamAdmin.coach = this.coach
            teamAdmin.president = this.president
            teamAdmin
        }
    }
}
