package server.technicalanalysis;

import problemdetail.ProblemDetail;

import java.util.Optional;

public class TechnicalAnalysisServerResponseBuilder {

    private Optional<Indicator> indicator;
    private Optional<ProblemDetail> problemDetail;

    public static TechnicalAnalysisServerResponseBuilder builder() {
        return new TechnicalAnalysisServerResponseBuilder();
    }

    public TechnicalAnalysisServerResponse build() {
        TechnicalAnalysisServerResponse response = new TechnicalAnalysisServerResponse();
        response.setIndicator(indicator);
        response.setProblemDetail(problemDetail);
        return response;
    }

    public TechnicalAnalysisServerResponseBuilder indicator(Optional<Indicator> indicator) {
        this.indicator = indicator;
        return this;
    }

    public TechnicalAnalysisServerResponseBuilder problemDetail(Optional<ProblemDetail> problemDetail) {
        this.problemDetail = problemDetail;
        return this;
    }
}
