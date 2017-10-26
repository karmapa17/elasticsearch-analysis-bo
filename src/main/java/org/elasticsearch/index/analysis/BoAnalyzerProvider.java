package org.elasticsearch.index.analysis;

import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.index.IndexSettings;
import org.karmapa.analyzer.lucene.BoAnalyzer;

public class BoAnalyzerProvider extends AbstractIndexAnalyzerProvider<BoAnalyzer> {

    private final BoAnalyzer analyzer;

    public BoAnalyzerProvider(IndexSettings indexSettings, Environment env, String name, Settings settings) {
        super(indexSettings, name, settings);
        analyzer = new BoAnalyzer();
    }

    @Override public BoAnalyzer get() {
        return this.analyzer;
    }
}
