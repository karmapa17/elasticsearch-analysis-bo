package org.karmapa.analyzer.lucene;

import org.apache.lucene.analysis.Tokenizer;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;

import java.io.IOException;
import java.io.Reader;

public final class BoTokenizer extends Tokenizer {

  public BoTokenizer() {
    super();
  }

  @Override
  public boolean incrementToken() throws IOException {
    return true;
  }

  @Override
  public void reset() throws IOException {
    super.reset();
  }

  @Override
  public final void end() throws IOException {
    super.end();
  }
}
