package co.edu.uptc.model;

public class Premio {
    private String premiationDate;
    private String description;
    private String name;
    private String organization;

    public Premio(String premiationDate, String description, String name, String organization) {
        this.premiationDate = premiationDate;
        this.description = description;
        this.name = name;
        this.organization = organization;
    }

    public String getPremiationDate() {
        return premiationDate;
    }

    public void setPremiationDate(String premiationDate) {
        this.premiationDate = premiationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String toString() {
        return "Premio{" + "premiationDate=" + premiationDate + ", description=" + description + ", name=" + name + ", organization=" + organization + '}';
    }
}
