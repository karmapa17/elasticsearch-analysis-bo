package org.elasticsearch.plugin.analysis.bo;

import org.elasticsearch.common.inject.AbstractModule;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.Module;
import org.elasticsearch.common.logging.ESLogger;
import org.elasticsearch.common.logging.ESLoggerFactory;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.index.analysis.AnalysisModule;
import org.elasticsearch.index.analysis.BoAnalysisBinderProcessor;
import org.elasticsearch.indices.analysis.BoIndicesAnalysisModule;
import org.elasticsearch.plugins.Plugin;

import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import java.util.logging.Logger;

import static java.rmi.Naming.bind;

public class AnalysisBoPlugin extends Plugin {

  public static String PLUGIN_NAME = "analysis-bo";

  @Override public String name() {
    return PLUGIN_NAME;
  }

  @Override public String description() {
    return PLUGIN_NAME;
  }

  @Override
  public Collection<Module> nodeModules() {
    return Collections.<Module>singletonList(new BoIndicesAnalysisModule());
  }

  public void onModule(AnalysisModule module) {
    module.addProcessor(new BoAnalysisBinderProcessor());
  }
}
