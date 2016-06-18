package org.karmapa.analyzer.lucene;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.Tokenizer;

public final class BoAnalyzer extends Analyzer {

  public BoAnalyzer() {
  }

  public BoAnalyzer(boolean useSmart) {
    super();
  }

  @Override
  protected TokenStreamComponents createComponents(String fieldName) {
    Tokenizer _BoTokenizer = new BoTokenizer();
    return new TokenStreamComponents(_BoTokenizer);
  }
}
