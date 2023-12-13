package co.edu.uptc.model;

public class Prize {
        private String name;
        private String description;
        private String organization;

        public Prize(String name, String description, String organization){
            this.name = name;
            this.description = description;
            this.organization = organization;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getOrganization() {
            return organization;
        }

        public void setOrganization(String organization) {
            this.organization = organization;
        }

    }
}
