package org.elasticsearch.index.analysis;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.assistedinject.Assisted;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.index.Index;
import org.elasticsearch.index.settings.IndexSettingsService;
import org.karmapa.analyzer.lucene.BoAnalyzer;

@Deprecated
public class BoAnalyzerProvider extends AbstractIndexAnalyzerProvider<BoAnalyzer> {

  private final BoAnalyzer analyzer;

  @Inject
  public BoAnalyzerProvider(Index index, IndexSettingsService indexSettingsService,
      Environment env, @Assisted String name, @Assisted Settings settings) {

    super(index, indexSettingsService.getSettings(), name, settings);
    analyzer = new BoAnalyzer();
  }

  @Override public BoAnalyzer get() {
    return this.analyzer;
  }
}
