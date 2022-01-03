package server.companydetails;

import problemdetail.ProblemDetail;

import java.util.Optional;

public class CompanyDetailsServerResponse {

    private Optional<String> symbol;
    private Optional<String> name;
    private Optional<String> description;
    private Optional<String> sector;
    private Optional<String> peRatio;
    private Optional<String> exchange;
    private Optional<ProblemDetail> problemDetail;

    public Optional<String> getSymbol() {
        return symbol;
    }

    public void setSymbol(Optional<String> symbol) {
        this.symbol = symbol;
    }

    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(Optional<String> description) {
        this.description = description;
    }

    public Optional<String> getSector() {
        return sector;
    }

    public void setSector(Optional<String> sector) {
        this.sector = sector;
    }

    public Optional<String> getPeRatio() {
        return peRatio;
    }

    public void setPeRatio(Optional<String> peRatio) {
        this.peRatio = peRatio;
    }

    public Optional<String> getExchange() {
        return exchange;
    }

    public void setExchange(Optional<String> exchange) {
        this.exchange = exchange;
    }

    public Optional<ProblemDetail> getProblemDetail() {
        return problemDetail;
    }

    public void setProblemDetail(Optional<ProblemDetail> problemDetail) {
        this.problemDetail = problemDetail;
    }
}
