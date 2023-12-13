package src.co.edu.uptc.model;

public class PerformerPrize {
    private String premiationDate; // La fecha de premiación
    private PrizeDetail prizeDetail; // El detalle del premio

    // Constructor que acepta los detalles del premio
    public PerformerPrize(String name, String description, String organization) {
        // Puedes establecer premiationDate con un valor por defecto o permitir que se establezca más tarde
        this.premiationDate = "Fecha por defecto"; // O alguna otra lógica para establecer la fecha
        // Crea un nuevo objeto PrizeDetail con los parámetros proporcionados
        this.prizeDetail = new PrizeDetail(name, description, organization);
    }

    // Getters y setters para premiationDate y prizeDetail
    public String getPremiationDate() {
        return premiationDate;
    }

    public void setPremiationDate(String premiationDate) {
        this.premiationDate = premiationDate;
    }

    public PrizeDetail getPrizeDetail() {
        return prizeDetail;
    }

    public void setPrizeDetail(PrizeDetail prizeDetail) {
        this.prizeDetail = prizeDetail;
    }

}
