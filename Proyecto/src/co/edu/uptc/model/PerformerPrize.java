package src.co.edu.uptc.model;

public class PerformerPrize {
    private String premiationDate;
    private PrizeDetail prizeDetail;

    public PerformerPrize(String premiationDate, PrizeDetail prizeDetail) {
        this.premiationDate = premiationDate;
        this.prizeDetail = prizeDetail; // Inicializa prizeDetail
    }

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
