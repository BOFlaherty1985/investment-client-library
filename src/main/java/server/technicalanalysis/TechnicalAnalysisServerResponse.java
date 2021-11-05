package server.technicalanalysis;

import problemdetail.ProblemDetail;

import java.util.Optional;

public class TechnicalAnalysisServerResponse {

    private Optional<Indicator> indicator;
    private Optional<ProblemDetail> problemDetail;

    public TechnicalAnalysisServerResponse() {
    }

    public Optional<Indicator> getIndicator() {
        return indicator;
    }

    public void setIndicator(Optional<Indicator> indicator) {
        this.indicator = indicator;
    }

    public Optional<ProblemDetail> getProblemDetail() {
        return problemDetail;
    }

    public void setProblemDetail(Optional<ProblemDetail> problemDetail) {
        this.problemDetail = problemDetail;
    }
}