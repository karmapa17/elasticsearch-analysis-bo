package org.elasticsearch.indices.analysis;

import org.apache.lucene.analysis.Tokenizer;
import org.elasticsearch.common.component.AbstractComponent;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.index.analysis.AnalyzerScope;
import org.elasticsearch.index.analysis.PreBuiltAnalyzerProviderFactory;
import org.elasticsearch.index.analysis.PreBuiltTokenizerFactoryFactory;
import org.elasticsearch.index.analysis.TokenizerFactory;
import org.karmapa.analyzer.lucene.BoAnalyzer;
import org.karmapa.analyzer.lucene.BoTokenizer;

/**
 * Registers indices level analysis components so, if not explicitly configured,
 * will be shared among all indices.
 */
public class BoIndicesAnalysis extends AbstractComponent {

  @Inject
  public BoIndicesAnalysis(final Settings settings, IndicesAnalysisService indicesAnalysisService, Environment env) {

    super(settings);

    indicesAnalysisService.analyzerProviderFactories().put("bo",
        new PreBuiltAnalyzerProviderFactory("bo", AnalyzerScope.GLOBAL,
          new BoAnalyzer()));

    indicesAnalysisService.tokenizerFactories().put("bo",
        new PreBuiltTokenizerFactoryFactory(new TokenizerFactory() {
          @Override
          public String name() {
            return "bo";
          }

          @Override
          public Tokenizer create() {
            return new BoTokenizer();
          }
    }));
  }
}
