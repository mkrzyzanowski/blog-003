package com.automatingguy;

import com.cognifide.qa.bb.logging.ReporterModule;
import com.cognifide.qa.bb.modules.CoreModule;
import com.google.inject.AbstractModule;

public class GuiceModule extends AbstractModule {
  @Override
  protected void configure() {
    if (System.getProperty("configuration.paths") == null) {
      System.setProperty("configuration.paths", "src/main/config/dev;src/main/config/common");
    }
    install(new CoreModule());
    install(new ReporterModule());
  }
}
