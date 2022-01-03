package server.companydetails;

import problemdetail.ProblemDetail;

import java.util.Optional;

public class CompanyDetailsServerResponseBuilder {

    private Optional<String> symbol;
    private Optional<String> name;
    private Optional<String> description;
    private Optional<String> sector;
    private Optional<String> peRatio;
    private Optional<String> exchange;
    private Optional<ProblemDetail> problemDetail;

    public static CompanyDetailsServerResponseBuilder builder
            = new CompanyDetailsServerResponseBuilder();

    public CompanyDetailsServerResponse build() {
        CompanyDetailsServerResponse response = new CompanyDetailsServerResponse();
        response.setSymbol(symbol);
        response.setName(name);
        response.setDescription(description);
        response.setSector(sector);
        response.setPeRatio(peRatio);
        response.setExchange(exchange);
        response.setProblemDetail(problemDetail);
        return response;
    }

    public CompanyDetailsServerResponseBuilder symbol(Optional<String> symbol) {
        this.symbol = symbol;
        return this;
    }

    public CompanyDetailsServerResponseBuilder name(Optional<String> name) {
        this.name = name;
        return this;
    }

    public CompanyDetailsServerResponseBuilder description(Optional<String> description) {
        this.description = description;
        return this;
    }

    public CompanyDetailsServerResponseBuilder sector(Optional<String> sector) {
        this.sector = sector;
        return this;
    }

    public CompanyDetailsServerResponseBuilder peRatio(Optional<String> peRatio) {
        this.peRatio = peRatio;
        return this;
    }

    public CompanyDetailsServerResponseBuilder exchange(Optional<String> exchange) {
        this.exchange = exchange;
        return this;
    }

    public CompanyDetailsServerResponseBuilder problemDetail(Optional<ProblemDetail> problemDetail) {
        this.problemDetail = problemDetail;
        return this;
    }
}