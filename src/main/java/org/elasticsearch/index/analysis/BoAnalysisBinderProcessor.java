package org.elasticsearch.index.analysis;

@Deprecated
public class BoAnalysisBinderProcessor extends AnalysisModule.AnalysisBinderProcessor {

  @Override
  public void processTokenFilters(TokenFiltersBindings tokenFiltersBindings) {
  }

  @Override
  public void processAnalyzers(AnalyzersBindings analyzersBindings) {
    analyzersBindings.processAnalyzer("bo", BoAnalyzerProvider.class);
  }

  @Override
  public void processTokenizers(TokenizersBindings tokenizersBindings) {
    tokenizersBindings.processTokenizer("bo", BoTokenizerFactory.class);
  }
}
