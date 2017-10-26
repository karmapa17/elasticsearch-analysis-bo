package org.karmapa.analyzer.lucene;

import org.apache.lucene.analysis.util.CharTokenizer;
import org.apache.lucene.util.AttributeFactory;

import java.io.IOException;
import java.io.Reader;

public final class BoTokenizer extends CharTokenizer {

  public BoTokenizer() {
  }

  public BoTokenizer(AttributeFactory factory) {
    super(factory);
  }

  @Override
  protected boolean isTokenChar(int c) {
    // tibetan delimiter [།་ ]
    return (! Character.isWhitespace(c)) && (3853 != c) && (3851 != c);
  }
}
