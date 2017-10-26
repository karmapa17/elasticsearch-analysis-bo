package org.elasticsearch.index.analysis;

import org.apache.lucene.analysis.Tokenizer;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.index.IndexSettings;
import org.karmapa.analyzer.lucene.BoTokenizer;

public class BoTokenizerFactory extends AbstractTokenizerFactory {

  public BoTokenizerFactory(IndexSettings indexSettings, Environment env, String name, Settings settings) {
      super(indexSettings, name, settings);
  }

  @Override
  public Tokenizer create() {
      return new BoTokenizer();
  }
}
